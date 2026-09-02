package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Persona> personas = new ArrayList<>();

		int opcion;
		do {
				System.out.println("-----------------------------MENÚ-------------------------------");
				System.out.println("1. Crear objeto con Constructor por defecto");
            	System.out.println("2. Crear objeto con Constructor parametrizado");
            	System.out.println("3. Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
           		System.out.println("4 - Mostrar personas");
           		System.out.println("5 - Salir");
           		System.out.print("Ingrese una opción: ");
           		opcion = scanner.nextInt();
           		scanner.nextLine();

           		switch (opcion) {
           			case 1: 
           				Persona person=new Persona();
           				System.out.print("Ingrese DNI: ");
           				person.setDni(scanner.nextInt());
           				System.out.print("Ingrese nombre: ");
           				person.setNombre(scanner.nextLine());
           				System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
           				person.setFechaN(LocalDate.parse(scanner.nextLine()));
           				System.out.print("Ingrese domicilio: ");
           				person.setDomicilio(scanner.nextLine());
           				System.out.print("Ingrese provincia: ");
           				person.setProvincia(scanner.nextLine());

           				personas.add(person);
           				
           			break;

           			case 2:

           				System.out.print("Ingrese DNI: ");
           				int dni2=scanner.nextInt();
           				System.out.print("Ingrese nombre: ");
           				String nombre2=scanner.nextLine();
           				System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
           				LocalDate fechaN2=LocalDate.parse(scanner.nextLine());
           				System.out.print("Ingrese domicilio: ");
           				String domicilio2=scanner.nextLine();
           				System.out.print("Ingrese provincia: ");
           				String provincia2 = scanner.nextLine();
           				Persona person2 = new Persona(dni2, nombre2, fechaN2, domicilio2, provincia2);
           				
           				personas.add(person2);
           				
           			break;

           			case 3:
           				System.out.print("Ingrese DNI: ");
           				int dni3=scanner.nextInt();
           				System.out.print("Ingrese nombre: ");
           				String nombre3=scanner.nextLine();
           				System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
           				LocalDate fechaN3=LocalDate.parse(scanner.nextLine());

           				Persona person3=new Persona(dni3, nombre3, fechaN3);

           				personas.add(person3);
           				System.out.println("Provincia: Jujuy");
           			break;

           			case 4:
           				if (personas.isEmpty()) {	
           					System.out.println("No hay personas creadas.");
           				} else {
           					System.out.println("PERSONA");

           					for (Persona persona : personas) {
           						persona.mostrarD();
           					}
           				}

           			break;

           			case 5:
           				System.out.println("Finalizado");
           			break;

           			default:
           				System.out.println("Opción no disponible");
           			break;
           		}
		} while (opcion != 5);
		scanner.close();
    }
}









