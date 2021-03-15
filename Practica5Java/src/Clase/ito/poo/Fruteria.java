/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Fruteria.
 * 
 * @author Admin
 */
public class Fruteria {
	/**
	 * Description of the property Nombre.
	 */
	private String Nombre = "";

	/**
	 * Description of the property Extension.
	 */
	private float Extension = 0F;

	/**
	 * Description of the property TiempoCosecha.
	 */
	private HashSet<String> TiempoCosecha = new HashSet<String>();

	/**
	 * Description of the property CantidadCosechaxTiempo.
	 */
	private HashSet<float>CantidadCosechaxTiempo=new HashSet<float>();

	/**
	 * Description of the property CostoPromedio.
	 */
	private float CostoPromedio = 0F;

	/**
	 * Description of the property PrecioVentaProm.
	 */
	private float PrecioVentaProm = 0F;

	// Start of user code (user defined attributes for Fruteria)

	// End of user code

	/**
	 * The constructor.
	 */
	public Fruteria() {
		// Start of user code constructor for Fruteria)
		super();
		// End of user code
	}

	/**
	 * Description of the method AgregarPeriod void: String , float: CantidadEstimada.
	 */
	public void AgregarPeriod String,float:

	Fruteria1() {
		// Start of user code for method AgregarPeriod void: String , float: CantidadEstimada
		// End of user code
	}

	/**
	 * Description of the method EliminarPeriod boolean: int i.
	 */
	public void EliminarPeriod boolean:

	int i() {
		// Start of user code for method EliminarPeriod boolean: int i
		// End of user code
	}

	/**
	 * Description of the method CostoxPeriod  float: int i.
	 */
	public void CostoxPeriod float:

	
		// Start of user code for method CostoxPeriod  float: int i
		// End of user code
	}

	/**
	 * Description of the method Ganancia float: int i.
	 */
	public void Ganancia float:

	{
		// Start of user code for method Ganancia float: int i
		// End of user code
	}

	// Start of user code (user defined methods for Fruteria)

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
	 * Returns Extension.
	 * @return Extension 
	 */
	public float getExtension() {
		return this.Extension;
	}

	/**
	 * Sets a value to attribute Extension. 
	 * @param newExtension 
	 */
	public void setExtension(float newExtension) {
		this.Extension = newExtension;
	}

	/**
	 * Returns TiempoCosecha.
	 * @return TiempoCosecha 
	 */
	public HashSet<String> getTiempoCosecha() {
		return this.TiempoCosecha;
	}

	/**
	 * Returns CantidadCosechaxTiempo.
	 * @return 
	 * @return CantidadCosechaxTiempo 
	 */
	public HashSet<float> Object getCantidadCosechaxTiempo() {
		return this.getCantidadCosechaxTiempo();
	}

	/**
	 * Returns CostoPromedio.
	 * @return CostoPromedio 
	 */
	public float getCostoPromedio() {
		return this.CostoPromedio;
	}

	/**
	 * Sets a value to attribute CostoPromedio. 
	 * @param newCostoPromedio 
	 */
	public void setCostoPromedio(float newCostoPromedio) {
		this.CostoPromedio = newCostoPromedio;
	}

	/**
	 * Returns PrecioVentaProm.
	 * @return PrecioVentaProm 
	 */
	public float getPrecioVentaProm() {
		return this.PrecioVentaProm;
	}

	/**
	 * Sets a value to attribute PrecioVentaProm. 
	 * @param newPrecioVentaProm 
	 */
	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.PrecioVentaProm = newPrecioVentaProm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(CostoPromedio);
		result = prime * result + Float.floatToIntBits(Extension);
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + Float.floatToIntBits(PrecioVentaProm);
		result = prime * result + ((TiempoCosecha == null) ? 0 : TiempoCosecha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruteria other = (Fruteria) obj;
		if (Float.floatToIntBits(CostoPromedio) != Float.floatToIntBits(other.CostoPromedio))
			return false;
		if (Float.floatToIntBits(Extension) != Float.floatToIntBits(other.Extension))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (Float.floatToIntBits(PrecioVentaProm) != Float.floatToIntBits(other.PrecioVentaProm))
			return false;
		if (TiempoCosecha == null) {
			if (other.TiempoCosecha != null)
				return false;
		} else if (!TiempoCosecha.equals(other.TiempoCosecha))
			return false;
		return true;
	}

}
