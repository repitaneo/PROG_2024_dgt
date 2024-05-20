package files;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import propietarios.Propietario;
import vehiculos.Vehiculo;




public class FicheroReaderVehiculos {

	
	public static Map<String,Vehiculo> getDatos(String nombreFichero) {

		Map<String,Vehiculo> datos = new HashMap<String,Vehiculo>();
		
		try {
			
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(nombreFichero));
			
			// mientras que las lineas existan
			while (ficheroEntrada.ready()) {

				// leo una linea
				String matricula = ficheroEntrada.readLine();
				String marca = ficheroEntrada.readLine();
				String modelo = ficheroEntrada.readLine();
				String color = ficheroEntrada.readLine();
				
				Vehiculo v = new Vehiculo(matricula,marca,modelo,color);
				datos.put(matricula, v);
				
			}
			ficheroEntrada.close();
		} catch (IOException e) {

			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}
		
		return datos;
	}	
	
}
