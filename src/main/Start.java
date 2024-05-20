package main;

import java.util.List;
import java.util.Map;

import files.FicheroReaderPropietarios;
import files.FicheroReaderVehiculos;
import propietarios.Propietario;
import utilidades.Imprimiertor;
import utilidades.Vinculator;
import vehiculos.Vehiculo;

public class Start {

	public static void main(String[] args) {
		
		Map<String,Propietario> propietarios = FicheroReaderPropietarios.getDatos("propietarios.txt");
		Map<String,Vehiculo> vehiculos = FicheroReaderVehiculos.getDatos("vehiculos.txt");
		
		Vinculator.vincular(propietarios,vehiculos,"vinculos.txt");

		Imprimiertor.print(vehiculos);

	}

}
