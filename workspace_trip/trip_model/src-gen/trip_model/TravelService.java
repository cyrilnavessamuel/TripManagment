/**
 */
package trip_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trip_model.TravelService#getSource <em>Source</em>}</li>
 *   <li>{@link trip_model.TravelService#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see trip_model.Trip_modelPackage#getTravelService()
 * @model
 * @generated
 */
public interface TravelService extends Service {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(location)
	 * @see trip_model.Trip_modelPackage#getTravelService_Source()
	 * @model required="true"
	 * @generated
	 */
	location getSource();

	/**
	 * Sets the value of the '{@link trip_model.TravelService#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(location value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(location)
	 * @see trip_model.Trip_modelPackage#getTravelService_Destination()
	 * @model required="true"
	 * @generated
	 */
	location getDestination();

	/**
	 * Sets the value of the '{@link trip_model.TravelService#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(location value);

} // TravelService
