/**
 */
package trip_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trip_model.TripModel#getTrip <em>Trip</em>}</li>
 *   <li>{@link trip_model.TripModel#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see trip_model.Trip_modelPackage#getTripModel()
 * @model
 * @generated
 */
public interface TripModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Trip</b></em>' containment reference list.
	 * The list contents are of type {@link trip_model.Trip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trip</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip</em>' containment reference list.
	 * @see trip_model.Trip_modelPackage#getTripModel_Trip()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trip> getTrip();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link trip_model.location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see trip_model.Trip_modelPackage#getTripModel_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<location> getLocation();

} // TripModel
