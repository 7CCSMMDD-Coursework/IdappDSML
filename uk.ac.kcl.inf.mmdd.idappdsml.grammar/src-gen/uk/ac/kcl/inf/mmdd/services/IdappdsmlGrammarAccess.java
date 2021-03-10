/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mmdd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class IdappdsmlGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ContractElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.mmdd.Idappdsml.Contract");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContractAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContractKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInsurableobjectKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInsurableobjectAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInsurableobjectInsurableObjectCrossReference_3_1_0 = (CrossReference)cInsurableobjectAssignment_3_1.eContents().get(0);
		private final RuleCall cInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1 = (RuleCall)cInsurableobjectInsurableObjectCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInsurancecompanyKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInsurancecompanyAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cInsurancecompanyInsuranceCompanyCrossReference_4_1_0 = (CrossReference)cInsurancecompanyAssignment_4_1.eContents().get(0);
		private final RuleCall cInsurancecompanyInsuranceCompanyEStringParserRuleCall_4_1_0_1 = (RuleCall)cInsurancecompanyInsuranceCompanyCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCustomerKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCustomerAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cCustomerCustomerCrossReference_5_1_0 = (CrossReference)cCustomerAssignment_5_1.eContents().get(0);
		private final RuleCall cCustomerCustomerEStringParserRuleCall_5_1_0_1 = (RuleCall)cCustomerCustomerCrossReference_5_1_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTermsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cTermsAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cTermsTermsParserRuleCall_6_2_0 = (RuleCall)cTermsAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cTermsAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cTermsTermsParserRuleCall_6_3_1_0 = (RuleCall)cTermsAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Contract:
		//	{Contract}
		//	'Contract'
		//	'{' ('insurableobject' insurableobject=[InsurableObject|EString])? ('insurancecompany'
		//	insurancecompany=[InsuranceCompany|EString])? ('customer' customer=[Customer|EString])? ('terms' '{' terms+=Terms
		//	("," terms+=Terms)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Contract} 'Contract' '{' ('insurableobject' insurableobject=[InsurableObject|EString])? ('insurancecompany'
		//insurancecompany=[InsuranceCompany|EString])? ('customer' customer=[Customer|EString])? ('terms' '{' terms+=Terms (","
		//terms+=Terms)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{Contract}
		public Action getContractAction_0() { return cContractAction_0; }
		
		//'Contract'
		public Keyword getContractKeyword_1() { return cContractKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('insurableobject' insurableobject=[InsurableObject|EString])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'insurableobject'
		public Keyword getInsurableobjectKeyword_3_0() { return cInsurableobjectKeyword_3_0; }
		
		//insurableobject=[InsurableObject|EString]
		public Assignment getInsurableobjectAssignment_3_1() { return cInsurableobjectAssignment_3_1; }
		
		//[InsurableObject|EString]
		public CrossReference getInsurableobjectInsurableObjectCrossReference_3_1_0() { return cInsurableobjectInsurableObjectCrossReference_3_1_0; }
		
		//EString
		public RuleCall getInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1() { return cInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1; }
		
		//('insurancecompany' insurancecompany=[InsuranceCompany|EString])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'insurancecompany'
		public Keyword getInsurancecompanyKeyword_4_0() { return cInsurancecompanyKeyword_4_0; }
		
		//insurancecompany=[InsuranceCompany|EString]
		public Assignment getInsurancecompanyAssignment_4_1() { return cInsurancecompanyAssignment_4_1; }
		
		//[InsuranceCompany|EString]
		public CrossReference getInsurancecompanyInsuranceCompanyCrossReference_4_1_0() { return cInsurancecompanyInsuranceCompanyCrossReference_4_1_0; }
		
		//EString
		public RuleCall getInsurancecompanyInsuranceCompanyEStringParserRuleCall_4_1_0_1() { return cInsurancecompanyInsuranceCompanyEStringParserRuleCall_4_1_0_1; }
		
		//('customer' customer=[Customer|EString])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'customer'
		public Keyword getCustomerKeyword_5_0() { return cCustomerKeyword_5_0; }
		
		//customer=[Customer|EString]
		public Assignment getCustomerAssignment_5_1() { return cCustomerAssignment_5_1; }
		
		//[Customer|EString]
		public CrossReference getCustomerCustomerCrossReference_5_1_0() { return cCustomerCustomerCrossReference_5_1_0; }
		
		//EString
		public RuleCall getCustomerCustomerEStringParserRuleCall_5_1_0_1() { return cCustomerCustomerEStringParserRuleCall_5_1_0_1; }
		
		//('terms' '{' terms+=Terms ("," terms+=Terms)* '}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'terms'
		public Keyword getTermsKeyword_6_0() { return cTermsKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//terms+=Terms
		public Assignment getTermsAssignment_6_2() { return cTermsAssignment_6_2; }
		
		//Terms
		public RuleCall getTermsTermsParserRuleCall_6_2_0() { return cTermsTermsParserRuleCall_6_2_0; }
		
		//("," terms+=Terms)*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//terms+=Terms
		public Assignment getTermsAssignment_6_3_1() { return cTermsAssignment_6_3_1; }
		
		//Terms
		public RuleCall getTermsTermsParserRuleCall_6_3_1_0() { return cTermsTermsParserRuleCall_6_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class TermsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.mmdd.Idappdsml.Terms");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTermsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTermsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInsurableobjectKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInsurableobjectAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInsurableobjectInsurableObjectCrossReference_3_1_0 = (CrossReference)cInsurableobjectAssignment_3_1.eContents().get(0);
		private final RuleCall cInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1 = (RuleCall)cInsurableobjectInsurableObjectCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Terms:
		//	{Terms}
		//	'Terms'
		//	'{' ('insurableobject' insurableobject=[InsurableObject|EString])?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Terms} 'Terms' '{' ('insurableobject' insurableobject=[InsurableObject|EString])? '}'
		public Group getGroup() { return cGroup; }
		
		//{Terms}
		public Action getTermsAction_0() { return cTermsAction_0; }
		
		//'Terms'
		public Keyword getTermsKeyword_1() { return cTermsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('insurableobject' insurableobject=[InsurableObject|EString])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'insurableobject'
		public Keyword getInsurableobjectKeyword_3_0() { return cInsurableobjectKeyword_3_0; }
		
		//insurableobject=[InsurableObject|EString]
		public Assignment getInsurableobjectAssignment_3_1() { return cInsurableobjectAssignment_3_1; }
		
		//[InsurableObject|EString]
		public CrossReference getInsurableobjectInsurableObjectCrossReference_3_1_0() { return cInsurableobjectInsurableObjectCrossReference_3_1_0; }
		
		//EString
		public RuleCall getInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1() { return cInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class InsurableObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.mmdd.Idappdsml.InsurableObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInsurableObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInsurableObjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//InsurableObject:
		//	{InsurableObject}
		//	'InsurableObject';
		@Override public ParserRule getRule() { return rule; }
		
		//{InsurableObject} 'InsurableObject'
		public Group getGroup() { return cGroup; }
		
		//{InsurableObject}
		public Action getInsurableObjectAction_0() { return cInsurableObjectAction_0; }
		
		//'InsurableObject'
		public Keyword getInsurableObjectKeyword_1() { return cInsurableObjectKeyword_1; }
	}
	public class InsuranceCompanyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.mmdd.Idappdsml.InsuranceCompany");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInsuranceCompanyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInsuranceCompanyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAddressKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAddressAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAddressEStringParserRuleCall_3_1_0 = (RuleCall)cAddressAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InsuranceCompany:
		//	{InsuranceCompany}
		//	'InsuranceCompany'
		//	'{' ('address' address=EString)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{InsuranceCompany} 'InsuranceCompany' '{' ('address' address=EString)? '}'
		public Group getGroup() { return cGroup; }
		
		//{InsuranceCompany}
		public Action getInsuranceCompanyAction_0() { return cInsuranceCompanyAction_0; }
		
		//'InsuranceCompany'
		public Keyword getInsuranceCompanyKeyword_1() { return cInsuranceCompanyKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('address' address=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'address'
		public Keyword getAddressKeyword_3_0() { return cAddressKeyword_3_0; }
		
		//address=EString
		public Assignment getAddressAssignment_3_1() { return cAddressAssignment_3_1; }
		
		//EString
		public RuleCall getAddressEStringParserRuleCall_3_1_0() { return cAddressEStringParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CustomerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.mmdd.Idappdsml.Customer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCustomerAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCustomerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAddressKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAddressAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAddressEStringParserRuleCall_3_1_0 = (RuleCall)cAddressAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Customer:
		//	{Customer}
		//	'Customer'
		//	'{' ('address' address=EString)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Customer} 'Customer' '{' ('address' address=EString)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Customer}
		public Action getCustomerAction_0() { return cCustomerAction_0; }
		
		//'Customer'
		public Keyword getCustomerKeyword_1() { return cCustomerKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('address' address=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'address'
		public Keyword getAddressKeyword_3_0() { return cAddressKeyword_3_0; }
		
		//address=EString
		public Assignment getAddressAssignment_3_1() { return cAddressAssignment_3_1; }
		
		//EString
		public RuleCall getAddressEStringParserRuleCall_3_1_0() { return cAddressEStringParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.mmdd.Idappdsml.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final ContractElements pContract;
	private final TermsElements pTerms;
	private final InsurableObjectElements pInsurableObject;
	private final InsuranceCompanyElements pInsuranceCompany;
	private final CustomerElements pCustomer;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public IdappdsmlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pContract = new ContractElements();
		this.pTerms = new TermsElements();
		this.pInsurableObject = new InsurableObjectElements();
		this.pInsuranceCompany = new InsuranceCompanyElements();
		this.pCustomer = new CustomerElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.inf.mmdd.Idappdsml".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Contract:
	//	{Contract}
	//	'Contract'
	//	'{' ('insurableobject' insurableobject=[InsurableObject|EString])? ('insurancecompany'
	//	insurancecompany=[InsuranceCompany|EString])? ('customer' customer=[Customer|EString])? ('terms' '{' terms+=Terms
	//	("," terms+=Terms)* '}')?
	//	'}';
	public ContractElements getContractAccess() {
		return pContract;
	}
	
	public ParserRule getContractRule() {
		return getContractAccess().getRule();
	}
	
	//Terms:
	//	{Terms}
	//	'Terms'
	//	'{' ('insurableobject' insurableobject=[InsurableObject|EString])?
	//	'}';
	public TermsElements getTermsAccess() {
		return pTerms;
	}
	
	public ParserRule getTermsRule() {
		return getTermsAccess().getRule();
	}
	
	//InsurableObject:
	//	{InsurableObject}
	//	'InsurableObject';
	public InsurableObjectElements getInsurableObjectAccess() {
		return pInsurableObject;
	}
	
	public ParserRule getInsurableObjectRule() {
		return getInsurableObjectAccess().getRule();
	}
	
	//InsuranceCompany:
	//	{InsuranceCompany}
	//	'InsuranceCompany'
	//	'{' ('address' address=EString)?
	//	'}';
	public InsuranceCompanyElements getInsuranceCompanyAccess() {
		return pInsuranceCompany;
	}
	
	public ParserRule getInsuranceCompanyRule() {
		return getInsuranceCompanyAccess().getRule();
	}
	
	//Customer:
	//	{Customer}
	//	'Customer'
	//	'{' ('address' address=EString)?
	//	'}';
	public CustomerElements getCustomerAccess() {
		return pCustomer;
	}
	
	public ParserRule getCustomerRule() {
		return getCustomerAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
