/**
 */
package uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.mmdd.idappdsml.modelling.InsurableObject;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.ModellingPackage;
import uk.ac.kcl.inf.mmdd.idappdsml.modelling.Terms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mmdd.idappdsml.modelling.impl.TermsImpl#getInsurableobject <em>Insurableobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermsImpl extends MinimalEObjectImpl.Container implements Terms {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellingPackage.Literals.TERMS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModellingPackage.TERMS__INSURABLEOBJECT,
							oldInsurableobject, insurableobject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModellingPackage.TERMS__INSURABLEOBJECT,
					oldInsurableobject, insurableobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModellingPackage.TERMS__INSURABLEOBJECT:
			if (resolve)
				return getInsurableobject();
			return basicGetInsurableobject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModellingPackage.TERMS__INSURABLEOBJECT:
			setInsurableobject((InsurableObject) newValue);
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
		case ModellingPackage.TERMS__INSURABLEOBJECT:
			setInsurableobject((InsurableObject) null);
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
		case ModellingPackage.TERMS__INSURABLEOBJECT:
			return insurableobject != null;
		}
		return super.eIsSet(featureID);
	}

} //TermsImpl
