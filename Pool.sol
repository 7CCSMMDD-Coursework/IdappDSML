// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.7.0 <0.9.0;

contract Pool {

    address payable company = payable(0x5B38Da6a701c568545dCfcB03FcB875f56beddC4);
    
    address payable[] customers;
    
    mapping(address => uint256) private participations;
    uint256 private totalPremiumReleased;

    uint256 private paymentPeriod = 30 days;
    uint256 private premiumIncrease = 5; //percent but Fixed Points arent supported yet
    uint256 private claimAmount = 1 ether;
    uint256 private premiumAmount = 0.1 ether;
    uint256 private lastPayment;
    uint256 public numClaims;
    
    enum ContractState { ACTIVE, INACTIVE, BLOCKED }
    ContractState public contractState;

    constructor() {
        
        customers.push(payable(0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db));
        participations[customers[0]] = 40;
        
        customers.push(payable(0x78731D3Ca6b7E34aC0F824c42a7cC18A495cabaB));
        participations[customers[1]] = 60;
   
        numClaims = 0;
        totalPremiumReleased = 0;
        lastPayment = block.timestamp;
        contractState = ContractState.INACTIVE;
    }
    
    function claim() public payable {
        
        if(lastPayment + paymentPeriod < block.timestamp){
            contractState = ContractState.BLOCKED;
        }
        
        require(contractState == ContractState.ACTIVE, "Premium payment required. Only an active contract can be claimed");
        
        require(msg.sender == company, "Claims can only be initiated by the insurer");
        
        require(msg.value == claimAmount, "Incorrect claim. Invoke the getClaim function to see the required amount");
        
        for (uint i = 0; i < customers.length; i++) {
            address payable customer = customers[i];
            customer.transfer(claimAmount * participations[customer]/100);
        }
       
        numClaims++;
    }
    
    
    function pay() public payable {
        
        if(lastPayment + paymentPeriod < block.timestamp){
            contractState = ContractState.BLOCKED;
        }
        
        require(contractState != ContractState.BLOCKED, "The contract has been blocked due to late payment.");
        
        require(participations[msg.sender] > 0, "This address is not a contract participant");
        
        require(msg.value == getPremium(), "Incorrect premium. Invoke the getPremium function to see the required amount");
        
        totalPremiumReleased += msg.value;
        
        if(totalPremiumReleased == getTotalPremium()){
            company.transfer(totalPremiumReleased);
            contractState = ContractState.ACTIVE;
            lastPayment = block.timestamp;
            totalPremiumReleased = 0;
        }
    }
    
    
    function getPremium() public view returns (uint256 premium) {
        
        require(participations[msg.sender] > 0, "This address is not a contract participant");

        return getTotalPremium() * participations[msg.sender]/100;
    }
    
    function getTotalPremium() private view returns (uint256 premium) {
        return ((premiumIncrease * numClaims)/100 + 1) * premiumAmount;
    }
    
    function getClaim() public view returns (uint256 the_claim) {
        return claimAmount;
    }
    
}