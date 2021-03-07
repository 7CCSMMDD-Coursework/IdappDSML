/**
 */
package uk.ac.kcl.inf.mmdd.idappdsml.modelling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getTerms <em>Terms</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurableobject <em>Insurableobject</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurancecompany <em>Insurancecompany</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getContract_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Terms> getTerms();

	/**
	 * Returns the value of the '<em><b>Insurableobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurableobject</em>' reference.
	 * @see #setInsurableobject(InsurableObject)
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getContract_Insurableobject()
	 * @model
	 * @generated
	 */
	InsurableObject getInsurableobject();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurableobject <em>Insurableobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurableobject</em>' reference.
	 * @see #getInsurableobject()
	 * @generated
	 */
	void setInsurableobject(InsurableObject value);

	/**
	 * Returns the value of the '<em><b>Insurancecompany</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurancecompany</em>' reference.
	 * @see #setInsurancecompany(InsuranceCompany)
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getContract_Insurancecompany()
	 * @model
	 * @generated
	 */
	InsuranceCompany getInsurancecompany();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurancecompany <em>Insurancecompany</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurancecompany</em>' reference.
	 * @see #getInsurancecompany()
	 * @generated
	 */
	void setInsurancecompany(InsuranceCompany value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage#getContract_Customer()
	 * @model
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

} // Contract
