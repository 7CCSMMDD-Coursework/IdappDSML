/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getContractAccess().getGroup(), "rule__Contract__Group__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
			builder.put(grammarAccess.getCompanyAccess().getGroup(), "rule__Company__Group__0");
			builder.put(grammarAccess.getInsurableObjectsAccess().getGroup(), "rule__InsurableObjects__Group__0");
			builder.put(grammarAccess.getInsurableObjectsAccess().getGroup_3(), "rule__InsurableObjects__Group_3__0");
			builder.put(grammarAccess.getInsurableObjectAccess().getGroup(), "rule__InsurableObject__Group__0");
			builder.put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
			builder.put(grammarAccess.getContractAccess().getNameAssignment_1(), "rule__Contract__NameAssignment_1");
			builder.put(grammarAccess.getContractAccess().getCustomerAssignment_5(), "rule__Contract__CustomerAssignment_5");
			builder.put(grammarAccess.getContractAccess().getCompanyAssignment_6(), "rule__Contract__CompanyAssignment_6");
			builder.put(grammarAccess.getContractAccess().getInsurableObjectsAssignment_8(), "rule__Contract__InsurableObjectsAssignment_8");
			builder.put(grammarAccess.getContractAccess().getPremiumAssignment_13(), "rule__Contract__PremiumAssignment_13");
			builder.put(grammarAccess.getContractAccess().getIncreaseAssignment_16(), "rule__Contract__IncreaseAssignment_16");
			builder.put(grammarAccess.getContractAccess().getClaimAssignment_19(), "rule__Contract__ClaimAssignment_19");
			builder.put(grammarAccess.getContractAccess().getPeriodAssignment_22(), "rule__Contract__PeriodAssignment_22");
			builder.put(grammarAccess.getCustomerAccess().getAddressAssignment_2(), "rule__Customer__AddressAssignment_2");
			builder.put(grammarAccess.getCompanyAccess().getAddressAssignment_2(), "rule__Company__AddressAssignment_2");
			builder.put(grammarAccess.getInsurableObjectsAccess().getObjectsAssignment_2(), "rule__InsurableObjects__ObjectsAssignment_2");
			builder.put(grammarAccess.getInsurableObjectsAccess().getObjectsAssignment_3_1(), "rule__InsurableObjects__ObjectsAssignment_3_1");
			builder.put(grammarAccess.getInsurableObjectAccess().getNameAssignment_2(), "rule__InsurableObject__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
