/**
 */
package trip_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trip_model.OtherService#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see trip_model.Trip_modelPackage#getOtherService()
 * @model
 * @generated
 */
public interface OtherService extends Service {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(location)
	 * @see trip_model.Trip_modelPackage#getOtherService_Location()
	 * @model required="true"
	 * @generated
	 */
	location getLocation();

	/**
	 * Sets the value of the '{@link trip_model.OtherService#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(location value);

} // OtherService
