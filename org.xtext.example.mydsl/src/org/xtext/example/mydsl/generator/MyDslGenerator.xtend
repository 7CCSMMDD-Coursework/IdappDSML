/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Contract
import org.xtext.example.mydsl.myDsl.ContractCancellationTerm
import org.xtext.example.mydsl.myDsl.ClaimReductionTerm
import org.xtext.example.mydsl.myDsl.PremiumIncreaseTerm
import org.xtext.example.mydsl.myDsl.ContractType
import org.xtext.example.mydsl.myDsl.Coverage

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as Contract
		fsa.generateFile(resource.targetFileName, model.doGenerate)
	}
	
	def String getTargetFileName(Resource resource) {
		val originalFileName = resource.URI.lastSegment;
		originalFileName.substring(0, originalFileName.indexOf(".")) + ".sol";
	}
	
	def String doGenerate(Contract contract) {
		'''
		// SPDX-License-Identifier: GPL-3.0
		pragma solidity >=0.7.0 <0.9.0;
		
		contract «contract.name» {
			
			«val companyAddress = contract.company.name»
			«val insurableObjects = contract.insurableObjects»
			«val premium = contract.paymentTerm.premium»
			«val premiumIncrease = contract.paymentTerm.increase»
			«val claim = contract.claimTerm.claim»
			«val paymentPeriod = contract.paymentTerm.period»
			
			«contract.participants»
			
			address payable company = payable(«companyAddress»);			
						
			uint256 private paymentPeriod = «paymentPeriod» days;
			uint256 private premiumIncrease = «premiumIncrease»;			
			uint256 private claimAmount = «claim» ether;			
			uint256 private premiumAmount = «premium» ether;			
			uint256 private lastPayment;
			uint256 public numClaims;			
			
			enum ContractState { ACTIVE, INACTIVE, BLOCKED }
			ContractState public contractState;
						
			«contract.generateConstructor»
			
			«contract.generatePremiumPaymentFunction»
						
			«contract.generateClaimFunction»
			
			«IF ContractType.POOL.equals(contract.type)»
				«generateGetPremiumPool»
				
				«generateGetTotalPremium»
			«ELSE» 
				«generateGetPremium»			
			«ENDIF»
			
			«generateGetClaim()»
			
		}
		'''
	}


	def String getParticipants(Contract contract){
				
		val contractType = contract.type;
		var result = "";
		
		if(ContractType.PERSONAL.equals(contractType)){		
			result = 
			'''
				address payable customer = payable(«contract.customers.get(0).name»);
			'''
		}
		
		if(ContractType.FAMILY.equals(contractType)){	
			result = 
			'''
				address payable owner = payable(«contract.customers.get(0).name»);		
				address payable[] beneficiaries;
			'''
			
		}
		
		if(ContractType.POOL.equals(contractType)){
			result = 
			'''
				address payable[] customers;			    
				mapping(address => uint256) private participations;
				uint256 private totalPremiumReleased;
			'''			
		}
		
		return result;				
	}


	dispatch def String handleViolationTerms(ContractCancellationTerm violationTerm){
		
		'''
		«"    "»if(lastPayment + paymentPeriod < block.timestamp) {
				contractState = ContractState.BLOCKED;
			}«"\n\n"»
			require(contractState != ContractState.BLOCKED, "The contract has been blocked due to late payment.");
		'''
	}
	
	dispatch def String handleViolationTerms(ClaimReductionTerm violationTerm){
		
		'''
		«"    "»if(lastPayment + paymentPeriod < block.timestamp) {
				claimAmount = claimAmount * (100 - «violationTerm.claimReduction»)/100;
			}«"\n\n"»
		'''
	}
	
	dispatch def String handleViolationTerms(PremiumIncreaseTerm violationTerm){
		
		'''
		«"    "»if(lastPayment + paymentPeriod < block.timestamp) {
				premiumAmount = premiumAmount * (100 + «violationTerm.premiumIncrease»)/100;
			}«"\n\n"»
		'''
	}


	def String generateConstructor(Contract contract){
		
		val signature_start = "constructor() {\n\n"
		val signature_end = "\n}\n"	
		
		var body = 	
			switch(contract.type) {		 
				case ContractType.PERSONAL : getContructorPersonal(contract)
				case ContractType.FAMILY : getContructorFamily(contract)					
				case ContractType.POOL : getContructorPool(contract)					
				default : ""			
			}
		
		return signature_start.concat(body).concat(signature_end);
	}
	
	
	def String generatePremiumPaymentFunction(Contract contract){
					
		val signature_start = "function pay() public payable {\n\n"
		val signature_end = "\n}\n"	
		
		val violationTerms = contract.violationTerms.map[handleViolationTerms].join("\n")
		
		var body = 	
			switch(contract.type) {		 
				case ContractType.PERSONAL : generatePremiumFunctionPersonal(contract)
				case ContractType.FAMILY : generatePremiumFunctionFamily(contract)					
				case ContractType.POOL : generatePremiumFunctionPool(contract)					
				default : ""			
			}
		
		return signature_start.concat(violationTerms).concat(body).concat(signature_end);
	}
	
	def String generateClaimFunction(Contract contract){
		
		val signature_start = "function claim() public payable {\n\n"
		val signature_end = "\n}\n"	
		
		var body = 	
			switch(contract.type) {		 
				case ContractType.PERSONAL : generateClaimFunctionPersonal(contract)
				case ContractType.FAMILY : generateClaimFunctionFamily(contract)					
				case ContractType.POOL : generateClaimFunctionPool(contract)					
				default : ""			
			}
		
		return signature_start.concat(body).concat(signature_end);
	}
	
	def String getContructorPersonal(Contract contract){
		'''
		«"    "»numClaims = 0;
		«"    "»lastPayment = block.timestamp;
		«"    "»contractState = ContractState.INACTIVE;					
		'''
	}
	
	def String getContructorFamily(Contract contract){
		
		var result =
		'''
		«"    "»numClaims = 0;
		«"    "»lastPayment = block.timestamp;
		«"    "»contractState = ContractState.INACTIVE;
		
		«FOR customer: contract.customers.filter[coverage.equals(Coverage.BENEFICIARY)]»
			«"    "»beneficiaries.push(payable(«customer.name»));
		«ENDFOR»
		'''		
		
		return result;
	}
	
	def String getContructorPool(Contract contract){
		
		var result =
		'''
		«"    "»numClaims = 0;
		«"    "»totalPremiumReleased = 0;
		«"    "»lastPayment = block.timestamp;
		«"    "»contractState = ContractState.INACTIVE;
		
        «FOR i : 0 ..< contract.customers.size»
			«"    "»customers.push(payable(«contract.customers.get(i).name»));
			«"    "»participations[customers[«i»]] = «contract.customers.get(i).participation»;
   		«ENDFOR»
		'''
		
		return result;
	}
	
	
	
	def String generateRequirement(String left, String operator, String right, String error_message){
		
		'''
		«"    "»require(«left» «operator» «right», "«error_message»");
		'''
	}
	

	def String generateTransfer(String address, String value) {
		
		'''
		«"    "»«address».transfer(«value»);
		'''
	}

	def String statementActivateContract() {
		
		'''
		«"    "»contractState = ContractState.ACTIVE;
		'''
	}
	
	def String generatePremiumFunctionPersonal(Contract contract){
		
		'''
		«generateRequirement("msg.sender", "==", "customer", "Only the contract owner can pay")»

		«generateRequirement("msg.value", "==", "getPremium()", "Incorrect premium. Invoke the getPremium function to see the required amount")»

		«generateTransfer("company", "msg.value")»
		
		«statementActivateContract»

		«"    "»lastPayment = block.timestamp;				
		'''
	}
	
	def String generatePremiumFunctionFamily(Contract contract){

		'''		        
		«generateRequirement("msg.sender", "==", "owner", "Only the contract owner can pay")»
		
		«generateRequirement("msg.value", "==", "getPremium()", "Incorrect premium. Invoke the getPremium function to see the required amount")»
		
		«generateTransfer("company", "msg.value")»

		«statementActivateContract»

		«"    "»lastPayment = block.timestamp;				
		'''
	}
	
	def String generatePremiumFunctionPool(Contract contract){
		
		'''		        
		«generateRequirement("participations[msg.sender]", ">", "0", "This address is not a contract participant")»

		«generateRequirement("msg.value", "==", "getPremium()", "Incorrect premium. Invoke the getPremium function to see the required amount")»
		
		«"    "»totalPremiumReleased += msg.value;
		
		«"    "»if(totalPremiumReleased == getTotalPremium()){
			«generateTransfer("company", "totalPremiumReleased")»
			«statementActivateContract»
				lastPayment = block.timestamp;
				totalPremiumReleased = 0;
			}
		'''
	}
		
	def String generateClaimFunctionPersonal(Contract contract){
		
		'''
		«generateRequirement("contractState", "==", "ContractState.ACTIVE", "Premium payment required. Only an active contract can be claimed")»
		
		«generateRequirement("msg.sender", "==", "company", "Claims can only be initiated by the insurer")»
		
		«generateRequirement("msg.value", "==", "claimAmount", "Incorrect claim. Invoke the getClaim function to see the required amount")»
		
		«generateTransfer("customer", "claimAmount")»
		
		«"    "»numClaims++;
		'''
	}
	
	def String generateClaimFunctionFamily(Contract contract){

		'''
		«generateRequirement("contractState", "==", "ContractState.ACTIVE", "Premium payment required. Only an active contract can be claimed")»
		
		«generateRequirement("msg.sender", "==", "company", "Claims can only be initiated by the insurer")»
		
		«generateRequirement("msg.value", "==", "claimAmount", "Incorrect claim. Invoke the getClaim function to see the required amount")»
		
		«"    "»for (uint i = 0; i < beneficiaries.length; i++) {
			«generateTransfer("beneficiaries[i]", "claimAmount / beneficiaries.length")»
		«"    "»}

		«"    "»numClaims++;
		'''
	}
	
	def String generateClaimFunctionPool(Contract contract){
		
		'''
		«generateRequirement("contractState", "==", "ContractState.ACTIVE", "Premium payment required. Only an active contract can be claimed")»

		«generateRequirement("msg.sender", "==", "company", "Claims can only be initiated by the insurer")»
		
		«generateRequirement("msg.value", "==", "claimAmount", "Incorrect claim. Invoke the getClaim function to see the required amount")»

		«"    "»for (uint i = 0; i < customers.length; i++) {
				address payable customer = customers[i];
			«generateTransfer("customer", "claimAmount * participations[customer]/100")»
			}

		«"    "»numClaims++;
		'''
	}
	
	def String generateGetPremium(){
		'''
		function getPremium() public view returns (uint256 premium) {
			return ((premiumIncrease * numClaims)/100 + 1) * premiumAmount;
		}
		'''
	}
	
	def String generateGetClaim(){
		'''
		function getClaim() public view returns (uint256 the_claim) {
			return claimAmount;
		}
		'''
	}
	
	
	def String generateGetTotalPremium(){
		'''
		function getTotalPremium() private view returns (uint256 premium) {
			return ((premiumIncrease * numClaims)/100 + 1) * premiumAmount;
		}
		'''		
	}
	
	
	def String generateGetPremiumPool(){
		'''
		function getPremium() public view returns (uint256 premium) {
		«generateRequirement("participations[msg.sender]", ">", "0", "This address is not a contract participant")»
			return getTotalPremium() * participations[msg.sender]/100;
		}
		'''	
	}
}
