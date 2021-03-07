/**
 */
package uk.ac.kcl.inf.mmdd.idappdsml.modelling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsuranceCompany#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getInsuranceCompany()
 * @model
 * @generated
 */
public interface InsuranceCompany extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getInsuranceCompany_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsuranceCompany#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // InsuranceCompany
