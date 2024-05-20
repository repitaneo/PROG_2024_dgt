package vehiculos;

import java.util.ArrayList;
import java.util.List;

import propietarios.Propietario;

public class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	private List<Propietario> propietarios;
	
	
	public Vehiculo(String matricula, String marca, String modelo, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		propietarios = new ArrayList<Propietario>();
	}
	
	
	public void addPropietario(Propietario p) {
		
		propietarios.add(p);
	}
	
	
	public List<Propietario> getPropietarios() {
		
		return propietarios;
	}
	
	
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "{[" + matricula + "] (" + marca + "-" + modelo + ") <" + color + ">]\n"+propietarios+"\n";
	}
	
	
	
	
	
}
