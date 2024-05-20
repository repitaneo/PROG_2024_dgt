package files;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import propietarios.Propietario;




public class FicheroReaderPropietarios {

	
	public static Map<String,Propietario> getDatos(String nombreFichero) {

		Map<String,Propietario> datos = new HashMap<String,Propietario>();
		
		try {
			
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(nombreFichero));
			
			// mientras que las lineas existan
			while (ficheroEntrada.ready()) {

				// leo una linea
				String dni = ficheroEntrada.readLine();
				String nombre = ficheroEntrada.readLine();
				String fecha = ficheroEntrada.readLine();
				
				Propietario p = new Propietario(dni,nombre,fecha);
				datos.put(dni, p);
				
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
