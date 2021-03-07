/**
 */
package uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.mmdd.idappdsml.modelling.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModellingFactoryImpl extends EFactoryImpl implements ModellingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModellingFactory init() {
		try {
			ModellingFactory theModellingFactory = (ModellingFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModellingPackage.eNS_URI);
			if (theModellingFactory != null) {
				return theModellingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModellingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModellingPackage.CONTRACT:
			return createContract();
		case ModellingPackage.TERMS:
			return createTerms();
		case ModellingPackage.CUSTOMER:
			return createCustomer();
		case ModellingPackage.INSURANCE_COMPANY:
			return createInsuranceCompany();
		case ModellingPackage.INSURABLE_OBJECT:
			return createInsurableObject();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terms createTerms() {
		TermsImpl terms = new TermsImpl();
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceCompany createInsuranceCompany() {
		InsuranceCompanyImpl insuranceCompany = new InsuranceCompanyImpl();
		return insuranceCompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurableObject createInsurableObject() {
		InsurableObjectImpl insurableObject = new InsurableObjectImpl();
		return insurableObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellingPackage getModellingPackage() {
		return (ModellingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModellingPackage getPackage() {
		return ModellingPackage.eINSTANCE;
	}

} //ModellingFactoryImpl
