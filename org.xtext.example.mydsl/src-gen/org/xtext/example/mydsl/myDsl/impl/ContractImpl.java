/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Company;
import org.xtext.example.mydsl.myDsl.Contract;
import org.xtext.example.mydsl.myDsl.Customer;
import org.xtext.example.mydsl.myDsl.InsurableObjects;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getInsurableObjects <em>Insurable Objects</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getPremium <em>Premium</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getIncrease <em>Increase</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContractImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCustomer() <em>Customer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomer()
   * @generated
   * @ordered
   */
  protected Customer customer;

  /**
   * The cached value of the '{@link #getCompany() <em>Company</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompany()
   * @generated
   * @ordered
   */
  protected Company company;

  /**
   * The cached value of the '{@link #getInsurableObjects() <em>Insurable Objects</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsurableObjects()
   * @generated
   * @ordered
   */
  protected InsurableObjects insurableObjects;

  /**
   * The default value of the '{@link #getPremium() <em>Premium</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPremium()
   * @generated
   * @ordered
   */
  protected static final float PREMIUM_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getPremium() <em>Premium</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPremium()
   * @generated
   * @ordered
   */
  protected float premium = PREMIUM_EDEFAULT;

  /**
   * The default value of the '{@link #getIncrease() <em>Increase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrease()
   * @generated
   * @ordered
   */
  protected static final float INCREASE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getIncrease() <em>Increase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrease()
   * @generated
   * @ordered
   */
  protected float increase = INCREASE_EDEFAULT;

  /**
   * The default value of the '{@link #getClaim() <em>Claim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaim()
   * @generated
   * @ordered
   */
  protected static final float CLAIM_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getClaim() <em>Claim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaim()
   * @generated
   * @ordered
   */
  protected float claim = CLAIM_EDEFAULT;

  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final int PERIOD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected int period = PERIOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.CONTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Customer getCustomer()
  {
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs)
  {
    Customer oldCustomer = customer;
    customer = newCustomer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__CUSTOMER, oldCustomer, newCustomer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCustomer(Customer newCustomer)
  {
    if (newCustomer != customer)
    {
      NotificationChain msgs = null;
      if (customer != null)
        msgs = ((InternalEObject)customer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONTRACT__CUSTOMER, null, msgs);
      if (newCustomer != null)
        msgs = ((InternalEObject)newCustomer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONTRACT__CUSTOMER, null, msgs);
      msgs = basicSetCustomer(newCustomer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__CUSTOMER, newCustomer, newCustomer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Company getCompany()
  {
    return company;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompany(Company newCompany, NotificationChain msgs)
  {
    Company oldCompany = company;
    company = newCompany;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__COMPANY, oldCompany, newCompany);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCompany(Company newCompany)
  {
    if (newCompany != company)
    {
      NotificationChain msgs = null;
      if (company != null)
        msgs = ((InternalEObject)company).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONTRACT__COMPANY, null, msgs);
      if (newCompany != null)
        msgs = ((InternalEObject)newCompany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONTRACT__COMPANY, null, msgs);
      msgs = basicSetCompany(newCompany, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__COMPANY, newCompany, newCompany));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InsurableObjects getInsurableObjects()
  {
    return insurableObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsurableObjects(InsurableObjects newInsurableObjects, NotificationChain msgs)
  {
    InsurableObjects oldInsurableObjects = insurableObjects;
    insurableObjects = newInsurableObjects;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__INSURABLE_OBJECTS, oldInsurableObjects, newInsurableObjects);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInsurableObjects(InsurableObjects newInsurableObjects)
  {
    if (newInsurableObjects != insurableObjects)
    {
      NotificationChain msgs = null;
      if (insurableObjects != null)
        msgs = ((InternalEObject)insurableObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONTRACT__INSURABLE_OBJECTS, null, msgs);
      if (newInsurableObjects != null)
        msgs = ((InternalEObject)newInsurableObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONTRACT__INSURABLE_OBJECTS, null, msgs);
      msgs = basicSetInsurableObjects(newInsurableObjects, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__INSURABLE_OBJECTS, newInsurableObjects, newInsurableObjects));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getPremium()
  {
    return premium;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPremium(float newPremium)
  {
    float oldPremium = premium;
    premium = newPremium;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__PREMIUM, oldPremium, premium));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getIncrease()
  {
    return increase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIncrease(float newIncrease)
  {
    float oldIncrease = increase;
    increase = newIncrease;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__INCREASE, oldIncrease, increase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getClaim()
  {
    return claim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClaim(float newClaim)
  {
    float oldClaim = claim;
    claim = newClaim;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__CLAIM, oldClaim, claim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPeriod(int newPeriod)
  {
    int oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.CONTRACT__CUSTOMER:
        return basicSetCustomer(null, msgs);
      case MyDslPackage.CONTRACT__COMPANY:
        return basicSetCompany(null, msgs);
      case MyDslPackage.CONTRACT__INSURABLE_OBJECTS:
        return basicSetInsurableObjects(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.CONTRACT__NAME:
        return getName();
      case MyDslPackage.CONTRACT__CUSTOMER:
        return getCustomer();
      case MyDslPackage.CONTRACT__COMPANY:
        return getCompany();
      case MyDslPackage.CONTRACT__INSURABLE_OBJECTS:
        return getInsurableObjects();
      case MyDslPackage.CONTRACT__PREMIUM:
        return getPremium();
      case MyDslPackage.CONTRACT__INCREASE:
        return getIncrease();
      case MyDslPackage.CONTRACT__CLAIM:
        return getClaim();
      case MyDslPackage.CONTRACT__PERIOD:
        return getPeriod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CONTRACT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.CONTRACT__CUSTOMER:
        setCustomer((Customer)newValue);
        return;
      case MyDslPackage.CONTRACT__COMPANY:
        setCompany((Company)newValue);
        return;
      case MyDslPackage.CONTRACT__INSURABLE_OBJECTS:
        setInsurableObjects((InsurableObjects)newValue);
        return;
      case MyDslPackage.CONTRACT__PREMIUM:
        setPremium((Float)newValue);
        return;
      case MyDslPackage.CONTRACT__INCREASE:
        setIncrease((Float)newValue);
        return;
      case MyDslPackage.CONTRACT__CLAIM:
        setClaim((Float)newValue);
        return;
      case MyDslPackage.CONTRACT__PERIOD:
        setPeriod((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CONTRACT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.CONTRACT__CUSTOMER:
        setCustomer((Customer)null);
        return;
      case MyDslPackage.CONTRACT__COMPANY:
        setCompany((Company)null);
        return;
      case MyDslPackage.CONTRACT__INSURABLE_OBJECTS:
        setInsurableObjects((InsurableObjects)null);
        return;
      case MyDslPackage.CONTRACT__PREMIUM:
        setPremium(PREMIUM_EDEFAULT);
        return;
      case MyDslPackage.CONTRACT__INCREASE:
        setIncrease(INCREASE_EDEFAULT);
        return;
      case MyDslPackage.CONTRACT__CLAIM:
        setClaim(CLAIM_EDEFAULT);
        return;
      case MyDslPackage.CONTRACT__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CONTRACT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.CONTRACT__CUSTOMER:
        return customer != null;
      case MyDslPackage.CONTRACT__COMPANY:
        return company != null;
      case MyDslPackage.CONTRACT__INSURABLE_OBJECTS:
        return insurableObjects != null;
      case MyDslPackage.CONTRACT__PREMIUM:
        return premium != PREMIUM_EDEFAULT;
      case MyDslPackage.CONTRACT__INCREASE:
        return increase != INCREASE_EDEFAULT;
      case MyDslPackage.CONTRACT__CLAIM:
        return claim != CLAIM_EDEFAULT;
      case MyDslPackage.CONTRACT__PERIOD:
        return period != PERIOD_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", premium: ");
    result.append(premium);
    result.append(", increase: ");
    result.append(increase);
    result.append(", claim: ");
    result.append(claim);
    result.append(", period: ");
    result.append(period);
    result.append(')');
    return result.toString();
  }

} //ContractImpl
