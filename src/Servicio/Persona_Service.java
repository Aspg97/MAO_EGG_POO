package Servicio;

import java.util.Scanner;

import Entidad.Persona;

public class Persona_Service {
	
	Scanner leer = new Scanner(System.in);
	
	public Persona crearPersona() {
		
		System.out.println("Ingrese el nombre de la persona");
		Persona persona = new Persona(leer.next());
		

		return persona;
	}
	
	public void mostrarNombrePersona(Persona persona) {
		System.out.println(persona.getNombre());
	}
}
