/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.sql.Date;




public class Alumno implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6551701680984577918L;


	/*****************************************************
	 * Propiedades del Bean. Crearemos una propiedad por cada campo de la tabla de
	 * la base de datos del siguiente modo:
	 *
	 * DNI: String Nombre: String Apellidos: String Direccion: String FechaNac: Date
	 */
	public Alumno() {
	
		
	}

	protected String DNI;

	/**
	 * Get the value of DNI
	 *
	 * @return the value of DNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Set the value of DNI
	 *
	 * @param DNI new value of DNI
	 */
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	protected String Nombre;

	/**
	 * Get the value of Nombre
	 *
	 * @return the value of Nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * Set the value of Nombre
	 *
	 * @param Nombre new value of Nombre
	 */
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	protected String Apellidos;

	/**
	 * Get the value of Apellidos
	 *
	 * @return the value of Apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}

	/**
	 * Set the value of Apellidos
	 *
	 * @param Apellidos new value of Apellidos
	 */
	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}

	protected String Direccion;

	/**
	 * Get the value of Direccion
	 *
	 * @return the value of Direccion
	 */
	public String getDireccion() {
		return Direccion;
	}

	/**
	 * Set the value of Direccion
	 *
	 * @param Direccion new value of Direccion
	 */
	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}

	protected Date FechaNac;

	/**
	 * Get the value of FechaNac
	 *
	 * @return the value of FechaNac
	 */
	public Date getFechaNac() {
		return FechaNac;
	}

	/**
	 * Set the value of FechaNac
	 *
	 * @param FechaNac new value of FechaNac
	 */
	public void setFechaNac(Date FechaNac) {
		this.FechaNac = FechaNac;
	}
	


	

	
	public Alumno(String dNI, String nombre, String apellidos, String direccion, Date fechaNac) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Direccion = direccion;
		FechaNac = fechaNac;
	}



	@Override
	public String toString() {
		return "Alumno [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Direccion=" + Direccion
				+ ", FechaNac=" + FechaNac + "]";
	}

	

}
