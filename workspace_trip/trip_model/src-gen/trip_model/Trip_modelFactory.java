/**
 */
package trip_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trip_model.Trip_modelPackage
 * @generated
 */
public interface Trip_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Trip_modelFactory eINSTANCE = trip_model.impl.Trip_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Trip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip</em>'.
	 * @generated
	 */
	Trip createTrip();

	/**
	 * Returns a new object of class '<em>location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>location</em>'.
	 * @generated
	 */
	location createlocation();

	/**
	 * Returns a new object of class '<em>Trip Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Model</em>'.
	 * @generated
	 */
	TripModel createTripModel();

	/**
	 * Returns a new object of class '<em>Other Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Service</em>'.
	 * @generated
	 */
	OtherService createOtherService();

	/**
	 * Returns a new object of class '<em>Travel Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Service</em>'.
	 * @generated
	 */
	TravelService createTravelService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Trip_modelPackage getTrip_modelPackage();

} //Trip_modelFactory
