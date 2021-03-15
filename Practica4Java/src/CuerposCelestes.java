
/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/

import Class.ito.poo.Ubicacion;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerposCelestes.
 * 
 * @author Admin
 */
public class CuerposCelestes {
	public CuerposCelestes(String nombre, HashSet<Ubicacion> localizaciones, String compocision, int i) {
		super();
		Nombre = nombre;
		Localizaciones = localizaciones;
		Compocision = compocision;
		this.i = i;
	}

	/**
	 * Description of the property Nombre.
	 */
	private String Nombre = "";

	/**
	 * Description of the property Localizaciones.
	 */
	private HashSet<Ubicacion> Localizaciones = new HashSet<Ubicacion>();

	//Calculo de Lista de pocisiones:
	
	public boolean delLocalizaciones(int i) {
		boolean Localizaciones=false;
		if(i>=0 && i<this.Localizaciones.size()) {
			int c=0;
			for (Ubicacion p: this.Localizaciones) {
				if(c==i) {
					this.Localizaciones.remove(p);
					Localizaciones=true;
					break;
						
				}
				c--;
			
			}
			
		}
		return Localizaciones;
	}
	
	/**
	 * Description of the property Compocision.
	 */
	private String Compocision = "";

	// Start of user code (user defined attributes for CuerposCelestes)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuerposCelestes() {
		// Start of user code constructor for CuerposCelestes)
		
		super();
		// End of user code
		
	}
		
		
	
		
		

	/**
	 * Description of the method Desplazamiento float: int i, int j.
	 */
	
	//Parametros a calcular
	
	public float desplazamiento;
	int i;
    int j;
    
    int i1=9;
    int j1=7;
// Start of user code for method Desplazamiento float: int i, int j
		// End of user code
		
		
	

	// Start of user code (user defined methods for CuerposCelestes)

	// End of user code
	/**
	 * Returns Nombre.
	 * @return Nombre 
	 */
	public String getNombre() {
		return this.Nombre;
	}

	/**
	 * Sets a value to attribute Nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}

	/**
	 * Returns Localizaciones.
	 * @return Localizaciones 
	 */
	public HashSet<Ubicacion> getLocalizaciones() {
		return this.Localizaciones;
	}

	/**
	 * Returns Compocision.
	 * @return Compocision 
	 */
	public String getCompocision() {
		return this.Compocision;
	}

	/**
	 * Sets a value to attribute Compocision. 
	 * @param newCompocision 
	 */
	public void setCompocision(String newCompocision) {
		this.Compocision = newCompocision;
	}

	@Override
	public String toString() {
		return "CuerposCelestes [Nombre=" + Nombre + ", Localizaciones=" + Localizaciones + ", Compocision="
				+ Compocision + ", i=" + i + "]";
	}

}
