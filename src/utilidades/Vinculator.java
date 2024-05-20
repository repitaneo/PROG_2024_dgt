package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import propietarios.Propietario;
import vehiculos.Vehiculo;

public class Vinculator {

	public static void vincular(Map<String, Propietario> propietarios, 
								Map<String, Vehiculo> vehiculos, 
								String nombreFichero) {
		
		try {
			
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(nombreFichero));
			
			// mientras que las lineas existan
			while (ficheroEntrada.ready()) {

				// leo una linea
				String matricula = ficheroEntrada.readLine();
				String dni = ficheroEntrada.readLine();

				Propietario p = propietarios.get(dni);
				Vehiculo v = vehiculos.get(matricula);
				if(p!=null && v!=null) {
					
					p.addVehiculo(v);
					v.addPropietario(p);
				}
			}
			ficheroEntrada.close();
		} catch (IOException e) {

			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}
		
		
	}

}
