/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuentaBancaria.
 * 
 * @author Admin
 */
public class CuentaBancaria {
	
	 public CuentaBancaria(long numCuenta,String numCliente,floatsaldo,LocalDate fechaAapertura) {
		 super();
		 this.numCuenta=numCuenta;
		 this.numCliente=numCliente;
		 Saldo=saldo;
		 this.fechaApaerura=fechaAprtura;
	 }
	 
	//*
	 * Description of the property NumCuent.
	 */
	private HashSet<long>NumCuent=new HashSet<long>();

	/**
	 * Description of the property NomCliente.
	 */
	private HashSet<String> NomCliente = new HashSet<String>();

	/**
	 * Description of the property Saldo.
	 */
	private HashSet<float>Saldo=new HashSet<float>();

	/**
	 * Description of the property FechaApertura.
	 */
	private HashSet<LocalDate> FechaApertura = new HashSet<LocalDate>();

	/**
	 * Description of the property FechaActualizacion.
	 */
	private HashSet<LocalDate> FechaActualizacion = new HashSet<LocalDate>();

	// Start of user code (user defined attributes for CuentaBancaria)

	// End of user code
	
	

	/**
	 * The constructor.
	 */
	public CuentaBancaria() {
		// Start of user code constructor for CuentaBancaria)
		super();
		// End of user code
	}

	/**
	 * Description of the method  deposito(in cantidad: float): boolean.
	 */
	private void  deposito(in cantidad: float): boolean() {
		// Start of user code for method  deposito(in cantidad: float): boolean
		// End of user code
		
		Saldo=Saldo+Cantidad;
		
	}

	/**
	 * Description of the method  retiro(in cantidad: float):boolean.
	 */
	private void  retiro(in cantidad: float):boolean() {
		// Start of user code for method  retiro(in cantidad: float):boolean
		// End of user code
		
		Saldo=Saldo-Cantidad;
		if(Saldo=="si") {
			this.Saldo=true;
			
		}else {
			
			this.Saldo=false
		}
	}
	 
	// Start of user code (user defined methods for CuentaBancaria)
	
	// End of user code
	/**
	 * Returns NumCuent.
	 * @return NumCuent 
	 */
	public HashSet<long>

	getNumCuent() {
		return this.NumCuent;
	}

	/**
	 * Returns NomCliente.
	 * @return NomCliente 
	 */
	public HashSet<String> getNomCliente() {
		return this.NomCliente;
	}

	/**
	 * Returns Saldo.
	 * @return Saldo 
	 */
	public HashSet<float> getSaldo() {
		return this.Saldo;
	}

	/**
	 * Returns FechaApertura.
	 * @return FechaApertura 
	 */
	public HashSet<LocalDate> getFechaApertura() {
		return this.FechaApertura;
	}

	/**
	 * Returns FechaActualizacion.
	 * @return FechaActualizacion 
	 */
	public HashSet<LocalDate> getFechaActualizacion() {
		return this.FechaActualizacion;
		
		
		public String to String() {
		return "CuentaBancaria" 
		[numCuenta="+numCuenta+",numCliente="+numCliente",Saldo="+Saldo+"Retiro="+Saldo+"fechaApertura="+fechaApertura+",fechaActualizacion="+fechaActualizacion;
		}
		
		
	}

}
