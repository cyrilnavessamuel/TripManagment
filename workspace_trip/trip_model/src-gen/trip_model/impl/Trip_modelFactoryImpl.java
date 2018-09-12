/**
 */
package trip_model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trip_model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Trip_modelFactoryImpl extends EFactoryImpl implements Trip_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Trip_modelFactory init() {
		try {
			Trip_modelFactory theTrip_modelFactory = (Trip_modelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Trip_modelPackage.eNS_URI);
			if (theTrip_modelFactory != null) {
				return theTrip_modelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Trip_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trip_modelFactoryImpl() {
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
		case Trip_modelPackage.SERVICE:
			return createService();
		case Trip_modelPackage.OTHER_SERVICE:
			return createOtherService();
		case Trip_modelPackage.TRAVEL_SERVICE:
			return createTravelService();
		case Trip_modelPackage.TRIP:
			return createTrip();
		case Trip_modelPackage.LOCATION:
			return createlocation();
		case Trip_modelPackage.TRIP_MODEL:
			return createTripModel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trip createTrip() {
		TripImpl trip = new TripImpl();
		return trip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public location createlocation() {
		locationImpl location = new locationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripModel createTripModel() {
		TripModelImpl tripModel = new TripModelImpl();
		return tripModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherService createOtherService() {
		OtherServiceImpl otherService = new OtherServiceImpl();
		return otherService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelService createTravelService() {
		TravelServiceImpl travelService = new TravelServiceImpl();
		return travelService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trip_modelPackage getTrip_modelPackage() {
		return (Trip_modelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Trip_modelPackage getPackage() {
		return Trip_modelPackage.eINSTANCE;
	}

} //Trip_modelFactoryImpl
