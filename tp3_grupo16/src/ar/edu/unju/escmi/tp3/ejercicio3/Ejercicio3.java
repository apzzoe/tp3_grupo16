package ar.edu.unju.escmi.tp3.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecla = new Scanner(System.in);
		Empleado empleado1 = null;
		
		
		int op;
		do {
			System.out.println("**MENU**");
			System.out.println("1- Crear empleado");
			System.out.println("2- Aumentar Salario");
			System.out.println("3- Mostrar los datos del empleado");
			System.out.println("4- Salir");
			System.out.print("Ingrese una opcion: ");
			
			op = tecla.nextInt();
			switch (op) {
			case 1:
				tecla.nextLine(); 
				System.out.print("Ingrese nombre: ");
				String nombre = tecla.nextLine();
				System.out.print("Ingrese legajo: ");
				int legajo = tecla.nextInt();
				System.out.print("Ingrese salario: ");
				double salario = tecla.nextDouble();
				empleado1 = new Empleado(nombre, legajo, salario);
				System.out.println("Empleado creado.");
				break;
				
			case 2:
				if (empleado1 != null) {
					System.out.print("Ingrese el numero de legajo: ");
					int legajoBuscar = tecla.nextInt();
					if (legajoBuscar == empleado1.getLegajo()) {
						empleado1.aumentarSalario();
						System.out.println("Salario aumentado correctamente.");
						} else {
							System.out.println("El legajo no coincide."); }
				} else { System.out.println("Primero debe crear un empleado."); 
				
				}break;
				
			case 3:
				if (empleado1 != null) { 
					empleado1.mostrarDatos();
				} else {
					System.out.println(" debe crear un empleado."); }
				break;				
			case 4:
				System.out.println("Fin del programa.");
				break;
				
			default:
				System.out.println("Opcion incorrecta.");
			break;
			}
		} while (op != 4);
		tecla.close(); 
	}	}
					

