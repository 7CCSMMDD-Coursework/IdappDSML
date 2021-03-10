/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mmdd.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms;
import uk.ac.kcl.inf.mmdd.services.IdappdsmlGrammarAccess;

@SuppressWarnings("all")
public class IdappdsmlFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private IdappdsmlGrammarAccess _idappdsmlGrammarAccess;
  
  protected void _format(final Contract contract, @Extension final IFormattableDocument document) {
    EList<Terms> _terms = contract.getTerms();
    for (final Terms terms : _terms) {
      document.<Terms>format(terms);
    }
  }
  
  public void format(final Object contract, final IFormattableDocument document) {
    if (contract instanceof XtextResource) {
      _format((XtextResource)contract, document);
      return;
    } else if (contract instanceof Contract) {
      _format((Contract)contract, document);
      return;
    } else if (contract instanceof EObject) {
      _format((EObject)contract, document);
      return;
    } else if (contract == null) {
      _format((Void)null, document);
      return;
    } else if (contract != null) {
      _format(contract, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(contract, document).toString());
    }
  }
}
