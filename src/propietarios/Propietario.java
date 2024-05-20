package propietarios;

import java.util.ArrayList;
import java.util.List;

import vehiculos.Vehiculo;

public class Propietario {

	
	
	private String dni;
	private String fechaNacimiento;
	private String nombreApellidos;
	
	private List<Vehiculo> vehiculos;
	
	
	
	public Propietario(String dni, String nombreApellidos,String fechaNacimiento) {
		super();
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombreApellidos = nombreApellidos;
		vehiculos = new ArrayList<Vehiculo>();
	}

	
	public void addVehiculo(Vehiculo v) {
		
		vehiculos.add(v);
	}
	

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * @return the nombreApellidos
	 */
	public String getNombreApellidos() {
		return nombreApellidos;
	}


	/**
	 * @param nombreApellidos the nombreApellidos to set
	 */
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}


	@Override
	public String toString() {
		return "{[" + dni + "] <" + fechaNacimiento + "> "+ nombreApellidos + "}\n";
	}
	
	
	
	
	
	
	
}
