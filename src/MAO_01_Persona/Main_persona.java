package MAO_01_Persona;

import Entidad.Persona;
import Servicio.Persona_Service;

public class Main_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object_Persona p1 = new Object_Persona();
		// Object_Persona p2 = new Object_Persona("Anthony");

		// System.out.println(p1.nombre+","+p2.nombre);

		Persona_Service newPersona = new Persona_Service();
		
		System.out.println("Ingrese datos persona 1");
		Persona persona = newPersona.crearPersona();
		
		System.out.println("Ingrese datos persona 2");
		Persona persona2 = newPersona.crearPersona();
		
		newPersona.mostrarNombrePersona(persona);
		
		newPersona.mostrarNombrePersona(persona2);
	}
}
