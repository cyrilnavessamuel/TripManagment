/**
 */
package trip_model;

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
 * @see trip_model.Trip_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Trip_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trip_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/trip_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trip_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Trip_modelPackage eINSTANCE = trip_model.impl.Trip_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link trip_model.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trip_model.impl.ServiceImpl
	 * @see trip_model.impl.Trip_modelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COST = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RATING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trip_model.impl.TripImpl <em>Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trip_model.impl.TripImpl
	 * @see trip_model.impl.Trip_modelPackageImpl#getTrip()
	 * @generated
	 */
	int TRIP = 3;

	/**
	 * Returns the meta object for class '{@link trip_model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see trip_model.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Service#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see trip_model.Service#getCost()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Cost();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Service#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see trip_model.Service#getDuration()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Duration();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Service#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see trip_model.Service#getRating()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Rating();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trip_model.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see trip_model.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Type();

	/**
	 * The meta object id for the '{@link trip_model.impl.OtherServiceImpl <em>Other Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trip_model.impl.OtherServiceImpl
	 * @see trip_model.impl.Trip_modelPackageImpl#getOtherService()
	 * @generated
	 */
	int OTHER_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE__COST = SERVICE__COST;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE__DURATION = SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE__RATING = SERVICE__RATING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE__TYPE = SERVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE__LOCATION = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Other Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Other Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trip_model.impl.TravelServiceImpl <em>Travel Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trip_model.impl.TravelServiceImpl
	 * @see trip_model.impl.Trip_modelPackageImpl#getTravelService()
	 * @generated
	 */
	int TRAVEL_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE__COST = SERVICE__COST;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE__DURATION = SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE__RATING = SERVICE__RATING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE__TYPE = SERVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE__SOURCE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE__DESTINATION = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Travel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Travel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__END = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__DESTINATION = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__START = 5;

	/**
	 * The number of structural features of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trip_model.impl.locationImpl <em>location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trip_model.impl.locationImpl
	 * @see trip_model.impl.Trip_modelPackageImpl#getlocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trip_model.impl.TripModelImpl <em>Trip Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trip_model.impl.TripModelImpl
	 * @see trip_model.impl.Trip_modelPackageImpl#getTripModel()
	 * @generated
	 */
	int TRIP_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Trip</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_MODEL__TRIP = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_MODEL__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Trip Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trip Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link trip_model.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip</em>'.
	 * @see trip_model.Trip
	 * @generated
	 */
	EClass getTrip();

	/**
	 * Returns the meta object for the containment reference list '{@link trip_model.Trip#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see trip_model.Trip#getService()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Service();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Trip#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trip_model.Trip#getName()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Name();

	/**
	 * Returns the meta object for the reference '{@link trip_model.Trip#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see trip_model.Trip#getSource()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Source();

	/**
	 * Returns the meta object for the reference '{@link trip_model.Trip#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see trip_model.Trip#getDestination()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Destination();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Trip#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see trip_model.Trip#getStart()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Start();

	/**
	 * Returns the meta object for class '{@link trip_model.location <em>location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>location</em>'.
	 * @see trip_model.location
	 * @generated
	 */
	EClass getlocation();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trip_model.location#getName()
	 * @see #getlocation()
	 * @generated
	 */
	EAttribute getlocation_Name();

	/**
	 * Returns the meta object for class '{@link trip_model.TripModel <em>Trip Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Model</em>'.
	 * @see trip_model.TripModel
	 * @generated
	 */
	EClass getTripModel();

	/**
	 * Returns the meta object for the containment reference list '{@link trip_model.TripModel#getTrip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trip</em>'.
	 * @see trip_model.TripModel#getTrip()
	 * @see #getTripModel()
	 * @generated
	 */
	EReference getTripModel_Trip();

	/**
	 * Returns the meta object for the containment reference list '{@link trip_model.TripModel#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see trip_model.TripModel#getLocation()
	 * @see #getTripModel()
	 * @generated
	 */
	EReference getTripModel_Location();

	/**
	 * Returns the meta object for the attribute '{@link trip_model.Trip#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see trip_model.Trip#getEnd()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_End();

	/**
	 * Returns the meta object for class '{@link trip_model.OtherService <em>Other Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Service</em>'.
	 * @see trip_model.OtherService
	 * @generated
	 */
	EClass getOtherService();

	/**
	 * Returns the meta object for the reference '{@link trip_model.OtherService#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see trip_model.OtherService#getLocation()
	 * @see #getOtherService()
	 * @generated
	 */
	EReference getOtherService_Location();

	/**
	 * Returns the meta object for class '{@link trip_model.TravelService <em>Travel Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Service</em>'.
	 * @see trip_model.TravelService
	 * @generated
	 */
	EClass getTravelService();

	/**
	 * Returns the meta object for the reference '{@link trip_model.TravelService#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see trip_model.TravelService#getSource()
	 * @see #getTravelService()
	 * @generated
	 */
	EReference getTravelService_Source();

	/**
	 * Returns the meta object for the reference '{@link trip_model.TravelService#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see trip_model.TravelService#getDestination()
	 * @see #getTravelService()
	 * @generated
	 */
	EReference getTravelService_Destination();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Trip_modelFactory getTrip_modelFactory();

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
		 * The meta object literal for the '{@link trip_model.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trip_model.impl.ServiceImpl
		 * @see trip_model.impl.Trip_modelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__COST = eINSTANCE.getService_Cost();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DURATION = eINSTANCE.getService_Duration();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RATING = eINSTANCE.getService_Rating();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '{@link trip_model.impl.TripImpl <em>Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trip_model.impl.TripImpl
		 * @see trip_model.impl.Trip_modelPackageImpl#getTrip()
		 * @generated
		 */
		EClass TRIP = eINSTANCE.getTrip();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__SERVICE = eINSTANCE.getTrip_Service();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__NAME = eINSTANCE.getTrip_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__SOURCE = eINSTANCE.getTrip_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__DESTINATION = eINSTANCE.getTrip_Destination();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__START = eINSTANCE.getTrip_Start();

		/**
		 * The meta object literal for the '{@link trip_model.impl.locationImpl <em>location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trip_model.impl.locationImpl
		 * @see trip_model.impl.Trip_modelPackageImpl#getlocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getlocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getlocation_Name();

		/**
		 * The meta object literal for the '{@link trip_model.impl.TripModelImpl <em>Trip Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trip_model.impl.TripModelImpl
		 * @see trip_model.impl.Trip_modelPackageImpl#getTripModel()
		 * @generated
		 */
		EClass TRIP_MODEL = eINSTANCE.getTripModel();

		/**
		 * The meta object literal for the '<em><b>Trip</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_MODEL__TRIP = eINSTANCE.getTripModel_Trip();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_MODEL__LOCATION = eINSTANCE.getTripModel_Location();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__END = eINSTANCE.getTrip_End();

		/**
		 * The meta object literal for the '{@link trip_model.impl.OtherServiceImpl <em>Other Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trip_model.impl.OtherServiceImpl
		 * @see trip_model.impl.Trip_modelPackageImpl#getOtherService()
		 * @generated
		 */
		EClass OTHER_SERVICE = eINSTANCE.getOtherService();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_SERVICE__LOCATION = eINSTANCE.getOtherService_Location();

		/**
		 * The meta object literal for the '{@link trip_model.impl.TravelServiceImpl <em>Travel Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trip_model.impl.TravelServiceImpl
		 * @see trip_model.impl.Trip_modelPackageImpl#getTravelService()
		 * @generated
		 */
		EClass TRAVEL_SERVICE = eINSTANCE.getTravelService();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_SERVICE__SOURCE = eINSTANCE.getTravelService_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_SERVICE__DESTINATION = eINSTANCE.getTravelService_Destination();

	}

} //Trip_modelPackage
