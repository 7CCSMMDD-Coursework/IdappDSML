/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mmdd.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract
import uk.ac.kcl.inf.mmdd.services.IdappdsmlGrammarAccess

class IdappdsmlFormatter extends AbstractFormatter2 {
	
	@Inject extension IdappdsmlGrammarAccess

	def dispatch void format(Contract contract, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (terms : contract.terms) {
			terms.format
		}
	}
	
	// TODO: implement for 
}
