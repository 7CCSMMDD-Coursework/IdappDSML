/*
 * generated by Xtext 2.24.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Contract";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleContract
entryRuleContract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContractRule()); }
	iv_ruleContract=ruleContract
	{ $current=$iv_ruleContract.current; }
	EOF;

// Rule Contract
ruleContract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Contract'
		{
			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContractAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContractRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='ParticipatingParties'
		{
			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getParticipatingPartiesKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContractAccess().getCustomerCustomerParserRuleCall_5_0());
				}
				lv_customer_5_0=ruleCustomer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContractRule());
					}
					set(
						$current,
						"customer",
						lv_customer_5_0,
						"org.xtext.example.mydsl.MyDsl.Customer");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getContractAccess().getCompanyCompanyParserRuleCall_6_0());
				}
				lv_company_6_0=ruleCompany
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContractRule());
					}
					set(
						$current,
						"company",
						lv_company_6_0,
						"org.xtext.example.mydsl.MyDsl.Company");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContractAccess().getInsurableObjectsInsurableObjectsParserRuleCall_8_0());
				}
				lv_insurableObjects_8_0=ruleInsurableObjects
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContractRule());
					}
					set(
						$current,
						"insurableObjects",
						lv_insurableObjects_8_0,
						"org.xtext.example.mydsl.MyDsl.InsurableObjects");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='Terms'
		{
			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getTermsKeyword_9());
		}
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_10());
		}
		otherlv_11='Premium'
		{
			newLeafNode(otherlv_11, grammarAccess.getContractAccess().getPremiumKeyword_11());
		}
		otherlv_12='='
		{
			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getEqualsSignKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContractAccess().getPremiumREALParserRuleCall_13_0());
				}
				lv_premium_13_0=ruleREAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContractRule());
					}
					set(
						$current,
						"premium",
						lv_premium_13_0,
						"org.xtext.example.mydsl.MyDsl.REAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='PremiumIncrease'
		{
			newLeafNode(otherlv_14, grammarAccess.getContractAccess().getPremiumIncreaseKeyword_14());
		}
		otherlv_15='='
		{
			newLeafNode(otherlv_15, grammarAccess.getContractAccess().getEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContractAccess().getIncreaseREALParserRuleCall_16_0());
				}
				lv_increase_16_0=ruleREAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContractRule());
					}
					set(
						$current,
						"increase",
						lv_increase_16_0,
						"org.xtext.example.mydsl.MyDsl.REAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17='Claim'
		{
			newLeafNode(otherlv_17, grammarAccess.getContractAccess().getClaimKeyword_17());
		}
		otherlv_18='='
		{
			newLeafNode(otherlv_18, grammarAccess.getContractAccess().getEqualsSignKeyword_18());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContractAccess().getClaimREALParserRuleCall_19_0());
				}
				lv_claim_19_0=ruleREAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContractRule());
					}
					set(
						$current,
						"claim",
						lv_claim_19_0,
						"org.xtext.example.mydsl.MyDsl.REAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_20='PaymentPeriod'
		{
			newLeafNode(otherlv_20, grammarAccess.getContractAccess().getPaymentPeriodKeyword_20());
		}
		otherlv_21='='
		{
			newLeafNode(otherlv_21, grammarAccess.getContractAccess().getEqualsSignKeyword_21());
		}
		(
			(
				lv_period_22_0=RULE_INT
				{
					newLeafNode(lv_period_22_0, grammarAccess.getContractAccess().getPeriodINTTerminalRuleCall_22_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContractRule());
					}
					setWithLastConsumed(
						$current,
						"period",
						lv_period_22_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_23());
		}
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_24());
		}
	)
;

// Entry rule entryRuleCustomer
entryRuleCustomer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCustomerRule()); }
	iv_ruleCustomer=ruleCustomer
	{ $current=$iv_ruleCustomer.current; }
	EOF;

// Rule Customer
ruleCustomer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CustomerAddress'
		{
			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerAddressKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getCustomerAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCustomerAccess().getAddressEStringParserRuleCall_2_0());
				}
				lv_address_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCustomerRule());
					}
					set(
						$current,
						"address",
						lv_address_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCompany
entryRuleCompany returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompanyRule()); }
	iv_ruleCompany=ruleCompany
	{ $current=$iv_ruleCompany.current; }
	EOF;

// Rule Company
ruleCompany returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CompanyAddress'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyAddressKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getCompanyAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompanyAccess().getAddressEStringParserRuleCall_2_0());
				}
				lv_address_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompanyRule());
					}
					set(
						$current,
						"address",
						lv_address_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInsurableObjects
entryRuleInsurableObjects returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsurableObjectsRule()); }
	iv_ruleInsurableObjects=ruleInsurableObjects
	{ $current=$iv_ruleInsurableObjects.current; }
	EOF;

// Rule InsurableObjects
ruleInsurableObjects returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InsurableObjects'
		{
			newLeafNode(otherlv_0, grammarAccess.getInsurableObjectsAccess().getInsurableObjectsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getInsurableObjectsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_2_0());
				}
				lv_objects_2_0=ruleInsurableObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInsurableObjectsRule());
					}
					add(
						$current,
						"objects",
						lv_objects_2_0,
						"org.xtext.example.mydsl.MyDsl.InsurableObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getInsurableObjectsAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_3_1_0());
					}
					lv_objects_4_0=ruleInsurableObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInsurableObjectsRule());
						}
						add(
							$current,
							"objects",
							lv_objects_4_0,
							"org.xtext.example.mydsl.MyDsl.InsurableObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getInsurableObjectsAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInsurableObject
entryRuleInsurableObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsurableObjectRule()); }
	iv_ruleInsurableObject=ruleInsurableObject
	{ $current=$iv_ruleInsurableObject.current; }
	EOF;

// Rule InsurableObject
ruleInsurableObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ObjectName'
		{
			newLeafNode(otherlv_0, grammarAccess.getInsurableObjectAccess().getObjectNameKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getInsurableObjectAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInsurableObjectAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInsurableObjectRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getREALRule()); }
	iv_ruleREAL=ruleREAL
	{ $current=$iv_ruleREAL.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
