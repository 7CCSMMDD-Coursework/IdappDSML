/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.xtext.example.mydsl.myDsl.Contract;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
	/*
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
		
		if (premiumIncrease < 0.0 || premiumIncrease > 1.0) {
			error("Premium increase needs to be a value between 0.0 and 1.0",
					MyDslPackage.Literals.CONTRACT__NAME, INVALID_PREMIUM_INCREASE);
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
	*/ 
	
	//iterate over customers and sum Cost and Claim Participance percentages. Check they are equal to 100% 
	
	//if contract type is personal then check that there exists only one customer - default to owner in the generator
	
	//if contract type is family. Then there needs to be one owner and one or more beneficiaries. Sum of Claims for beneficiaries has to be 100%
	
	//if contact type is pool then there should be more than one owners and their sum of claims has to be 100%
}
