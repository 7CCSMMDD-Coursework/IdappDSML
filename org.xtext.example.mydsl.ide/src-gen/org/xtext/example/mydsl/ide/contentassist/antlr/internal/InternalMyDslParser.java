package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Contract'", "'{'", "'ParticipatingParties'", "'}'", "'Terms'", "'Premium'", "'='", "'PremiumIncrease'", "'Claim'", "'PaymentPeriod'", "'CustomerAddress'", "'CompanyAddress'", "'InsurableObjects'", "','", "'ObjectName'", "'.'"
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
    public static final int T__26=26;
    public static final int RULE_INT=6;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleContract"
    // InternalMyDsl.g:53:1: entryRuleContract : ruleContract EOF ;
    public final void entryRuleContract() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleContract EOF )
            // InternalMyDsl.g:55:1: ruleContract EOF
            {
             before(grammarAccess.getContractRule()); 
            pushFollow(FOLLOW_1);
            ruleContract();

            state._fsp--;

             after(grammarAccess.getContractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalMyDsl.g:62:1: ruleContract : ( ( rule__Contract__Group__0 ) ) ;
    public final void ruleContract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Contract__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Contract__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Contract__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Contract__Group__0 )
            {
             before(grammarAccess.getContractAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Contract__Group__0 )
            // InternalMyDsl.g:69:4: rule__Contract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleCustomer"
    // InternalMyDsl.g:78:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCustomer EOF )
            // InternalMyDsl.g:80:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalMyDsl.g:87:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Customer__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Customer__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Customer__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Customer__Group__0 )
            // InternalMyDsl.g:94:4: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleCompany"
    // InternalMyDsl.g:103:1: entryRuleCompany : ruleCompany EOF ;
    public final void entryRuleCompany() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCompany EOF )
            // InternalMyDsl.g:105:1: ruleCompany EOF
            {
             before(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getCompanyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalMyDsl.g:112:1: ruleCompany : ( ( rule__Company__Group__0 ) ) ;
    public final void ruleCompany() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Company__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Company__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Company__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Company__Group__0 )
            {
             before(grammarAccess.getCompanyAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Company__Group__0 )
            // InternalMyDsl.g:119:4: rule__Company__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleInsurableObjects"
    // InternalMyDsl.g:128:1: entryRuleInsurableObjects : ruleInsurableObjects EOF ;
    public final void entryRuleInsurableObjects() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleInsurableObjects EOF )
            // InternalMyDsl.g:130:1: ruleInsurableObjects EOF
            {
             before(grammarAccess.getInsurableObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleInsurableObjects();

            state._fsp--;

             after(grammarAccess.getInsurableObjectsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsurableObjects"


    // $ANTLR start "ruleInsurableObjects"
    // InternalMyDsl.g:137:1: ruleInsurableObjects : ( ( rule__InsurableObjects__Group__0 ) ) ;
    public final void ruleInsurableObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__InsurableObjects__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__InsurableObjects__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__InsurableObjects__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__InsurableObjects__Group__0 )
            {
             before(grammarAccess.getInsurableObjectsAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__InsurableObjects__Group__0 )
            // InternalMyDsl.g:144:4: rule__InsurableObjects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsurableObjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsurableObjects"


    // $ANTLR start "entryRuleInsurableObject"
    // InternalMyDsl.g:153:1: entryRuleInsurableObject : ruleInsurableObject EOF ;
    public final void entryRuleInsurableObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleInsurableObject EOF )
            // InternalMyDsl.g:155:1: ruleInsurableObject EOF
            {
             before(grammarAccess.getInsurableObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleInsurableObject();

            state._fsp--;

             after(grammarAccess.getInsurableObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsurableObject"


    // $ANTLR start "ruleInsurableObject"
    // InternalMyDsl.g:162:1: ruleInsurableObject : ( ( rule__InsurableObject__Group__0 ) ) ;
    public final void ruleInsurableObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__InsurableObject__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__InsurableObject__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__InsurableObject__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__InsurableObject__Group__0 )
            {
             before(grammarAccess.getInsurableObjectAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__InsurableObject__Group__0 )
            // InternalMyDsl.g:169:4: rule__InsurableObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsurableObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsurableObject"


    // $ANTLR start "entryRuleREAL"
    // InternalMyDsl.g:178:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:182:1: ( ruleREAL EOF )
            // InternalMyDsl.g:183:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalMyDsl.g:193:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__REAL__Group__0 ) )
            // InternalMyDsl.g:200:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalMyDsl.g:201:3: ( rule__REAL__Group__0 )
            // InternalMyDsl.g:201:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:211:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:212:1: ( ruleEString EOF )
            // InternalMyDsl.g:213:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:220:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:224:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:225:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:225:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:226:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:227:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:227:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:235:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:240:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:240:2: ( RULE_STRING )
                    // InternalMyDsl.g:241:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:246:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:246:2: ( RULE_ID )
                    // InternalMyDsl.g:247:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Contract__Group__0"
    // InternalMyDsl.g:256:1: rule__Contract__Group__0 : rule__Contract__Group__0__Impl rule__Contract__Group__1 ;
    public final void rule__Contract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( rule__Contract__Group__0__Impl rule__Contract__Group__1 )
            // InternalMyDsl.g:261:2: rule__Contract__Group__0__Impl rule__Contract__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Contract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__0"


    // $ANTLR start "rule__Contract__Group__0__Impl"
    // InternalMyDsl.g:268:1: rule__Contract__Group__0__Impl : ( 'Contract' ) ;
    public final void rule__Contract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( ( 'Contract' ) )
            // InternalMyDsl.g:273:1: ( 'Contract' )
            {
            // InternalMyDsl.g:273:1: ( 'Contract' )
            // InternalMyDsl.g:274:2: 'Contract'
            {
             before(grammarAccess.getContractAccess().getContractKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getContractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__0__Impl"


    // $ANTLR start "rule__Contract__Group__1"
    // InternalMyDsl.g:283:1: rule__Contract__Group__1 : rule__Contract__Group__1__Impl rule__Contract__Group__2 ;
    public final void rule__Contract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:287:1: ( rule__Contract__Group__1__Impl rule__Contract__Group__2 )
            // InternalMyDsl.g:288:2: rule__Contract__Group__1__Impl rule__Contract__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Contract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__1"


    // $ANTLR start "rule__Contract__Group__1__Impl"
    // InternalMyDsl.g:295:1: rule__Contract__Group__1__Impl : ( ( rule__Contract__NameAssignment_1 ) ) ;
    public final void rule__Contract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( ( ( rule__Contract__NameAssignment_1 ) ) )
            // InternalMyDsl.g:300:1: ( ( rule__Contract__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:300:1: ( ( rule__Contract__NameAssignment_1 ) )
            // InternalMyDsl.g:301:2: ( rule__Contract__NameAssignment_1 )
            {
             before(grammarAccess.getContractAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:302:2: ( rule__Contract__NameAssignment_1 )
            // InternalMyDsl.g:302:3: rule__Contract__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Contract__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__1__Impl"


    // $ANTLR start "rule__Contract__Group__2"
    // InternalMyDsl.g:310:1: rule__Contract__Group__2 : rule__Contract__Group__2__Impl rule__Contract__Group__3 ;
    public final void rule__Contract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( rule__Contract__Group__2__Impl rule__Contract__Group__3 )
            // InternalMyDsl.g:315:2: rule__Contract__Group__2__Impl rule__Contract__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Contract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__2"


    // $ANTLR start "rule__Contract__Group__2__Impl"
    // InternalMyDsl.g:322:1: rule__Contract__Group__2__Impl : ( '{' ) ;
    public final void rule__Contract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( '{' ) )
            // InternalMyDsl.g:327:1: ( '{' )
            {
            // InternalMyDsl.g:327:1: ( '{' )
            // InternalMyDsl.g:328:2: '{'
            {
             before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__2__Impl"


    // $ANTLR start "rule__Contract__Group__3"
    // InternalMyDsl.g:337:1: rule__Contract__Group__3 : rule__Contract__Group__3__Impl rule__Contract__Group__4 ;
    public final void rule__Contract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( rule__Contract__Group__3__Impl rule__Contract__Group__4 )
            // InternalMyDsl.g:342:2: rule__Contract__Group__3__Impl rule__Contract__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Contract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__3"


    // $ANTLR start "rule__Contract__Group__3__Impl"
    // InternalMyDsl.g:349:1: rule__Contract__Group__3__Impl : ( 'ParticipatingParties' ) ;
    public final void rule__Contract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( ( 'ParticipatingParties' ) )
            // InternalMyDsl.g:354:1: ( 'ParticipatingParties' )
            {
            // InternalMyDsl.g:354:1: ( 'ParticipatingParties' )
            // InternalMyDsl.g:355:2: 'ParticipatingParties'
            {
             before(grammarAccess.getContractAccess().getParticipatingPartiesKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getParticipatingPartiesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__3__Impl"


    // $ANTLR start "rule__Contract__Group__4"
    // InternalMyDsl.g:364:1: rule__Contract__Group__4 : rule__Contract__Group__4__Impl rule__Contract__Group__5 ;
    public final void rule__Contract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__Contract__Group__4__Impl rule__Contract__Group__5 )
            // InternalMyDsl.g:369:2: rule__Contract__Group__4__Impl rule__Contract__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Contract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__4"


    // $ANTLR start "rule__Contract__Group__4__Impl"
    // InternalMyDsl.g:376:1: rule__Contract__Group__4__Impl : ( '{' ) ;
    public final void rule__Contract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( ( '{' ) )
            // InternalMyDsl.g:381:1: ( '{' )
            {
            // InternalMyDsl.g:381:1: ( '{' )
            // InternalMyDsl.g:382:2: '{'
            {
             before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__4__Impl"


    // $ANTLR start "rule__Contract__Group__5"
    // InternalMyDsl.g:391:1: rule__Contract__Group__5 : rule__Contract__Group__5__Impl rule__Contract__Group__6 ;
    public final void rule__Contract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__Contract__Group__5__Impl rule__Contract__Group__6 )
            // InternalMyDsl.g:396:2: rule__Contract__Group__5__Impl rule__Contract__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Contract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__5"


    // $ANTLR start "rule__Contract__Group__5__Impl"
    // InternalMyDsl.g:403:1: rule__Contract__Group__5__Impl : ( ( rule__Contract__CustomerAssignment_5 ) ) ;
    public final void rule__Contract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( ( rule__Contract__CustomerAssignment_5 ) ) )
            // InternalMyDsl.g:408:1: ( ( rule__Contract__CustomerAssignment_5 ) )
            {
            // InternalMyDsl.g:408:1: ( ( rule__Contract__CustomerAssignment_5 ) )
            // InternalMyDsl.g:409:2: ( rule__Contract__CustomerAssignment_5 )
            {
             before(grammarAccess.getContractAccess().getCustomerAssignment_5()); 
            // InternalMyDsl.g:410:2: ( rule__Contract__CustomerAssignment_5 )
            // InternalMyDsl.g:410:3: rule__Contract__CustomerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Contract__CustomerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getCustomerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__5__Impl"


    // $ANTLR start "rule__Contract__Group__6"
    // InternalMyDsl.g:418:1: rule__Contract__Group__6 : rule__Contract__Group__6__Impl rule__Contract__Group__7 ;
    public final void rule__Contract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__Contract__Group__6__Impl rule__Contract__Group__7 )
            // InternalMyDsl.g:423:2: rule__Contract__Group__6__Impl rule__Contract__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Contract__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__6"


    // $ANTLR start "rule__Contract__Group__6__Impl"
    // InternalMyDsl.g:430:1: rule__Contract__Group__6__Impl : ( ( rule__Contract__CompanyAssignment_6 ) ) ;
    public final void rule__Contract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ( rule__Contract__CompanyAssignment_6 ) ) )
            // InternalMyDsl.g:435:1: ( ( rule__Contract__CompanyAssignment_6 ) )
            {
            // InternalMyDsl.g:435:1: ( ( rule__Contract__CompanyAssignment_6 ) )
            // InternalMyDsl.g:436:2: ( rule__Contract__CompanyAssignment_6 )
            {
             before(grammarAccess.getContractAccess().getCompanyAssignment_6()); 
            // InternalMyDsl.g:437:2: ( rule__Contract__CompanyAssignment_6 )
            // InternalMyDsl.g:437:3: rule__Contract__CompanyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Contract__CompanyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getCompanyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__6__Impl"


    // $ANTLR start "rule__Contract__Group__7"
    // InternalMyDsl.g:445:1: rule__Contract__Group__7 : rule__Contract__Group__7__Impl rule__Contract__Group__8 ;
    public final void rule__Contract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__Contract__Group__7__Impl rule__Contract__Group__8 )
            // InternalMyDsl.g:450:2: rule__Contract__Group__7__Impl rule__Contract__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Contract__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__7"


    // $ANTLR start "rule__Contract__Group__7__Impl"
    // InternalMyDsl.g:457:1: rule__Contract__Group__7__Impl : ( '}' ) ;
    public final void rule__Contract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( '}' ) )
            // InternalMyDsl.g:462:1: ( '}' )
            {
            // InternalMyDsl.g:462:1: ( '}' )
            // InternalMyDsl.g:463:2: '}'
            {
             before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__7__Impl"


    // $ANTLR start "rule__Contract__Group__8"
    // InternalMyDsl.g:472:1: rule__Contract__Group__8 : rule__Contract__Group__8__Impl rule__Contract__Group__9 ;
    public final void rule__Contract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__Contract__Group__8__Impl rule__Contract__Group__9 )
            // InternalMyDsl.g:477:2: rule__Contract__Group__8__Impl rule__Contract__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Contract__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__8"


    // $ANTLR start "rule__Contract__Group__8__Impl"
    // InternalMyDsl.g:484:1: rule__Contract__Group__8__Impl : ( ( rule__Contract__InsurableObjectsAssignment_8 ) ) ;
    public final void rule__Contract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( ( rule__Contract__InsurableObjectsAssignment_8 ) ) )
            // InternalMyDsl.g:489:1: ( ( rule__Contract__InsurableObjectsAssignment_8 ) )
            {
            // InternalMyDsl.g:489:1: ( ( rule__Contract__InsurableObjectsAssignment_8 ) )
            // InternalMyDsl.g:490:2: ( rule__Contract__InsurableObjectsAssignment_8 )
            {
             before(grammarAccess.getContractAccess().getInsurableObjectsAssignment_8()); 
            // InternalMyDsl.g:491:2: ( rule__Contract__InsurableObjectsAssignment_8 )
            // InternalMyDsl.g:491:3: rule__Contract__InsurableObjectsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Contract__InsurableObjectsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getInsurableObjectsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__8__Impl"


    // $ANTLR start "rule__Contract__Group__9"
    // InternalMyDsl.g:499:1: rule__Contract__Group__9 : rule__Contract__Group__9__Impl rule__Contract__Group__10 ;
    public final void rule__Contract__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__Contract__Group__9__Impl rule__Contract__Group__10 )
            // InternalMyDsl.g:504:2: rule__Contract__Group__9__Impl rule__Contract__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Contract__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__9"


    // $ANTLR start "rule__Contract__Group__9__Impl"
    // InternalMyDsl.g:511:1: rule__Contract__Group__9__Impl : ( 'Terms' ) ;
    public final void rule__Contract__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( 'Terms' ) )
            // InternalMyDsl.g:516:1: ( 'Terms' )
            {
            // InternalMyDsl.g:516:1: ( 'Terms' )
            // InternalMyDsl.g:517:2: 'Terms'
            {
             before(grammarAccess.getContractAccess().getTermsKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getTermsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__9__Impl"


    // $ANTLR start "rule__Contract__Group__10"
    // InternalMyDsl.g:526:1: rule__Contract__Group__10 : rule__Contract__Group__10__Impl rule__Contract__Group__11 ;
    public final void rule__Contract__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__Contract__Group__10__Impl rule__Contract__Group__11 )
            // InternalMyDsl.g:531:2: rule__Contract__Group__10__Impl rule__Contract__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Contract__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__10"


    // $ANTLR start "rule__Contract__Group__10__Impl"
    // InternalMyDsl.g:538:1: rule__Contract__Group__10__Impl : ( '{' ) ;
    public final void rule__Contract__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( ( '{' ) )
            // InternalMyDsl.g:543:1: ( '{' )
            {
            // InternalMyDsl.g:543:1: ( '{' )
            // InternalMyDsl.g:544:2: '{'
            {
             before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__10__Impl"


    // $ANTLR start "rule__Contract__Group__11"
    // InternalMyDsl.g:553:1: rule__Contract__Group__11 : rule__Contract__Group__11__Impl rule__Contract__Group__12 ;
    public final void rule__Contract__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Contract__Group__11__Impl rule__Contract__Group__12 )
            // InternalMyDsl.g:558:2: rule__Contract__Group__11__Impl rule__Contract__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Contract__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__11"


    // $ANTLR start "rule__Contract__Group__11__Impl"
    // InternalMyDsl.g:565:1: rule__Contract__Group__11__Impl : ( 'Premium' ) ;
    public final void rule__Contract__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( 'Premium' ) )
            // InternalMyDsl.g:570:1: ( 'Premium' )
            {
            // InternalMyDsl.g:570:1: ( 'Premium' )
            // InternalMyDsl.g:571:2: 'Premium'
            {
             before(grammarAccess.getContractAccess().getPremiumKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getPremiumKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__11__Impl"


    // $ANTLR start "rule__Contract__Group__12"
    // InternalMyDsl.g:580:1: rule__Contract__Group__12 : rule__Contract__Group__12__Impl rule__Contract__Group__13 ;
    public final void rule__Contract__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Contract__Group__12__Impl rule__Contract__Group__13 )
            // InternalMyDsl.g:585:2: rule__Contract__Group__12__Impl rule__Contract__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Contract__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__12"


    // $ANTLR start "rule__Contract__Group__12__Impl"
    // InternalMyDsl.g:592:1: rule__Contract__Group__12__Impl : ( '=' ) ;
    public final void rule__Contract__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( '=' ) )
            // InternalMyDsl.g:597:1: ( '=' )
            {
            // InternalMyDsl.g:597:1: ( '=' )
            // InternalMyDsl.g:598:2: '='
            {
             before(grammarAccess.getContractAccess().getEqualsSignKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__12__Impl"


    // $ANTLR start "rule__Contract__Group__13"
    // InternalMyDsl.g:607:1: rule__Contract__Group__13 : rule__Contract__Group__13__Impl rule__Contract__Group__14 ;
    public final void rule__Contract__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Contract__Group__13__Impl rule__Contract__Group__14 )
            // InternalMyDsl.g:612:2: rule__Contract__Group__13__Impl rule__Contract__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Contract__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__13"


    // $ANTLR start "rule__Contract__Group__13__Impl"
    // InternalMyDsl.g:619:1: rule__Contract__Group__13__Impl : ( ( rule__Contract__PremiumAssignment_13 ) ) ;
    public final void rule__Contract__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ( rule__Contract__PremiumAssignment_13 ) ) )
            // InternalMyDsl.g:624:1: ( ( rule__Contract__PremiumAssignment_13 ) )
            {
            // InternalMyDsl.g:624:1: ( ( rule__Contract__PremiumAssignment_13 ) )
            // InternalMyDsl.g:625:2: ( rule__Contract__PremiumAssignment_13 )
            {
             before(grammarAccess.getContractAccess().getPremiumAssignment_13()); 
            // InternalMyDsl.g:626:2: ( rule__Contract__PremiumAssignment_13 )
            // InternalMyDsl.g:626:3: rule__Contract__PremiumAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Contract__PremiumAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getPremiumAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__13__Impl"


    // $ANTLR start "rule__Contract__Group__14"
    // InternalMyDsl.g:634:1: rule__Contract__Group__14 : rule__Contract__Group__14__Impl rule__Contract__Group__15 ;
    public final void rule__Contract__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Contract__Group__14__Impl rule__Contract__Group__15 )
            // InternalMyDsl.g:639:2: rule__Contract__Group__14__Impl rule__Contract__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Contract__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__14"


    // $ANTLR start "rule__Contract__Group__14__Impl"
    // InternalMyDsl.g:646:1: rule__Contract__Group__14__Impl : ( 'PremiumIncrease' ) ;
    public final void rule__Contract__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( 'PremiumIncrease' ) )
            // InternalMyDsl.g:651:1: ( 'PremiumIncrease' )
            {
            // InternalMyDsl.g:651:1: ( 'PremiumIncrease' )
            // InternalMyDsl.g:652:2: 'PremiumIncrease'
            {
             before(grammarAccess.getContractAccess().getPremiumIncreaseKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getPremiumIncreaseKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__14__Impl"


    // $ANTLR start "rule__Contract__Group__15"
    // InternalMyDsl.g:661:1: rule__Contract__Group__15 : rule__Contract__Group__15__Impl rule__Contract__Group__16 ;
    public final void rule__Contract__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Contract__Group__15__Impl rule__Contract__Group__16 )
            // InternalMyDsl.g:666:2: rule__Contract__Group__15__Impl rule__Contract__Group__16
            {
            pushFollow(FOLLOW_13);
            rule__Contract__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__15"


    // $ANTLR start "rule__Contract__Group__15__Impl"
    // InternalMyDsl.g:673:1: rule__Contract__Group__15__Impl : ( '=' ) ;
    public final void rule__Contract__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( '=' ) )
            // InternalMyDsl.g:678:1: ( '=' )
            {
            // InternalMyDsl.g:678:1: ( '=' )
            // InternalMyDsl.g:679:2: '='
            {
             before(grammarAccess.getContractAccess().getEqualsSignKeyword_15()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getEqualsSignKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__15__Impl"


    // $ANTLR start "rule__Contract__Group__16"
    // InternalMyDsl.g:688:1: rule__Contract__Group__16 : rule__Contract__Group__16__Impl rule__Contract__Group__17 ;
    public final void rule__Contract__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Contract__Group__16__Impl rule__Contract__Group__17 )
            // InternalMyDsl.g:693:2: rule__Contract__Group__16__Impl rule__Contract__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Contract__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__16"


    // $ANTLR start "rule__Contract__Group__16__Impl"
    // InternalMyDsl.g:700:1: rule__Contract__Group__16__Impl : ( ( rule__Contract__IncreaseAssignment_16 ) ) ;
    public final void rule__Contract__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( ( rule__Contract__IncreaseAssignment_16 ) ) )
            // InternalMyDsl.g:705:1: ( ( rule__Contract__IncreaseAssignment_16 ) )
            {
            // InternalMyDsl.g:705:1: ( ( rule__Contract__IncreaseAssignment_16 ) )
            // InternalMyDsl.g:706:2: ( rule__Contract__IncreaseAssignment_16 )
            {
             before(grammarAccess.getContractAccess().getIncreaseAssignment_16()); 
            // InternalMyDsl.g:707:2: ( rule__Contract__IncreaseAssignment_16 )
            // InternalMyDsl.g:707:3: rule__Contract__IncreaseAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Contract__IncreaseAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getIncreaseAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__16__Impl"


    // $ANTLR start "rule__Contract__Group__17"
    // InternalMyDsl.g:715:1: rule__Contract__Group__17 : rule__Contract__Group__17__Impl rule__Contract__Group__18 ;
    public final void rule__Contract__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( rule__Contract__Group__17__Impl rule__Contract__Group__18 )
            // InternalMyDsl.g:720:2: rule__Contract__Group__17__Impl rule__Contract__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__Contract__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__17"


    // $ANTLR start "rule__Contract__Group__17__Impl"
    // InternalMyDsl.g:727:1: rule__Contract__Group__17__Impl : ( 'Claim' ) ;
    public final void rule__Contract__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( 'Claim' ) )
            // InternalMyDsl.g:732:1: ( 'Claim' )
            {
            // InternalMyDsl.g:732:1: ( 'Claim' )
            // InternalMyDsl.g:733:2: 'Claim'
            {
             before(grammarAccess.getContractAccess().getClaimKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getClaimKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__17__Impl"


    // $ANTLR start "rule__Contract__Group__18"
    // InternalMyDsl.g:742:1: rule__Contract__Group__18 : rule__Contract__Group__18__Impl rule__Contract__Group__19 ;
    public final void rule__Contract__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__Contract__Group__18__Impl rule__Contract__Group__19 )
            // InternalMyDsl.g:747:2: rule__Contract__Group__18__Impl rule__Contract__Group__19
            {
            pushFollow(FOLLOW_13);
            rule__Contract__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__18"


    // $ANTLR start "rule__Contract__Group__18__Impl"
    // InternalMyDsl.g:754:1: rule__Contract__Group__18__Impl : ( '=' ) ;
    public final void rule__Contract__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( '=' ) )
            // InternalMyDsl.g:759:1: ( '=' )
            {
            // InternalMyDsl.g:759:1: ( '=' )
            // InternalMyDsl.g:760:2: '='
            {
             before(grammarAccess.getContractAccess().getEqualsSignKeyword_18()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getEqualsSignKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__18__Impl"


    // $ANTLR start "rule__Contract__Group__19"
    // InternalMyDsl.g:769:1: rule__Contract__Group__19 : rule__Contract__Group__19__Impl rule__Contract__Group__20 ;
    public final void rule__Contract__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__Contract__Group__19__Impl rule__Contract__Group__20 )
            // InternalMyDsl.g:774:2: rule__Contract__Group__19__Impl rule__Contract__Group__20
            {
            pushFollow(FOLLOW_16);
            rule__Contract__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__19"


    // $ANTLR start "rule__Contract__Group__19__Impl"
    // InternalMyDsl.g:781:1: rule__Contract__Group__19__Impl : ( ( rule__Contract__ClaimAssignment_19 ) ) ;
    public final void rule__Contract__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( ( ( rule__Contract__ClaimAssignment_19 ) ) )
            // InternalMyDsl.g:786:1: ( ( rule__Contract__ClaimAssignment_19 ) )
            {
            // InternalMyDsl.g:786:1: ( ( rule__Contract__ClaimAssignment_19 ) )
            // InternalMyDsl.g:787:2: ( rule__Contract__ClaimAssignment_19 )
            {
             before(grammarAccess.getContractAccess().getClaimAssignment_19()); 
            // InternalMyDsl.g:788:2: ( rule__Contract__ClaimAssignment_19 )
            // InternalMyDsl.g:788:3: rule__Contract__ClaimAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Contract__ClaimAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getClaimAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__19__Impl"


    // $ANTLR start "rule__Contract__Group__20"
    // InternalMyDsl.g:796:1: rule__Contract__Group__20 : rule__Contract__Group__20__Impl rule__Contract__Group__21 ;
    public final void rule__Contract__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Contract__Group__20__Impl rule__Contract__Group__21 )
            // InternalMyDsl.g:801:2: rule__Contract__Group__20__Impl rule__Contract__Group__21
            {
            pushFollow(FOLLOW_12);
            rule__Contract__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__20"


    // $ANTLR start "rule__Contract__Group__20__Impl"
    // InternalMyDsl.g:808:1: rule__Contract__Group__20__Impl : ( 'PaymentPeriod' ) ;
    public final void rule__Contract__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( 'PaymentPeriod' ) )
            // InternalMyDsl.g:813:1: ( 'PaymentPeriod' )
            {
            // InternalMyDsl.g:813:1: ( 'PaymentPeriod' )
            // InternalMyDsl.g:814:2: 'PaymentPeriod'
            {
             before(grammarAccess.getContractAccess().getPaymentPeriodKeyword_20()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getPaymentPeriodKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__20__Impl"


    // $ANTLR start "rule__Contract__Group__21"
    // InternalMyDsl.g:823:1: rule__Contract__Group__21 : rule__Contract__Group__21__Impl rule__Contract__Group__22 ;
    public final void rule__Contract__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Contract__Group__21__Impl rule__Contract__Group__22 )
            // InternalMyDsl.g:828:2: rule__Contract__Group__21__Impl rule__Contract__Group__22
            {
            pushFollow(FOLLOW_17);
            rule__Contract__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__21"


    // $ANTLR start "rule__Contract__Group__21__Impl"
    // InternalMyDsl.g:835:1: rule__Contract__Group__21__Impl : ( '=' ) ;
    public final void rule__Contract__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( '=' ) )
            // InternalMyDsl.g:840:1: ( '=' )
            {
            // InternalMyDsl.g:840:1: ( '=' )
            // InternalMyDsl.g:841:2: '='
            {
             before(grammarAccess.getContractAccess().getEqualsSignKeyword_21()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getEqualsSignKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__21__Impl"


    // $ANTLR start "rule__Contract__Group__22"
    // InternalMyDsl.g:850:1: rule__Contract__Group__22 : rule__Contract__Group__22__Impl rule__Contract__Group__23 ;
    public final void rule__Contract__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Contract__Group__22__Impl rule__Contract__Group__23 )
            // InternalMyDsl.g:855:2: rule__Contract__Group__22__Impl rule__Contract__Group__23
            {
            pushFollow(FOLLOW_8);
            rule__Contract__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__22"


    // $ANTLR start "rule__Contract__Group__22__Impl"
    // InternalMyDsl.g:862:1: rule__Contract__Group__22__Impl : ( ( rule__Contract__PeriodAssignment_22 ) ) ;
    public final void rule__Contract__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( ( rule__Contract__PeriodAssignment_22 ) ) )
            // InternalMyDsl.g:867:1: ( ( rule__Contract__PeriodAssignment_22 ) )
            {
            // InternalMyDsl.g:867:1: ( ( rule__Contract__PeriodAssignment_22 ) )
            // InternalMyDsl.g:868:2: ( rule__Contract__PeriodAssignment_22 )
            {
             before(grammarAccess.getContractAccess().getPeriodAssignment_22()); 
            // InternalMyDsl.g:869:2: ( rule__Contract__PeriodAssignment_22 )
            // InternalMyDsl.g:869:3: rule__Contract__PeriodAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Contract__PeriodAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getPeriodAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__22__Impl"


    // $ANTLR start "rule__Contract__Group__23"
    // InternalMyDsl.g:877:1: rule__Contract__Group__23 : rule__Contract__Group__23__Impl rule__Contract__Group__24 ;
    public final void rule__Contract__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Contract__Group__23__Impl rule__Contract__Group__24 )
            // InternalMyDsl.g:882:2: rule__Contract__Group__23__Impl rule__Contract__Group__24
            {
            pushFollow(FOLLOW_8);
            rule__Contract__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__23"


    // $ANTLR start "rule__Contract__Group__23__Impl"
    // InternalMyDsl.g:889:1: rule__Contract__Group__23__Impl : ( '}' ) ;
    public final void rule__Contract__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( '}' ) )
            // InternalMyDsl.g:894:1: ( '}' )
            {
            // InternalMyDsl.g:894:1: ( '}' )
            // InternalMyDsl.g:895:2: '}'
            {
             before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_23()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__23__Impl"


    // $ANTLR start "rule__Contract__Group__24"
    // InternalMyDsl.g:904:1: rule__Contract__Group__24 : rule__Contract__Group__24__Impl ;
    public final void rule__Contract__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__Contract__Group__24__Impl )
            // InternalMyDsl.g:909:2: rule__Contract__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contract__Group__24__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__24"


    // $ANTLR start "rule__Contract__Group__24__Impl"
    // InternalMyDsl.g:915:1: rule__Contract__Group__24__Impl : ( '}' ) ;
    public final void rule__Contract__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( ( '}' ) )
            // InternalMyDsl.g:920:1: ( '}' )
            {
            // InternalMyDsl.g:920:1: ( '}' )
            // InternalMyDsl.g:921:2: '}'
            {
             before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_24()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__24__Impl"


    // $ANTLR start "rule__Customer__Group__0"
    // InternalMyDsl.g:931:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalMyDsl.g:936:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // InternalMyDsl.g:943:1: rule__Customer__Group__0__Impl : ( 'CustomerAddress' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( 'CustomerAddress' ) )
            // InternalMyDsl.g:948:1: ( 'CustomerAddress' )
            {
            // InternalMyDsl.g:948:1: ( 'CustomerAddress' )
            // InternalMyDsl.g:949:2: 'CustomerAddress'
            {
             before(grammarAccess.getCustomerAccess().getCustomerAddressKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // InternalMyDsl.g:958:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalMyDsl.g:963:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // InternalMyDsl.g:970:1: rule__Customer__Group__1__Impl : ( '=' ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( '=' ) )
            // InternalMyDsl.g:975:1: ( '=' )
            {
            // InternalMyDsl.g:975:1: ( '=' )
            // InternalMyDsl.g:976:2: '='
            {
             before(grammarAccess.getCustomerAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // InternalMyDsl.g:985:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Customer__Group__2__Impl )
            // InternalMyDsl.g:990:2: rule__Customer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // InternalMyDsl.g:996:1: rule__Customer__Group__2__Impl : ( ( rule__Customer__AddressAssignment_2 ) ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__Customer__AddressAssignment_2 ) ) )
            // InternalMyDsl.g:1001:1: ( ( rule__Customer__AddressAssignment_2 ) )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__Customer__AddressAssignment_2 ) )
            // InternalMyDsl.g:1002:2: ( rule__Customer__AddressAssignment_2 )
            {
             before(grammarAccess.getCustomerAccess().getAddressAssignment_2()); 
            // InternalMyDsl.g:1003:2: ( rule__Customer__AddressAssignment_2 )
            // InternalMyDsl.g:1003:3: rule__Customer__AddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Customer__AddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Company__Group__0"
    // InternalMyDsl.g:1012:1: rule__Company__Group__0 : rule__Company__Group__0__Impl rule__Company__Group__1 ;
    public final void rule__Company__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__Company__Group__0__Impl rule__Company__Group__1 )
            // InternalMyDsl.g:1017:2: rule__Company__Group__0__Impl rule__Company__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Company__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0"


    // $ANTLR start "rule__Company__Group__0__Impl"
    // InternalMyDsl.g:1024:1: rule__Company__Group__0__Impl : ( 'CompanyAddress' ) ;
    public final void rule__Company__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( 'CompanyAddress' ) )
            // InternalMyDsl.g:1029:1: ( 'CompanyAddress' )
            {
            // InternalMyDsl.g:1029:1: ( 'CompanyAddress' )
            // InternalMyDsl.g:1030:2: 'CompanyAddress'
            {
             before(grammarAccess.getCompanyAccess().getCompanyAddressKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCompanyAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0__Impl"


    // $ANTLR start "rule__Company__Group__1"
    // InternalMyDsl.g:1039:1: rule__Company__Group__1 : rule__Company__Group__1__Impl rule__Company__Group__2 ;
    public final void rule__Company__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__Company__Group__1__Impl rule__Company__Group__2 )
            // InternalMyDsl.g:1044:2: rule__Company__Group__1__Impl rule__Company__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Company__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1"


    // $ANTLR start "rule__Company__Group__1__Impl"
    // InternalMyDsl.g:1051:1: rule__Company__Group__1__Impl : ( '=' ) ;
    public final void rule__Company__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( '=' ) )
            // InternalMyDsl.g:1056:1: ( '=' )
            {
            // InternalMyDsl.g:1056:1: ( '=' )
            // InternalMyDsl.g:1057:2: '='
            {
             before(grammarAccess.getCompanyAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1__Impl"


    // $ANTLR start "rule__Company__Group__2"
    // InternalMyDsl.g:1066:1: rule__Company__Group__2 : rule__Company__Group__2__Impl ;
    public final void rule__Company__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__Company__Group__2__Impl )
            // InternalMyDsl.g:1071:2: rule__Company__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2"


    // $ANTLR start "rule__Company__Group__2__Impl"
    // InternalMyDsl.g:1077:1: rule__Company__Group__2__Impl : ( ( rule__Company__AddressAssignment_2 ) ) ;
    public final void rule__Company__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( ( rule__Company__AddressAssignment_2 ) ) )
            // InternalMyDsl.g:1082:1: ( ( rule__Company__AddressAssignment_2 ) )
            {
            // InternalMyDsl.g:1082:1: ( ( rule__Company__AddressAssignment_2 ) )
            // InternalMyDsl.g:1083:2: ( rule__Company__AddressAssignment_2 )
            {
             before(grammarAccess.getCompanyAccess().getAddressAssignment_2()); 
            // InternalMyDsl.g:1084:2: ( rule__Company__AddressAssignment_2 )
            // InternalMyDsl.g:1084:3: rule__Company__AddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Company__AddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2__Impl"


    // $ANTLR start "rule__InsurableObjects__Group__0"
    // InternalMyDsl.g:1093:1: rule__InsurableObjects__Group__0 : rule__InsurableObjects__Group__0__Impl rule__InsurableObjects__Group__1 ;
    public final void rule__InsurableObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__InsurableObjects__Group__0__Impl rule__InsurableObjects__Group__1 )
            // InternalMyDsl.g:1098:2: rule__InsurableObjects__Group__0__Impl rule__InsurableObjects__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InsurableObjects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__0"


    // $ANTLR start "rule__InsurableObjects__Group__0__Impl"
    // InternalMyDsl.g:1105:1: rule__InsurableObjects__Group__0__Impl : ( 'InsurableObjects' ) ;
    public final void rule__InsurableObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( 'InsurableObjects' ) )
            // InternalMyDsl.g:1110:1: ( 'InsurableObjects' )
            {
            // InternalMyDsl.g:1110:1: ( 'InsurableObjects' )
            // InternalMyDsl.g:1111:2: 'InsurableObjects'
            {
             before(grammarAccess.getInsurableObjectsAccess().getInsurableObjectsKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInsurableObjectsAccess().getInsurableObjectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__0__Impl"


    // $ANTLR start "rule__InsurableObjects__Group__1"
    // InternalMyDsl.g:1120:1: rule__InsurableObjects__Group__1 : rule__InsurableObjects__Group__1__Impl rule__InsurableObjects__Group__2 ;
    public final void rule__InsurableObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__InsurableObjects__Group__1__Impl rule__InsurableObjects__Group__2 )
            // InternalMyDsl.g:1125:2: rule__InsurableObjects__Group__1__Impl rule__InsurableObjects__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__InsurableObjects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__1"


    // $ANTLR start "rule__InsurableObjects__Group__1__Impl"
    // InternalMyDsl.g:1132:1: rule__InsurableObjects__Group__1__Impl : ( '{' ) ;
    public final void rule__InsurableObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( '{' ) )
            // InternalMyDsl.g:1137:1: ( '{' )
            {
            // InternalMyDsl.g:1137:1: ( '{' )
            // InternalMyDsl.g:1138:2: '{'
            {
             before(grammarAccess.getInsurableObjectsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInsurableObjectsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__1__Impl"


    // $ANTLR start "rule__InsurableObjects__Group__2"
    // InternalMyDsl.g:1147:1: rule__InsurableObjects__Group__2 : rule__InsurableObjects__Group__2__Impl rule__InsurableObjects__Group__3 ;
    public final void rule__InsurableObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__InsurableObjects__Group__2__Impl rule__InsurableObjects__Group__3 )
            // InternalMyDsl.g:1152:2: rule__InsurableObjects__Group__2__Impl rule__InsurableObjects__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__InsurableObjects__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__2"


    // $ANTLR start "rule__InsurableObjects__Group__2__Impl"
    // InternalMyDsl.g:1159:1: rule__InsurableObjects__Group__2__Impl : ( ( rule__InsurableObjects__ObjectsAssignment_2 ) ) ;
    public final void rule__InsurableObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( ( rule__InsurableObjects__ObjectsAssignment_2 ) ) )
            // InternalMyDsl.g:1164:1: ( ( rule__InsurableObjects__ObjectsAssignment_2 ) )
            {
            // InternalMyDsl.g:1164:1: ( ( rule__InsurableObjects__ObjectsAssignment_2 ) )
            // InternalMyDsl.g:1165:2: ( rule__InsurableObjects__ObjectsAssignment_2 )
            {
             before(grammarAccess.getInsurableObjectsAccess().getObjectsAssignment_2()); 
            // InternalMyDsl.g:1166:2: ( rule__InsurableObjects__ObjectsAssignment_2 )
            // InternalMyDsl.g:1166:3: rule__InsurableObjects__ObjectsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObjects__ObjectsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsurableObjectsAccess().getObjectsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__2__Impl"


    // $ANTLR start "rule__InsurableObjects__Group__3"
    // InternalMyDsl.g:1174:1: rule__InsurableObjects__Group__3 : rule__InsurableObjects__Group__3__Impl rule__InsurableObjects__Group__4 ;
    public final void rule__InsurableObjects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__InsurableObjects__Group__3__Impl rule__InsurableObjects__Group__4 )
            // InternalMyDsl.g:1179:2: rule__InsurableObjects__Group__3__Impl rule__InsurableObjects__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__InsurableObjects__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__3"


    // $ANTLR start "rule__InsurableObjects__Group__3__Impl"
    // InternalMyDsl.g:1186:1: rule__InsurableObjects__Group__3__Impl : ( ( rule__InsurableObjects__Group_3__0 )* ) ;
    public final void rule__InsurableObjects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( ( rule__InsurableObjects__Group_3__0 )* ) )
            // InternalMyDsl.g:1191:1: ( ( rule__InsurableObjects__Group_3__0 )* )
            {
            // InternalMyDsl.g:1191:1: ( ( rule__InsurableObjects__Group_3__0 )* )
            // InternalMyDsl.g:1192:2: ( rule__InsurableObjects__Group_3__0 )*
            {
             before(grammarAccess.getInsurableObjectsAccess().getGroup_3()); 
            // InternalMyDsl.g:1193:2: ( rule__InsurableObjects__Group_3__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:1193:3: rule__InsurableObjects__Group_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InsurableObjects__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInsurableObjectsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__3__Impl"


    // $ANTLR start "rule__InsurableObjects__Group__4"
    // InternalMyDsl.g:1201:1: rule__InsurableObjects__Group__4 : rule__InsurableObjects__Group__4__Impl ;
    public final void rule__InsurableObjects__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__InsurableObjects__Group__4__Impl )
            // InternalMyDsl.g:1206:2: rule__InsurableObjects__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__4"


    // $ANTLR start "rule__InsurableObjects__Group__4__Impl"
    // InternalMyDsl.g:1212:1: rule__InsurableObjects__Group__4__Impl : ( '}' ) ;
    public final void rule__InsurableObjects__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( '}' ) )
            // InternalMyDsl.g:1217:1: ( '}' )
            {
            // InternalMyDsl.g:1217:1: ( '}' )
            // InternalMyDsl.g:1218:2: '}'
            {
             before(grammarAccess.getInsurableObjectsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInsurableObjectsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group__4__Impl"


    // $ANTLR start "rule__InsurableObjects__Group_3__0"
    // InternalMyDsl.g:1228:1: rule__InsurableObjects__Group_3__0 : rule__InsurableObjects__Group_3__0__Impl rule__InsurableObjects__Group_3__1 ;
    public final void rule__InsurableObjects__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__InsurableObjects__Group_3__0__Impl rule__InsurableObjects__Group_3__1 )
            // InternalMyDsl.g:1233:2: rule__InsurableObjects__Group_3__0__Impl rule__InsurableObjects__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__InsurableObjects__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group_3__0"


    // $ANTLR start "rule__InsurableObjects__Group_3__0__Impl"
    // InternalMyDsl.g:1240:1: rule__InsurableObjects__Group_3__0__Impl : ( ',' ) ;
    public final void rule__InsurableObjects__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( ( ',' ) )
            // InternalMyDsl.g:1245:1: ( ',' )
            {
            // InternalMyDsl.g:1245:1: ( ',' )
            // InternalMyDsl.g:1246:2: ','
            {
             before(grammarAccess.getInsurableObjectsAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInsurableObjectsAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group_3__0__Impl"


    // $ANTLR start "rule__InsurableObjects__Group_3__1"
    // InternalMyDsl.g:1255:1: rule__InsurableObjects__Group_3__1 : rule__InsurableObjects__Group_3__1__Impl ;
    public final void rule__InsurableObjects__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__InsurableObjects__Group_3__1__Impl )
            // InternalMyDsl.g:1260:2: rule__InsurableObjects__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObjects__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group_3__1"


    // $ANTLR start "rule__InsurableObjects__Group_3__1__Impl"
    // InternalMyDsl.g:1266:1: rule__InsurableObjects__Group_3__1__Impl : ( ( rule__InsurableObjects__ObjectsAssignment_3_1 ) ) ;
    public final void rule__InsurableObjects__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( rule__InsurableObjects__ObjectsAssignment_3_1 ) ) )
            // InternalMyDsl.g:1271:1: ( ( rule__InsurableObjects__ObjectsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1271:1: ( ( rule__InsurableObjects__ObjectsAssignment_3_1 ) )
            // InternalMyDsl.g:1272:2: ( rule__InsurableObjects__ObjectsAssignment_3_1 )
            {
             before(grammarAccess.getInsurableObjectsAccess().getObjectsAssignment_3_1()); 
            // InternalMyDsl.g:1273:2: ( rule__InsurableObjects__ObjectsAssignment_3_1 )
            // InternalMyDsl.g:1273:3: rule__InsurableObjects__ObjectsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObjects__ObjectsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInsurableObjectsAccess().getObjectsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__Group_3__1__Impl"


    // $ANTLR start "rule__InsurableObject__Group__0"
    // InternalMyDsl.g:1282:1: rule__InsurableObject__Group__0 : rule__InsurableObject__Group__0__Impl rule__InsurableObject__Group__1 ;
    public final void rule__InsurableObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__InsurableObject__Group__0__Impl rule__InsurableObject__Group__1 )
            // InternalMyDsl.g:1287:2: rule__InsurableObject__Group__0__Impl rule__InsurableObject__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__InsurableObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsurableObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObject__Group__0"


    // $ANTLR start "rule__InsurableObject__Group__0__Impl"
    // InternalMyDsl.g:1294:1: rule__InsurableObject__Group__0__Impl : ( 'ObjectName' ) ;
    public final void rule__InsurableObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( 'ObjectName' ) )
            // InternalMyDsl.g:1299:1: ( 'ObjectName' )
            {
            // InternalMyDsl.g:1299:1: ( 'ObjectName' )
            // InternalMyDsl.g:1300:2: 'ObjectName'
            {
             before(grammarAccess.getInsurableObjectAccess().getObjectNameKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInsurableObjectAccess().getObjectNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObject__Group__0__Impl"


    // $ANTLR start "rule__InsurableObject__Group__1"
    // InternalMyDsl.g:1309:1: rule__InsurableObject__Group__1 : rule__InsurableObject__Group__1__Impl rule__InsurableObject__Group__2 ;
    public final void rule__InsurableObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__InsurableObject__Group__1__Impl rule__InsurableObject__Group__2 )
            // InternalMyDsl.g:1314:2: rule__InsurableObject__Group__1__Impl rule__InsurableObject__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__InsurableObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsurableObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObject__Group__1"


    // $ANTLR start "rule__InsurableObject__Group__1__Impl"
    // InternalMyDsl.g:1321:1: rule__InsurableObject__Group__1__Impl : ( '=' ) ;
    public final void rule__InsurableObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( '=' ) )
            // InternalMyDsl.g:1326:1: ( '=' )
            {
            // InternalMyDsl.g:1326:1: ( '=' )
            // InternalMyDsl.g:1327:2: '='
            {
             before(grammarAccess.getInsurableObjectAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInsurableObjectAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObject__Group__1__Impl"


    // $ANTLR start "rule__InsurableObject__Group__2"
    // InternalMyDsl.g:1336:1: rule__InsurableObject__Group__2 : rule__InsurableObject__Group__2__Impl ;
    public final void rule__InsurableObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__InsurableObject__Group__2__Impl )
            // InternalMyDsl.g:1341:2: rule__InsurableObject__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObject__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObject__Group__2"


    // $ANTLR start "rule__InsurableObject__Group__2__Impl"
    // InternalMyDsl.g:1347:1: rule__InsurableObject__Group__2__Impl : ( ( rule__InsurableObject__NameAssignment_2 ) ) ;
    public final void rule__InsurableObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( ( rule__InsurableObject__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1352:1: ( ( rule__InsurableObject__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1352:1: ( ( rule__InsurableObject__NameAssignment_2 ) )
            // InternalMyDsl.g:1353:2: ( rule__InsurableObject__NameAssignment_2 )
            {
             before(grammarAccess.getInsurableObjectAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1354:2: ( rule__InsurableObject__NameAssignment_2 )
            // InternalMyDsl.g:1354:3: rule__InsurableObject__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InsurableObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsurableObjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObject__Group__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalMyDsl.g:1363:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalMyDsl.g:1368:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalMyDsl.g:1375:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:1380:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:1380:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:1381:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalMyDsl.g:1382:2: ( RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1382:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalMyDsl.g:1390:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalMyDsl.g:1395:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalMyDsl.g:1402:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( ( '.' ) )
            // InternalMyDsl.g:1407:1: ( '.' )
            {
            // InternalMyDsl.g:1407:1: ( '.' )
            // InternalMyDsl.g:1408:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalMyDsl.g:1417:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( rule__REAL__Group__2__Impl )
            // InternalMyDsl.g:1422:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalMyDsl.g:1428:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1433:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1433:1: ( RULE_INT )
            // InternalMyDsl.g:1434:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__Contract__NameAssignment_1"
    // InternalMyDsl.g:1444:1: rule__Contract__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Contract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1449:2: ( ruleEString )
            {
            // InternalMyDsl.g:1449:2: ( ruleEString )
            // InternalMyDsl.g:1450:3: ruleEString
            {
             before(grammarAccess.getContractAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContractAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__NameAssignment_1"


    // $ANTLR start "rule__Contract__CustomerAssignment_5"
    // InternalMyDsl.g:1459:1: rule__Contract__CustomerAssignment_5 : ( ruleCustomer ) ;
    public final void rule__Contract__CustomerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( ruleCustomer ) )
            // InternalMyDsl.g:1464:2: ( ruleCustomer )
            {
            // InternalMyDsl.g:1464:2: ( ruleCustomer )
            // InternalMyDsl.g:1465:3: ruleCustomer
            {
             before(grammarAccess.getContractAccess().getCustomerCustomerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getContractAccess().getCustomerCustomerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__CustomerAssignment_5"


    // $ANTLR start "rule__Contract__CompanyAssignment_6"
    // InternalMyDsl.g:1474:1: rule__Contract__CompanyAssignment_6 : ( ruleCompany ) ;
    public final void rule__Contract__CompanyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( ( ruleCompany ) )
            // InternalMyDsl.g:1479:2: ( ruleCompany )
            {
            // InternalMyDsl.g:1479:2: ( ruleCompany )
            // InternalMyDsl.g:1480:3: ruleCompany
            {
             before(grammarAccess.getContractAccess().getCompanyCompanyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getContractAccess().getCompanyCompanyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__CompanyAssignment_6"


    // $ANTLR start "rule__Contract__InsurableObjectsAssignment_8"
    // InternalMyDsl.g:1489:1: rule__Contract__InsurableObjectsAssignment_8 : ( ruleInsurableObjects ) ;
    public final void rule__Contract__InsurableObjectsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( ruleInsurableObjects ) )
            // InternalMyDsl.g:1494:2: ( ruleInsurableObjects )
            {
            // InternalMyDsl.g:1494:2: ( ruleInsurableObjects )
            // InternalMyDsl.g:1495:3: ruleInsurableObjects
            {
             before(grammarAccess.getContractAccess().getInsurableObjectsInsurableObjectsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInsurableObjects();

            state._fsp--;

             after(grammarAccess.getContractAccess().getInsurableObjectsInsurableObjectsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__InsurableObjectsAssignment_8"


    // $ANTLR start "rule__Contract__PremiumAssignment_13"
    // InternalMyDsl.g:1504:1: rule__Contract__PremiumAssignment_13 : ( ruleREAL ) ;
    public final void rule__Contract__PremiumAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( ( ruleREAL ) )
            // InternalMyDsl.g:1509:2: ( ruleREAL )
            {
            // InternalMyDsl.g:1509:2: ( ruleREAL )
            // InternalMyDsl.g:1510:3: ruleREAL
            {
             before(grammarAccess.getContractAccess().getPremiumREALParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getContractAccess().getPremiumREALParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__PremiumAssignment_13"


    // $ANTLR start "rule__Contract__IncreaseAssignment_16"
    // InternalMyDsl.g:1519:1: rule__Contract__IncreaseAssignment_16 : ( ruleREAL ) ;
    public final void rule__Contract__IncreaseAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( ( ruleREAL ) )
            // InternalMyDsl.g:1524:2: ( ruleREAL )
            {
            // InternalMyDsl.g:1524:2: ( ruleREAL )
            // InternalMyDsl.g:1525:3: ruleREAL
            {
             before(grammarAccess.getContractAccess().getIncreaseREALParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getContractAccess().getIncreaseREALParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__IncreaseAssignment_16"


    // $ANTLR start "rule__Contract__ClaimAssignment_19"
    // InternalMyDsl.g:1534:1: rule__Contract__ClaimAssignment_19 : ( ruleREAL ) ;
    public final void rule__Contract__ClaimAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( ruleREAL ) )
            // InternalMyDsl.g:1539:2: ( ruleREAL )
            {
            // InternalMyDsl.g:1539:2: ( ruleREAL )
            // InternalMyDsl.g:1540:3: ruleREAL
            {
             before(grammarAccess.getContractAccess().getClaimREALParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getContractAccess().getClaimREALParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__ClaimAssignment_19"


    // $ANTLR start "rule__Contract__PeriodAssignment_22"
    // InternalMyDsl.g:1549:1: rule__Contract__PeriodAssignment_22 : ( RULE_INT ) ;
    public final void rule__Contract__PeriodAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1554:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1554:2: ( RULE_INT )
            // InternalMyDsl.g:1555:3: RULE_INT
            {
             before(grammarAccess.getContractAccess().getPeriodINTTerminalRuleCall_22_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getPeriodINTTerminalRuleCall_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__PeriodAssignment_22"


    // $ANTLR start "rule__Customer__AddressAssignment_2"
    // InternalMyDsl.g:1564:1: rule__Customer__AddressAssignment_2 : ( ruleEString ) ;
    public final void rule__Customer__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1569:2: ( ruleEString )
            {
            // InternalMyDsl.g:1569:2: ( ruleEString )
            // InternalMyDsl.g:1570:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getAddressEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getAddressEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__AddressAssignment_2"


    // $ANTLR start "rule__Company__AddressAssignment_2"
    // InternalMyDsl.g:1579:1: rule__Company__AddressAssignment_2 : ( ruleEString ) ;
    public final void rule__Company__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1584:2: ( ruleEString )
            {
            // InternalMyDsl.g:1584:2: ( ruleEString )
            // InternalMyDsl.g:1585:3: ruleEString
            {
             before(grammarAccess.getCompanyAccess().getAddressEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getAddressEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__AddressAssignment_2"


    // $ANTLR start "rule__InsurableObjects__ObjectsAssignment_2"
    // InternalMyDsl.g:1594:1: rule__InsurableObjects__ObjectsAssignment_2 : ( ruleInsurableObject ) ;
    public final void rule__InsurableObjects__ObjectsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( ( ruleInsurableObject ) )
            // InternalMyDsl.g:1599:2: ( ruleInsurableObject )
            {
            // InternalMyDsl.g:1599:2: ( ruleInsurableObject )
            // InternalMyDsl.g:1600:3: ruleInsurableObject
            {
             before(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInsurableObject();

            state._fsp--;

             after(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__ObjectsAssignment_2"


    // $ANTLR start "rule__InsurableObjects__ObjectsAssignment_3_1"
    // InternalMyDsl.g:1609:1: rule__InsurableObjects__ObjectsAssignment_3_1 : ( ruleInsurableObject ) ;
    public final void rule__InsurableObjects__ObjectsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( ( ruleInsurableObject ) )
            // InternalMyDsl.g:1614:2: ( ruleInsurableObject )
            {
            // InternalMyDsl.g:1614:2: ( ruleInsurableObject )
            // InternalMyDsl.g:1615:3: ruleInsurableObject
            {
             before(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInsurableObject();

            state._fsp--;

             after(grammarAccess.getInsurableObjectsAccess().getObjectsInsurableObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObjects__ObjectsAssignment_3_1"


    // $ANTLR start "rule__InsurableObject__NameAssignment_2"
    // InternalMyDsl.g:1624:1: rule__InsurableObject__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InsurableObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1629:2: ( ruleEString )
            {
            // InternalMyDsl.g:1629:2: ( ruleEString )
            // InternalMyDsl.g:1630:3: ruleEString
            {
             before(grammarAccess.getInsurableObjectAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInsurableObjectAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsurableObject__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});

}