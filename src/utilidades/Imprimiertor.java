package utilidades;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import propietarios.Propietario;
import vehiculos.Vehiculo;

public class Imprimiertor {

	public static void print(Map<String, Vehiculo> vehiculos) {
		
		Collection<Vehiculo> vehiculosSolos = vehiculos.values();
		for(Vehiculo v: vehiculosSolos) {
			
			List<Propietario> propietarios = v.getPropietarios();
			for(Propietario p: propietarios) {

				System.out.println(p.getDni());
				System.out.println(p.getNombreApellidos());
				System.out.println(p.getFechaNacimiento());
				System.out.println(v.getMatricula());
				System.out.println(v.getMarca());
				System.out.println(v.getModelo());
				System.out.println(v.getColor());
				
			}
		}
		
		
		
	}

}
