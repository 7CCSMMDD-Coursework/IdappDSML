/**
 */
package uk.ac.kcl.inf.mmdd.idappdsml.modelling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms#getInsurableobject <em>Insurableobject</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getTerms()
 * @model
 * @generated
 */
public interface Terms extends EObject {
	/**
	 * Returns the value of the '<em><b>Insurableobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurableobject</em>' reference.
	 * @see #setInsurableobject(InsurableObject)
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getTerms_Insurableobject()
	 * @model
	 * @generated
	 */
	InsurableObject getInsurableobject();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms#getInsurableobject <em>Insurableobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurableobject</em>' reference.
	 * @see #getInsurableobject()
	 * @generated
	 */
	void setInsurableobject(InsurableObject value);

} // Terms
