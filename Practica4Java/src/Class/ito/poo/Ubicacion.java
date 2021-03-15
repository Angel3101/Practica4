/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Class.ito.poo;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Ubicacion.
 * 
 * @author Admin
 */
public class Ubicacion {
	public Ubicacion(float longitud, float latitud, String periodo, float distancia) {
		super();
		Longitud = longitud;
		Latitud = latitud;
		Periodo = periodo;
		Distancia = distancia;
	}

	/**
	 * Description of the property Longitud.
	 */
	private float Longitud = 0F;

	/**
	 * Description of the property Latitud.
	 */
	private float Latitud = 0F;

	/**
	 * Description of the property Periodo.
	 */
	private String Periodo = "";

	/**
	 * Description of the property Distancia.
	 */
	private float Distancia = 0F;

	// Start of user code (user defined attributes for Ubicacion)

	// End of user code

	/**
	 * The constructor.
	 */
	public Ubicacion() {
		// Start of user code constructor for Ubicacion)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Ubicacion)

	// End of user code
	/**
	 * Returns Longitud.
	 * @return Longitud 
	 */
	public float getLongitud() {
		return this.Longitud;
	}

	/**
	 * Sets a value to attribute Longitud. 
	 * @param newLongitud 
	 */
	public void setLongitud(float newLongitud) {
		this.Longitud = newLongitud;
	}

	/**
	 * Returns Latitud.
	 * @return Latitud 
	 */
	public float getLatitud() {
		return this.Latitud;
	}

	/**
	 * Sets a value to attribute Latitud. 
	 * @param newLatitud 
	 */
	public void setLatitud(float newLatitud) {
		this.Latitud = newLatitud;
	}

	/**
	 * Returns Periodo.
	 * @return Periodo 
	 */
	public String getPeriodo() {
		return this.Periodo;
	}

	/**
	 * Sets a value to attribute Periodo. 
	 * @param newPeriodo 
	 */
	public void setPeriodo(String newPeriodo) {
		this.Periodo = newPeriodo;
	}

	/**
	 * Returns Distancia.
	 * @return Distancia 
	 */
	public float getDistancia() {
		return this.Distancia;
			
		}
	
	/**
	 * Sets a value to attribute Distancia. 
	 * @param newDistancia 
	 */
	public void setDistancia(float newDistancia) {
		this.Distancia = newDistancia;
	}

	@Override
	public String toString() {
		return "Ubicacion [Longitud=" + Longitud + ", Latitud=" + Latitud + ", Periodo=" + Periodo + ", Distancia="
				+ Distancia + "]";
	}

}
