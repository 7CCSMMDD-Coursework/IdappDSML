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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Contract'", "'{'", "'ParticipatingParties'", "'}'", "'Terms'", "'Premium'", "'='", "'PremiumIncrease'", "'Claim'", "'PaymentPeriod'", "'CustomerAddress'", "'CompanyAddress'", "'InsurableObjects'", "','", "'ObjectName'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleContract"
    // InternalMyDsl.g:64:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalMyDsl.g:64:49: (iv_ruleContract= ruleContract EOF )
            // InternalMyDsl.g:65:2: iv_ruleContract= ruleContract EOF
            {
             newCompositeNode(grammarAccess.getContractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;

             current =iv_ruleContract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalMyDsl.g:71:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ParticipatingParties' otherlv_4= '{' ( (lv_customer_5_0= ruleCustomer ) ) ( (lv_company_6_0= ruleCompany ) ) otherlv_7= '}' ( (lv_insurableObjects_8_0= ruleInsurableObjects ) ) otherlv_9= 'Terms' otherlv_10= '{' otherlv_11= 'Premium' otherlv_12= '=' ( (lv_premium_13_0= ruleREAL ) ) otherlv_14= 'PremiumIncrease' otherlv_15= '=' ( (lv_increase_16_0= ruleREAL ) ) otherlv_17= 'Claim' otherlv_18= '=' ( (lv_claim_19_0= ruleREAL ) ) otherlv_20= 'PaymentPeriod' otherlv_21= '=' ( (lv_period_22_0= RULE_INT ) ) otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_period_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_customer_5_0 = null;

        EObject lv_company_6_0 = null;

        EObject lv_insurableObjects_8_0 = null;

        AntlrDatatypeRuleToken lv_premium_13_0 = null;

        AntlrDatatypeRuleToken lv_increase_16_0 = null;

        AntlrDatatypeRuleToken lv_claim_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ParticipatingParties' otherlv_4= '{' ( (lv_customer_5_0= ruleCustomer ) ) ( (lv_company_6_0= ruleCompany ) ) otherlv_7= '}' ( (lv_insurableObjects_8_0= ruleInsurableObjects ) ) otherlv_9= 'Terms' otherlv_10= '{' otherlv_11= 'Premium' otherlv_12= '=' ( (lv_premium_13_0= ruleREAL ) ) otherlv_14= 'PremiumIncrease' otherlv_15= '=' ( (lv_increase_16_0= ruleREAL ) ) otherlv_17= 'Claim' otherlv_18= '=' ( (lv_claim_19_0= ruleREAL ) ) otherlv_20= 'PaymentPeriod' otherlv_21= '=' ( (lv_period_22_0= RULE_INT ) ) otherlv_23= '}' otherlv_24= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Contract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ParticipatingParties' otherlv_4= '{' ( (lv_customer_5_0= ruleCustomer ) ) ( (lv_company_6_0= ruleCompany ) ) otherlv_7= '}' ( (lv_insurableObjects_8_0= ruleInsurableObjects ) ) otherlv_9= 'Terms' otherlv_10= '{' otherlv_11= 'Premium' otherlv_12= '=' ( (lv_premium_13_0= ruleREAL ) ) otherlv_14= 'PremiumIncrease' otherlv_15= '=' ( (lv_increase_16_0= ruleREAL ) ) otherlv_17= 'Claim' otherlv_18= '=' ( (lv_claim_19_0= ruleREAL ) ) otherlv_20= 'PaymentPeriod' otherlv_21= '=' ( (lv_period_22_0= RULE_INT ) ) otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Contract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ParticipatingParties' otherlv_4= '{' ( (lv_customer_5_0= ruleCustomer ) ) ( (lv_company_6_0= ruleCompany ) ) otherlv_7= '}' ( (lv_insurableObjects_8_0= ruleInsurableObjects ) ) otherlv_9= 'Terms' otherlv_10= '{' otherlv_11= 'Premium' otherlv_12= '=' ( (lv_premium_13_0= ruleREAL ) ) otherlv_14= 'PremiumIncrease' otherlv_15= '=' ( (lv_increase_16_0= ruleREAL ) ) otherlv_17= 'Claim' otherlv_18= '=' ( (lv_claim_19_0= ruleREAL ) ) otherlv_20= 'PaymentPeriod' otherlv_21= '=' ( (lv_period_22_0= RULE_INT ) ) otherlv_23= '}' otherlv_24= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'Contract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ParticipatingParties' otherlv_4= '{' ( (lv_customer_5_0= ruleCustomer ) ) ( (lv_company_6_0= ruleCompany ) ) otherlv_7= '}' ( (lv_insurableObjects_8_0= ruleInsurableObjects ) ) otherlv_9= 'Terms' otherlv_10= '{' otherlv_11= 'Premium' otherlv_12= '=' ( (lv_premium_13_0= ruleREAL ) ) otherlv_14= 'PremiumIncrease' otherlv_15= '=' ( (lv_increase_16_0= ruleREAL ) ) otherlv_17= 'Claim' otherlv_18= '=' ( (lv_claim_19_0= ruleREAL ) ) otherlv_20= 'PaymentPeriod' otherlv_21= '=' ( (lv_period_22_0= RULE_INT ) ) otherlv_23= '}' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContractAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getParticipatingPartiesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:114:3: ( (lv_customer_5_0= ruleCustomer ) )
            // InternalMyDsl.g:115:4: (lv_customer_5_0= ruleCustomer )
            {
            // InternalMyDsl.g:115:4: (lv_customer_5_0= ruleCustomer )
            // InternalMyDsl.g:116:5: lv_customer_5_0= ruleCustomer
            {

            					newCompositeNode(grammarAccess.getContractAccess().getCustomerCustomerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_customer_5_0=ruleCustomer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"customer",
            						lv_customer_5_0,
            						"org.xtext.example.mydsl.MyDsl.Customer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:133:3: ( (lv_company_6_0= ruleCompany ) )
            // InternalMyDsl.g:134:4: (lv_company_6_0= ruleCompany )
            {
            // InternalMyDsl.g:134:4: (lv_company_6_0= ruleCompany )
            // InternalMyDsl.g:135:5: lv_company_6_0= ruleCompany
            {

            					newCompositeNode(grammarAccess.getContractAccess().getCompanyCompanyParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_company_6_0=ruleCompany();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"company",
            						lv_company_6_0,
            						"org.xtext.example.mydsl.MyDsl.Company");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:156:3: ( (lv_insurableObjects_8_0= ruleInsurableObjects ) )
            // InternalMyDsl.g:157:4: (lv_insurableObjects_8_0= ruleInsurableObjects )
            {
            // InternalMyDsl.g:157:4: (lv_insurableObjects_8_0= ruleInsurableObjects )
            // InternalMyDsl.g:158:5: lv_insurableObjects_8_0= ruleInsurableObjects
            {

            					newCompositeNode(grammarAccess.getContractAccess().getInsurableObjectsInsurableObjectsParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_insurableObjects_8_0=ruleInsurableObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"insurableObjects",
            						lv_insurableObjects_8_0,
            						"org.xtext.example.mydsl.MyDsl.InsurableObjects");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getTermsKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getContractAccess().getPremiumKeyword_11());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getEqualsSignKeyword_12());
            		
            // InternalMyDsl.g:191:3: ( (lv_premium_13_0= ruleREAL ) )
            // InternalMyDsl.g:192:4: (lv_premium_13_0= ruleREAL )
            {
            // InternalMyDsl.g:192:4: (lv_premium_13_0= ruleREAL )
            // InternalMyDsl.g:193:5: lv_premium_13_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getContractAccess().getPremiumREALParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_14);
            lv_premium_13_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"premium",
            						lv_premium_13_0,
            						"org.xtext.example.mydsl.MyDsl.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getContractAccess().getPremiumIncreaseKeyword_14());
            		
            otherlv_15=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getContractAccess().getEqualsSignKeyword_15());
            		
            // InternalMyDsl.g:218:3: ( (lv_increase_16_0= ruleREAL ) )
            // InternalMyDsl.g:219:4: (lv_increase_16_0= ruleREAL )
            {
            // InternalMyDsl.g:219:4: (lv_increase_16_0= ruleREAL )
            // InternalMyDsl.g:220:5: lv_increase_16_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getContractAccess().getIncreaseREALParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_15);
            lv_increase_16_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"increase",
            						lv_increase_16_0,
            						"org.xtext.example.mydsl.MyDsl.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getContractAccess().getClaimKeyword_17());
            		
            otherlv_18=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getContractAccess().getEqualsSignKeyword_18());
            		
            // InternalMyDsl.g:245:3: ( (lv_claim_19_0= ruleREAL ) )
            // InternalMyDsl.g:246:4: (lv_claim_19_0= ruleREAL )
            {
            // InternalMyDsl.g:246:4: (lv_claim_19_0= ruleREAL )
            // InternalMyDsl.g:247:5: lv_claim_19_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getContractAccess().getClaimREALParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_16);
            lv_claim_19_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"claim",
            						lv_claim_19_0,
            						"org.xtext.example.mydsl.MyDsl.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_20, grammarAccess.getContractAccess().getPaymentPeriodKeyword_20());
            		
            otherlv_21=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_21, grammarAccess.getContractAccess().getEqualsSignKeyword_21());
            		
            // InternalMyDsl.g:272:3: ( (lv_period_22_0= RULE_INT ) )
            // InternalMyDsl.g:273:4: (lv_period_22_0= RULE_INT )
            {
            // InternalMyDsl.g:273:4: (lv_period_22_0= RULE_INT )
            // InternalMyDsl.g:274:5: lv_period_22_0= RULE_INT
            {
            lv_period_22_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_period_22_0, grammarAccess.getContractAccess().getPeriodINTTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"period",
            						lv_period_22_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_23=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_23, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_23());
            		
            otherlv_24=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_24());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleCustomer"
    // InternalMyDsl.g:302:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalMyDsl.g:302:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalMyDsl.g:303:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalMyDsl.g:309:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'CustomerAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_address_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:315:2: ( (otherlv_0= 'CustomerAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:316:2: (otherlv_0= 'CustomerAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:316:2: (otherlv_0= 'CustomerAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) )
            // InternalMyDsl.g:317:3: otherlv_0= 'CustomerAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerAddressKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomerAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:325:3: ( (lv_address_2_0= ruleEString ) )
            // InternalMyDsl.g:326:4: (lv_address_2_0= ruleEString )
            {
            // InternalMyDsl.g:326:4: (lv_address_2_0= ruleEString )
            // InternalMyDsl.g:327:5: lv_address_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getAddressEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_address_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"address",
            						lv_address_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleCompany"
    // InternalMyDsl.g:348:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalMyDsl.g:348:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalMyDsl.g:349:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalMyDsl.g:355:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'CompanyAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_address_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:361:2: ( (otherlv_0= 'CompanyAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:362:2: (otherlv_0= 'CompanyAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:362:2: (otherlv_0= 'CompanyAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) ) )
            // InternalMyDsl.g:363:3: otherlv_0= 'CompanyAddress' otherlv_1= '=' ( (lv_address_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyAddressKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompanyAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:371:3: ( (lv_address_2_0= ruleEString ) )
            // InternalMyDsl.g:372:4: (lv_address_2_0= ruleEString )
            {
            // InternalMyDsl.g:372:4: (lv_address_2_0= ruleEString )
            // InternalMyDsl.g:373:5: lv_address_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getAddressEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_address_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					set(
            						current,
            						"address",
            						lv_address_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleInsurableObjects"
    // InternalMyDsl.g:394:1: entryRuleInsurableObjects returns [EObject current=null] : iv_ruleInsurableObjects= ruleInsurableObjects EOF ;
    public final EObject entryRuleInsurableObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsurableObjects = null;


        try {
            // InternalMyDsl.g:394:57: (iv_ruleInsurableObjects= ruleInsurableObjects EOF )
            // InternalMyDsl.g:395:2: iv_ruleInsurableObjects= ruleInsurableObjects EOF
            {
             newCompositeNode(grammarAccess.getInsurableObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsurableObjects=ruleInsurableObjects();

            state._fsp--;

             current =iv_ruleInsurableObjects; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsurableObjects"


    // $ANTLR start "ruleInsurableObjects"
    // InternalMyDsl.g:401:1: ruleInsurableObjects returns [EObject current=null] : (otherlv_0= 'InsurableObjects' otherlv_1= '{' ( (lv_objects_2_0= ruleInsurableObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleInsurableObject ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleInsurableObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_objects_2_0 = null;

        EObject lv_objects_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:407:2: ( (otherlv_0= 'InsurableObjects' otherlv_1= '{' ( (lv_objects_2_0= ruleInsurableObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleInsurableObject ) ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:408:2: (otherlv_0= 'InsurableObjects' otherlv_1= '{' ( (lv_objects_2_0= ruleInsurableObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleInsurableObject ) ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:408:2: (otherlv_0= 'InsurableObjects' otherlv_1= '{' ( (lv_objects_2_0= ruleInsurableObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleInsurableObject ) ) )* otherlv_5= '}' )
            // InternalMyDsl.g:409:3: otherlv_0= 'InsurableObjects' otherlv_1= '{' ( (lv_objects_2_0= ruleInsurableObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleInsurableObject ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsurableObjectsAccess().getInsurableObjectsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInsurableObjectsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:417:3: ( (lv_objects_2_0= ruleInsurableObject ) )
            // InternalMyDsl.g:418:4: (lv_objects_2_0= ruleInsurableObject )
            {
            // InternalMyDsl.g:418:4: (lv_objects_2_0= ruleInsurableObject )
            // InternalMyDsl.g:419:5: lv_objects_2_0= ruleInsurableObject
            {

            					newCompositeNode(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_objects_2_0=ruleInsurableObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsurableObjectsRule());
            					}
            					add(
            						current,
            						"objects",
            						lv_objects_2_0,
            						"org.xtext.example.mydsl.MyDsl.InsurableObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:436:3: (otherlv_3= ',' ( (lv_objects_4_0= ruleInsurableObject ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:437:4: otherlv_3= ',' ( (lv_objects_4_0= ruleInsurableObject ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInsurableObjectsAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:441:4: ( (lv_objects_4_0= ruleInsurableObject ) )
            	    // InternalMyDsl.g:442:5: (lv_objects_4_0= ruleInsurableObject )
            	    {
            	    // InternalMyDsl.g:442:5: (lv_objects_4_0= ruleInsurableObject )
            	    // InternalMyDsl.g:443:6: lv_objects_4_0= ruleInsurableObject
            	    {

            	    						newCompositeNode(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_objects_4_0=ruleInsurableObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsurableObjectsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objects",
            	    							lv_objects_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.InsurableObject");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInsurableObjectsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsurableObjects"


    // $ANTLR start "entryRuleInsurableObject"
    // InternalMyDsl.g:469:1: entryRuleInsurableObject returns [EObject current=null] : iv_ruleInsurableObject= ruleInsurableObject EOF ;
    public final EObject entryRuleInsurableObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsurableObject = null;


        try {
            // InternalMyDsl.g:469:56: (iv_ruleInsurableObject= ruleInsurableObject EOF )
            // InternalMyDsl.g:470:2: iv_ruleInsurableObject= ruleInsurableObject EOF
            {
             newCompositeNode(grammarAccess.getInsurableObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsurableObject=ruleInsurableObject();

            state._fsp--;

             current =iv_ruleInsurableObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsurableObject"


    // $ANTLR start "ruleInsurableObject"
    // InternalMyDsl.g:476:1: ruleInsurableObject returns [EObject current=null] : (otherlv_0= 'ObjectName' otherlv_1= '=' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInsurableObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:482:2: ( (otherlv_0= 'ObjectName' otherlv_1= '=' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:483:2: (otherlv_0= 'ObjectName' otherlv_1= '=' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:483:2: (otherlv_0= 'ObjectName' otherlv_1= '=' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:484:3: otherlv_0= 'ObjectName' otherlv_1= '=' ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getInsurableObjectAccess().getObjectNameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInsurableObjectAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:492:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:493:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:493:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:494:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInsurableObjectAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsurableObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsurableObject"


    // $ANTLR start "entryRuleREAL"
    // InternalMyDsl.g:515:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:517:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalMyDsl.g:518:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalMyDsl.g:527:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:534:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:535:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:535:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalMyDsl.g:536:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalMyDsl.g:536:3: (this_INT_0= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:537:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:564:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:564:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:565:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:571:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:577:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:578:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:578:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:579:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:587:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});

}