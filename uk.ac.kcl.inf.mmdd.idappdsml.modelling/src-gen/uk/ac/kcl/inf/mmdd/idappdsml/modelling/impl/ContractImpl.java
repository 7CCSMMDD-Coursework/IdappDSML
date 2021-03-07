/**
 */
package uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mmdd.idappdsml.modelling.Contract;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.Customer;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsurableObject;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsuranceCompany;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl#getInsurableobject <em>Insurableobject</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl#getInsurancecompany <em>Insurancecompany</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.ContractImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract {
	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Terms> terms;

	/**
	 * The cached value of the '{@link #getInsurableobject() <em>Insurableobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurableobject()
	 * @generated
	 * @ordered
	 */
	protected InsurableObject insurableobject;

	/**
	 * The cached value of the '{@link #getInsurancecompany() <em>Insurancecompany</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancecompany()
	 * @generated
	 * @ordered
	 */
	protected InsuranceCompany insurancecompany;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellingPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terms> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<Terms>(Terms.class, this, ModellingPackage.CONTRACT__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurableObject getInsurableobject() {
		if (insurableobject != null && insurableobject.eIsProxy()) {
			InternalEObject oldInsurableobject = (InternalEObject) insurableobject;
			insurableobject = (InsurableObject) eResolveProxy(oldInsurableobject);
			if (insurableobject != oldInsurableobject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModellingPackage.CONTRACT__INSURABLEOBJECT, oldInsurableobject, insurableobject));
			}
		}
		return insurableobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurableObject basicGetInsurableobject() {
		return insurableobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurableobject(InsurableObject newInsurableobject) {
		InsurableObject oldInsurableobject = insurableobject;
		insurableobject = newInsurableobject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellingPackage.CONTRACT__INSURABLEOBJECT,
					oldInsurableobject, insurableobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceCompany getInsurancecompany() {
		if (insurancecompany != null && insurancecompany.eIsProxy()) {
			InternalEObject oldInsurancecompany = (InternalEObject) insurancecompany;
			insurancecompany = (InsuranceCompany) eResolveProxy(oldInsurancecompany);
			if (insurancecompany != oldInsurancecompany) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModellingPackage.CONTRACT__INSURANCECOMPANY, oldInsurancecompany, insurancecompany));
			}
		}
		return insurancecompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceCompany basicGetInsurancecompany() {
		return insurancecompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurancecompany(InsuranceCompany newInsurancecompany) {
		InsuranceCompany oldInsurancecompany = insurancecompany;
		insurancecompany = newInsurancecompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellingPackage.CONTRACT__INSURANCECOMPANY,
					oldInsurancecompany, insurancecompany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject) customer;
			customer = (Customer) eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModellingPackage.CONTRACT__CUSTOMER,
							oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellingPackage.CONTRACT__CUSTOMER, oldCustomer,
					customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModellingPackage.CONTRACT__TERMS:
			return ((InternalEList<?>) getTerms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModellingPackage.CONTRACT__TERMS:
			return getTerms();
		case ModellingPackage.CONTRACT__INSURABLEOBJECT:
			if (resolve)
				return getInsurableobject();
			return basicGetInsurableobject();
		case ModellingPackage.CONTRACT__INSURANCECOMPANY:
			if (resolve)
				return getInsurancecompany();
			return basicGetInsurancecompany();
		case ModellingPackage.CONTRACT__CUSTOMER:
			if (resolve)
				return getCustomer();
			return basicGetCustomer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModellingPackage.CONTRACT__TERMS:
			getTerms().clear();
			getTerms().addAll((Collection<? extends Terms>) newValue);
			return;
		case ModellingPackage.CONTRACT__INSURABLEOBJECT:
			setInsurableobject((InsurableObject) newValue);
			return;
		case ModellingPackage.CONTRACT__INSURANCECOMPANY:
			setInsurancecompany((InsuranceCompany) newValue);
			return;
		case ModellingPackage.CONTRACT__CUSTOMER:
			setCustomer((Customer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModellingPackage.CONTRACT__TERMS:
			getTerms().clear();
			return;
		case ModellingPackage.CONTRACT__INSURABLEOBJECT:
			setInsurableobject((InsurableObject) null);
			return;
		case ModellingPackage.CONTRACT__INSURANCECOMPANY:
			setInsurancecompany((InsuranceCompany) null);
			return;
		case ModellingPackage.CONTRACT__CUSTOMER:
			setCustomer((Customer) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModellingPackage.CONTRACT__TERMS:
			return terms != null && !terms.isEmpty();
		case ModellingPackage.CONTRACT__INSURABLEOBJECT:
			return insurableobject != null;
		case ModellingPackage.CONTRACT__INSURANCECOMPANY:
			return insurancecompany != null;
		case ModellingPackage.CONTRACT__CUSTOMER:
			return customer != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
