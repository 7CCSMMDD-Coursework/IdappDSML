// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.7.0 <0.9.0;

contract Family {

    address payable owner = payable(0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2);
    address payable company = payable(0x5B38Da6a701c568545dCfcB03FcB875f56beddC4);
    address payable[] beneficiaries;

    uint256 private paymentPeriod = 30 days;
    uint256 private premiumIncrease = 5; //percent but Fixed Points arent supported yet
    uint256 private claimAmount = 1 ether;
    uint256 private premiumAmount = 0.1 ether;
    uint256 private lastPayment;
    uint256 public numClaims;
    
    enum ContractState { ACTIVE, INACTIVE, BLOCKED }
    ContractState public contractState;

    constructor() {
        
        beneficiaries.push(payable(0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db));
        beneficiaries.push(payable(0x78731D3Ca6b7E34aC0F824c42a7cC18A495cabaB));
        
        numClaims = 0;
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
        
        for (uint i = 0; i < beneficiaries.length; i++) {
            beneficiaries[i].transfer(claimAmount / beneficiaries.length);
        }
       
        numClaims++;
    }
    
    
    function pay() public payable {
        
        if(lastPayment + paymentPeriod < block.timestamp){
            contractState = ContractState.BLOCKED;
        }
        
        require(contractState != ContractState.BLOCKED, "The contract has been blocked due to late payment.");
        
        require(msg.sender == owner, "Only the contract owner can pay");
        
        require(msg.value == getPremium(), "Incorrect premium. Invoke the getPremium function to see the required amount");
        
        company.transfer(msg.value);
    
        contractState = ContractState.ACTIVE;
    
        lastPayment = block.timestamp;
    }
    
    
    function getPremium() public view returns (uint256 premium) {
        return ((premiumIncrease * numClaims)/100 + 1) * premiumAmount;
    }
    
    function getClaim() public view returns (uint256 the_claim) {
        return claimAmount;
    }
    
}