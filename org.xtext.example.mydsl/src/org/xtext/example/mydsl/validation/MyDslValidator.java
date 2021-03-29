/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.validation;

import java.util.List;
import java.util.stream.Stream;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.xtext.example.mydsl.myDsl.Contract;
import org.xtext.example.mydsl.myDsl.ContractType;
import org.xtext.example.mydsl.myDsl.Coverage;
import org.xtext.example.mydsl.myDsl.Customer;
import org.xtext.example.mydsl.myDsl.InsurableObject;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
	public static final String INVALID_CUSTOMER_PARTICIPATION = 
			"Invalid customer participation in contract; total must be 100%";
	
	public static final String INVALID_CLAIM = "claim lower than premium";
	public static final String INVALID_PREMIUM_INCREASE = "invalid premium increase";
	public static final String INVALID_PAYMENT_PERIOD = "invalid payment period";
	
	@Check(CheckType.NORMAL)
	public void checkClaimLargerThanPremium(Contract contract) {
		float claim = contract.getClaimTerm().getClaim();
		float premium = contract.getPaymentTerm().getPremium();
		
		if (premium > claim) {
			error("Customer claim needs to be greater than premium paid",
					MyDslPackage.Literals.CLAIM_TERM__CLAIM, INVALID_CLAIM);
		}
	}
	
	
	@Check(CheckType.NORMAL)
	public void checkIncreaseIsBetweenZeroAndOne(Contract contract) {
		float premiumIncrease = contract.getPaymentTerm().getIncrease();
		
		if (premiumIncrease < 0.0 || premiumIncrease > 100.0) {
			error("Premium increase needs to be a value between 0.0 and 100.0",
					MyDslPackage.Literals.PREMIUM_INCREASE_TERM__PREMIUM_INCREASE, INVALID_PREMIUM_INCREASE);
		}
	}
	
	
	@Check(CheckType.NORMAL)
	public void checkPremiumPeriodIsNotZero(Contract contract) {
		int premiumPeriod = contract.getPaymentTerm().getPeriod();
		
		if (premiumPeriod <= 0) {
			error("Premium period needs to be greater than 0",
					MyDslPackage.Literals.PAYMENT_TERM__PERIOD, INVALID_PAYMENT_PERIOD);
		}
	}
	 
	
	/**
	 * Iterate over customers and sum participation percentages. Check they are equal to 100%.
	 * 
	 * Only applicable to pool contracts.
	 * 
	 * @param contract
	 */
	@Check(CheckType.NORMAL)
	public void checkCustomerParticipationIsOneHundredProcentForPoolContract(Contract contract) {
		if (ContractType.POOL.equals(contract.getType())) {
			
			double totalCustomerParticipation = contract.getCustomers()
					.stream()
					.mapToDouble(c -> c.getParticipation())
					.sum(); 
							
			if (totalCustomerParticipation != 100.0) 
				error("Invalid customer participation; must be 100%; but is " + totalCustomerParticipation, null);
			
		}
	}
	
	
	/**
	 * if contract type is personal then check that there exists only one customer.
	 * 
	 * His participation is optional in this case and should default to 100%
	 * 
	 *  @param contract
	 */
	@Check(CheckType.NORMAL)
	public void checkParticipationTypeOptionalAndFullForPersonalContract(Contract contract) {
		if (contract.getType() == ContractType.PERSONAL) 
			if (contract.getCustomers().size() != 1) 
				error("Personal contract needs to have only one customer", null);								
	}
	

	
	/**
	 * For family and personal contracts, participation is automatically calculated
	 * Throw a warning if a custom value is provided
	 * 
	 * @param contract
	 */
	@Check(CheckType.NORMAL)
	public void checkForUnnecessaryParticipations(Contract contract) {
		
		if (ContractType.FAMILY.equals(contract.getType()) || ContractType.PERSONAL.equals(contract.getType())) 						
			for (Customer c : contract.getCustomers()) 
				if (c.getParticipation() != 0.0) 
					warning("No participation needs to be specified for family contracts;"
							+ "Sum is split equally among the beneficiaries", MyDslPackage.Literals.CONTRACT__CUSTOMERS);					
	}
	
	
	
	/**
	 * If contract type is family. Then there needs to be ONE owner and one or more beneficiaries.
	 * 
	 * No participation will be specified. We will just divide the claim among the beneficiaries.
	 * 
	 * @param contract
	 */
	@Check(CheckType.NORMAL)
	public void checkFamilyContractCoverage(Contract contract) {

		if(ContractType.FAMILY.equals(contract.getType())){
			
			//beneficiary is the default value so this will always pass.
			boolean benExists = contract.getCustomers()
					.stream()
					.anyMatch(c -> Coverage.BENEFICIARY.equals(c.getCoverage()));
			
			if(!benExists)
				error("Family Contracts need to have at least one beneficiary", null);
			
			
			int ownerCount = (int) contract.getCustomers()
					.stream()
					.filter(c -> Coverage.OWNER.equals(c.getCoverage()))
					.count();
			
			if(ownerCount != 1)
				error("Family Contracts need to have at least one owner", null);
			
		}		
	}
	
	
	/**
	 * If contract type is pool then there should not exist and beneficiaries
	 * 
	 * @param contract
	 */
	@Check(CheckType.NORMAL)
	public void checkPoolOnlyHasOwners(Contract contract) {

		if(ContractType.POOL.equals(contract.getType())){
						
			 int ownerCount = (int)contract.getCustomers()
					.stream()
					.filter(c -> Coverage.OWNER.equals(c.getCoverage()))
					.count();
			
			 if(ownerCount != contract.getCustomers().size())
				 error("Pool contracts should only consist of owners", null);		
		}		
	}

}
