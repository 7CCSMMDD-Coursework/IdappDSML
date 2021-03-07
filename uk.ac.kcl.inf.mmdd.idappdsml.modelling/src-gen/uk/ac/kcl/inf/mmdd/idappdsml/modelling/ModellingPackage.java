/**
 */
package uk.ac.kcl.inf.mmdd.idappdsml.modelling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingFactory
 * @model kind="package"
 * @generated
 */
public interface ModellingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modelling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModellingPackage eINSTANCE = uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TERMS = 0;

	/**
	 * The feature id for the '<em><b>Insurableobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INSURABLEOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Insurancecompany</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INSURANCECOMPANY = 2;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CUSTOMER = 3;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.TermsImpl <em>Terms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.TermsImpl
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getTerms()
	 * @generated
	 */
	int TERMS = 1;

	/**
	 * The feature id for the '<em><b>Insurableobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS__INSURABLEOBJECT = 0;

	/**
	 * The number of structural features of the '<em>Terms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Terms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.CustomerImpl
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsuranceCompanyImpl <em>Insurance Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsuranceCompanyImpl
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getInsuranceCompany()
	 * @generated
	 */
	int INSURANCE_COMPANY = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_COMPANY__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Insurance Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_COMPANY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Insurance Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_COMPANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsurableObjectImpl <em>Insurable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsurableObjectImpl
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getInsurableObject()
	 * @generated
	 */
	int INSURABLE_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>Insurable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURABLE_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Insurable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURABLE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getTerms()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Terms();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurableobject <em>Insurableobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insurableobject</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurableobject()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Insurableobject();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurancecompany <em>Insurancecompany</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insurancecompany</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getInsurancecompany()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Insurancecompany();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract#getCustomer()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Customer();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terms</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms
	 * @generated
	 */
	EClass getTerms();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms#getInsurableobject <em>Insurableobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insurableobject</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms#getInsurableobject()
	 * @see #getTerms()
	 * @generated
	 */
	EReference getTerms_Insurableobject();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Address();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsuranceCompany <em>Insurance Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurance Company</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsuranceCompany
	 * @generated
	 */
	EClass getInsuranceCompany();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsuranceCompany#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsuranceCompany#getAddress()
	 * @see #getInsuranceCompany()
	 * @generated
	 */
	EAttribute getInsuranceCompany_Address();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsurableObject <em>Insurable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurable Object</em>'.
	 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsurableObject
	 * @generated
	 */
	EClass getInsurableObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModellingFactory getModellingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__TERMS = eINSTANCE.getContract_Terms();

		/**
		 * The meta object literal for the '<em><b>Insurableobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__INSURABLEOBJECT = eINSTANCE.getContract_Insurableobject();

		/**
		 * The meta object literal for the '<em><b>Insurancecompany</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__INSURANCECOMPANY = eINSTANCE.getContract_Insurancecompany();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__CUSTOMER = eINSTANCE.getContract_Customer();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.TermsImpl <em>Terms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.TermsImpl
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getTerms()
		 * @generated
		 */
		EClass TERMS = eINSTANCE.getTerms();

		/**
		 * The meta object literal for the '<em><b>Insurableobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMS__INSURABLEOBJECT = eINSTANCE.getTerms_Insurableobject();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.CustomerImpl
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsuranceCompanyImpl <em>Insurance Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsuranceCompanyImpl
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getInsuranceCompany()
		 * @generated
		 */
		EClass INSURANCE_COMPANY = eINSTANCE.getInsuranceCompany();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_COMPANY__ADDRESS = eINSTANCE.getInsuranceCompany_Address();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsurableObjectImpl <em>Insurable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.InsurableObjectImpl
		 * @see uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ModellingPackageImpl#getInsurableObject()
		 * @generated
		 */
		EClass INSURABLE_OBJECT = eINSTANCE.getInsurableObject();

	}

} //ModellingPackage
