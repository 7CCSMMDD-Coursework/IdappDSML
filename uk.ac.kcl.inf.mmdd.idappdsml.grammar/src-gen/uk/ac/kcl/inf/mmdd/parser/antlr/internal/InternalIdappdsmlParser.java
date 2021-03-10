package uk.ac.kcl.inf.mmdd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.mmdd.services.IdappdsmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdappdsmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Contract'", "'{'", "'insurableobject'", "'insurancecompany'", "'customer'", "'terms'", "','", "'}'", "'Terms'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalIdappdsmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIdappdsmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIdappdsmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIdappdsml.g"; }



     	private IdappdsmlGrammarAccess grammarAccess;

        public InternalIdappdsmlParser(TokenStream input, IdappdsmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Contract";
       	}

       	@Override
       	protected IdappdsmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContract"
    // InternalIdappdsml.g:64:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalIdappdsml.g:64:49: (iv_ruleContract= ruleContract EOF )
            // InternalIdappdsml.g:65:2: iv_ruleContract= ruleContract EOF
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
    // InternalIdappdsml.g:71:1: ruleContract returns [EObject current=null] : ( () otherlv_1= 'Contract' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? (otherlv_5= 'insurancecompany' ( ( ruleEString ) ) )? (otherlv_7= 'customer' ( ( ruleEString ) ) )? (otherlv_9= 'terms' otherlv_10= '{' ( (lv_terms_11_0= ruleTerms ) ) (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_terms_11_0 = null;

        EObject lv_terms_13_0 = null;



        	enterRule();

        try {
            // InternalIdappdsml.g:77:2: ( ( () otherlv_1= 'Contract' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? (otherlv_5= 'insurancecompany' ( ( ruleEString ) ) )? (otherlv_7= 'customer' ( ( ruleEString ) ) )? (otherlv_9= 'terms' otherlv_10= '{' ( (lv_terms_11_0= ruleTerms ) ) (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalIdappdsml.g:78:2: ( () otherlv_1= 'Contract' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? (otherlv_5= 'insurancecompany' ( ( ruleEString ) ) )? (otherlv_7= 'customer' ( ( ruleEString ) ) )? (otherlv_9= 'terms' otherlv_10= '{' ( (lv_terms_11_0= ruleTerms ) ) (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalIdappdsml.g:78:2: ( () otherlv_1= 'Contract' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? (otherlv_5= 'insurancecompany' ( ( ruleEString ) ) )? (otherlv_7= 'customer' ( ( ruleEString ) ) )? (otherlv_9= 'terms' otherlv_10= '{' ( (lv_terms_11_0= ruleTerms ) ) (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalIdappdsml.g:79:3: () otherlv_1= 'Contract' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? (otherlv_5= 'insurancecompany' ( ( ruleEString ) ) )? (otherlv_7= 'customer' ( ( ruleEString ) ) )? (otherlv_9= 'terms' otherlv_10= '{' ( (lv_terms_11_0= ruleTerms ) ) (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalIdappdsml.g:79:3: ()
            // InternalIdappdsml.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContractAccess().getContractAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContractAccess().getContractKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIdappdsml.g:94:3: (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalIdappdsml.g:95:4: otherlv_3= 'insurableobject' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getContractAccess().getInsurableobjectKeyword_3_0());
                    			
                    // InternalIdappdsml.g:99:4: ( ( ruleEString ) )
                    // InternalIdappdsml.g:100:5: ( ruleEString )
                    {
                    // InternalIdappdsml.g:100:5: ( ruleEString )
                    // InternalIdappdsml.g:101:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContractRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContractAccess().getInsurableobjectInsurableObjectCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIdappdsml.g:116:3: (otherlv_5= 'insurancecompany' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalIdappdsml.g:117:4: otherlv_5= 'insurancecompany' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getContractAccess().getInsurancecompanyKeyword_4_0());
                    			
                    // InternalIdappdsml.g:121:4: ( ( ruleEString ) )
                    // InternalIdappdsml.g:122:5: ( ruleEString )
                    {
                    // InternalIdappdsml.g:122:5: ( ruleEString )
                    // InternalIdappdsml.g:123:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContractRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContractAccess().getInsurancecompanyInsuranceCompanyCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIdappdsml.g:138:3: (otherlv_7= 'customer' ( ( ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIdappdsml.g:139:4: otherlv_7= 'customer' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getContractAccess().getCustomerKeyword_5_0());
                    			
                    // InternalIdappdsml.g:143:4: ( ( ruleEString ) )
                    // InternalIdappdsml.g:144:5: ( ruleEString )
                    {
                    // InternalIdappdsml.g:144:5: ( ruleEString )
                    // InternalIdappdsml.g:145:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContractRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContractAccess().getCustomerCustomerCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIdappdsml.g:160:3: (otherlv_9= 'terms' otherlv_10= '{' ( (lv_terms_11_0= ruleTerms ) ) (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIdappdsml.g:161:4: otherlv_9= 'terms' otherlv_10= '{' ( (lv_terms_11_0= ruleTerms ) ) (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getContractAccess().getTermsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalIdappdsml.g:169:4: ( (lv_terms_11_0= ruleTerms ) )
                    // InternalIdappdsml.g:170:5: (lv_terms_11_0= ruleTerms )
                    {
                    // InternalIdappdsml.g:170:5: (lv_terms_11_0= ruleTerms )
                    // InternalIdappdsml.g:171:6: lv_terms_11_0= ruleTerms
                    {

                    						newCompositeNode(grammarAccess.getContractAccess().getTermsTermsParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_terms_11_0=ruleTerms();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContractRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_11_0,
                    							"uk.ac.kcl.inf.mmdd.Idappdsml.Terms");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIdappdsml.g:188:4: (otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalIdappdsml.g:189:5: otherlv_12= ',' ( (lv_terms_13_0= ruleTerms ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getContractAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalIdappdsml.g:193:5: ( (lv_terms_13_0= ruleTerms ) )
                    	    // InternalIdappdsml.g:194:6: (lv_terms_13_0= ruleTerms )
                    	    {
                    	    // InternalIdappdsml.g:194:6: (lv_terms_13_0= ruleTerms )
                    	    // InternalIdappdsml.g:195:7: lv_terms_13_0= ruleTerms
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getTermsTermsParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_terms_13_0=ruleTerms();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"terms",
                    	    								lv_terms_13_0,
                    	    								"uk.ac.kcl.inf.mmdd.Idappdsml.Terms");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleTerms"
    // InternalIdappdsml.g:226:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // InternalIdappdsml.g:226:46: (iv_ruleTerms= ruleTerms EOF )
            // InternalIdappdsml.g:227:2: iv_ruleTerms= ruleTerms EOF
            {
             newCompositeNode(grammarAccess.getTermsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerms=ruleTerms();

            state._fsp--;

             current =iv_ruleTerms; 
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
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // InternalIdappdsml.g:233:1: ruleTerms returns [EObject current=null] : ( () otherlv_1= 'Terms' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIdappdsml.g:239:2: ( ( () otherlv_1= 'Terms' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalIdappdsml.g:240:2: ( () otherlv_1= 'Terms' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalIdappdsml.g:240:2: ( () otherlv_1= 'Terms' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalIdappdsml.g:241:3: () otherlv_1= 'Terms' otherlv_2= '{' (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalIdappdsml.g:241:3: ()
            // InternalIdappdsml.g:242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTermsAccess().getTermsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getTermsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTermsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIdappdsml.g:256:3: (otherlv_3= 'insurableobject' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIdappdsml.g:257:4: otherlv_3= 'insurableobject' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTermsAccess().getInsurableobjectKeyword_3_0());
                    			
                    // InternalIdappdsml.g:261:4: ( ( ruleEString ) )
                    // InternalIdappdsml.g:262:5: ( ruleEString )
                    {
                    // InternalIdappdsml.g:262:5: ( ruleEString )
                    // InternalIdappdsml.g:263:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTermsRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTermsAccess().getInsurableobjectInsurableObjectCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTermsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleEString"
    // InternalIdappdsml.g:286:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalIdappdsml.g:286:47: (iv_ruleEString= ruleEString EOF )
            // InternalIdappdsml.g:287:2: iv_ruleEString= ruleEString EOF
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
    // InternalIdappdsml.g:293:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalIdappdsml.g:299:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalIdappdsml.g:300:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalIdappdsml.g:300:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIdappdsml.g:301:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIdappdsml.g:309:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000005E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000005C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042000L});

}