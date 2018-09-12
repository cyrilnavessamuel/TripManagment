/**
 */
package trip_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trip_model.Trip;
import trip_model.TripModel;
import trip_model.Trip_modelPackage;
import trip_model.location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trip_model.impl.TripModelImpl#getTrip <em>Trip</em>}</li>
 *   <li>{@link trip_model.impl.TripModelImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripModelImpl extends MinimalEObjectImpl.Container implements TripModel {
	/**
	 * The cached value of the '{@link #getTrip() <em>Trip</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrip()
	 * @generated
	 * @ordered
	 */
	protected EList<Trip> trip;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<location> location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Trip_modelPackage.Literals.TRIP_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trip> getTrip() {
		if (trip == null) {
			trip = new EObjectContainmentEList<Trip>(Trip.class, this, Trip_modelPackage.TRIP_MODEL__TRIP);
		}
		return trip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<location>(location.class, this,
					Trip_modelPackage.TRIP_MODEL__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Trip_modelPackage.TRIP_MODEL__TRIP:
			return ((InternalEList<?>) getTrip()).basicRemove(otherEnd, msgs);
		case Trip_modelPackage.TRIP_MODEL__LOCATION:
			return ((InternalEList<?>) getLocation()).basicRemove(otherEnd, msgs);
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
		case Trip_modelPackage.TRIP_MODEL__TRIP:
			return getTrip();
		case Trip_modelPackage.TRIP_MODEL__LOCATION:
			return getLocation();
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
		case Trip_modelPackage.TRIP_MODEL__TRIP:
			getTrip().clear();
			getTrip().addAll((Collection<? extends Trip>) newValue);
			return;
		case Trip_modelPackage.TRIP_MODEL__LOCATION:
			getLocation().clear();
			getLocation().addAll((Collection<? extends location>) newValue);
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
		case Trip_modelPackage.TRIP_MODEL__TRIP:
			getTrip().clear();
			return;
		case Trip_modelPackage.TRIP_MODEL__LOCATION:
			getLocation().clear();
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
		case Trip_modelPackage.TRIP_MODEL__TRIP:
			return trip != null && !trip.isEmpty();
		case Trip_modelPackage.TRIP_MODEL__LOCATION:
			return location != null && !location.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TripModelImpl
