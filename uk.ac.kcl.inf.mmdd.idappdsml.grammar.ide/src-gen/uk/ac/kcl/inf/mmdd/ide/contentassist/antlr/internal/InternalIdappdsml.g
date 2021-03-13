/*
 * generated by Xtext 2.24.0
 */
grammar InternalIdappdsml;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.inf.mmdd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.mmdd.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.mmdd.services.IdappdsmlGrammarAccess;

}
@parser::members {
	private IdappdsmlGrammarAccess grammarAccess;

	public void setGrammarAccess(IdappdsmlGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleContract
entryRuleContract
:
{ before(grammarAccess.getContractRule()); }
	 ruleContract
{ after(grammarAccess.getContractRule()); } 
	 EOF 
;

// Rule Contract
ruleContract 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContractAccess().getGroup()); }
		(rule__Contract__Group__0)
		{ after(grammarAccess.getContractAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerms
entryRuleTerms
:
{ before(grammarAccess.getTermsRule()); }
	 ruleTerms
{ after(grammarAccess.getTermsRule()); } 
	 EOF 
;

// Rule Terms
ruleTerms 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTermsAccess().getGroup()); }
		(rule__Terms__Group__0)
		{ after(grammarAccess.getTermsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__0__Impl
	rule__Contract__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getContractAction_0()); }
	()
	{ after(grammarAccess.getContractAccess().getContractAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__1__Impl
	rule__Contract__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getContractKeyword_1()); }
	'Contract'
	{ after(grammarAccess.getContractAccess().getContractKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__2__Impl
	rule__Contract__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__3__Impl
	rule__Contract__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getGroup_3()); }
	(rule__Contract__Group_3__0)?
	{ after(grammarAccess.getContractAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__4__Impl
	rule__Contract__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getGroup_4()); }
	(rule__Contract__Group_4__0)?
	{ after(grammarAccess.getContractAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__5__Impl
	rule__Contract__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getGroup_5()); }
	(rule__Contract__Group_5__0)?
	{ after(grammarAccess.getContractAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__6__Impl
	rule__Contract__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getGroup_6()); }
	(rule__Contract__Group_6__0)?
	{ after(grammarAccess.getContractAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contract__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_3__0__Impl
	rule__Contract__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getInsurableobjectKeyword_3_0()); }
	'insurableobject'
	{ after(grammarAccess.getContractAccess().getInsurableobjectKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getInsurableobjectAssignment_3_1()); }
	(rule__Contract__InsurableobjectAssignment_3_1)
	{ after(grammarAccess.getContractAccess().getInsurableobjectAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contract__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_4__0__Impl
	rule__Contract__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getInsurancecompanyKeyword_4_0()); }
	'insurancecompany'
	{ after(grammarAccess.getContractAccess().getInsurancecompanyKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getInsurancecompanyAssignment_4_1()); }
	(rule__Contract__InsurancecompanyAssignment_4_1)
	{ after(grammarAccess.getContractAccess().getInsurancecompanyAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contract__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_5__0__Impl
	rule__Contract__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getCustomerKeyword_5_0()); }
	'customer'
	{ after(grammarAccess.getContractAccess().getCustomerKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getCustomerAssignment_5_1()); }
	(rule__Contract__CustomerAssignment_5_1)
	{ after(grammarAccess.getContractAccess().getCustomerAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contract__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_6__0__Impl
	rule__Contract__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getTermsKeyword_6_0()); }
	'terms'
	{ after(grammarAccess.getContractAccess().getTermsKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_6__1__Impl
	rule__Contract__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_6_1()); }
	'{'
	{ after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_6__2__Impl
	rule__Contract__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getTermsAssignment_6_2()); }
	(rule__Contract__TermsAssignment_6_2)
	{ after(grammarAccess.getContractAccess().getTermsAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_6__3__Impl
	rule__Contract__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getGroup_6_3()); }
	(rule__Contract__Group_6_3__0)*
	{ after(grammarAccess.getContractAccess().getGroup_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_6_4()); }
	'}'
	{ after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contract__Group_6_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_6_3__0__Impl
	rule__Contract__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getCommaKeyword_6_3_0()); }
	','
	{ after(grammarAccess.getContractAccess().getCommaKeyword_6_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contract__Group_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__Group_6_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContractAccess().getTermsAssignment_6_3_1()); }
	(rule__Contract__TermsAssignment_6_3_1)
	{ after(grammarAccess.getContractAccess().getTermsAssignment_6_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Terms__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terms__Group__0__Impl
	rule__Terms__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermsAccess().getTermsAction_0()); }
	()
	{ after(grammarAccess.getTermsAccess().getTermsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terms__Group__1__Impl
	rule__Terms__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermsAccess().getTermsKeyword_1()); }
	'Terms'
	{ after(grammarAccess.getTermsAccess().getTermsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terms__Group__2__Impl
	rule__Terms__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTermsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terms__Group__3__Impl
	rule__Terms__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermsAccess().getGroup_3()); }
	(rule__Terms__Group_3__0)?
	{ after(grammarAccess.getTermsAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terms__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTermsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Terms__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terms__Group_3__0__Impl
	rule__Terms__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermsAccess().getInsurableobjectKeyword_3_0()); }
	'insurableobject'
	{ after(grammarAccess.getTermsAccess().getInsurableobjectKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terms__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermsAccess().getInsurableobjectAssignment_3_1()); }
	(rule__Terms__InsurableobjectAssignment_3_1)
	{ after(grammarAccess.getTermsAccess().getInsurableobjectAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contract__InsurableobjectAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContractAccess().getInsurableobjectInsurableObjectCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getContractAccess().getInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getContractAccess().getInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getContractAccess().getInsurableobjectInsurableObjectCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__InsurancecompanyAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContractAccess().getInsurancecompanyInsuranceCompanyCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getContractAccess().getInsurancecompanyInsuranceCompanyEStringParserRuleCall_4_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getContractAccess().getInsurancecompanyInsuranceCompanyEStringParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getContractAccess().getInsurancecompanyInsuranceCompanyCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__CustomerAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContractAccess().getCustomerCustomerCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getContractAccess().getCustomerCustomerEStringParserRuleCall_5_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getContractAccess().getCustomerCustomerEStringParserRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getContractAccess().getCustomerCustomerCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__TermsAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContractAccess().getTermsTermsParserRuleCall_6_2_0()); }
		ruleTerms
		{ after(grammarAccess.getContractAccess().getTermsTermsParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contract__TermsAssignment_6_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContractAccess().getTermsTermsParserRuleCall_6_3_1_0()); }
		ruleTerms
		{ after(grammarAccess.getContractAccess().getTermsTermsParserRuleCall_6_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terms__InsurableobjectAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermsAccess().getInsurableobjectInsurableObjectCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getTermsAccess().getInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getTermsAccess().getInsurableobjectInsurableObjectEStringParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getTermsAccess().getInsurableobjectInsurableObjectCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
