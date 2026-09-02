package ar.edu.unju.escmi.tp3.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion, contadorGatos=0, MAX=5;
		GatoSimple[] gatos = new GatoSimple[MAX];
		
		
		do {
		System.out.println(
				"----- MENU -----\n"
				+ "1- Crear gato Simple\n"
				+ "2- Dar de comer a un gato simple\n"
				+ "3- Mostrar todos los gatos\n"
				+ "4– Crear gato contrincante para pelear con un gato simple\n"
				+ "5- Salir\n "
				+"-----------------------------------------------------------\n"
				+"Ingrese su opción: ");
		
		opcion=sc.nextInt();
		
		switch(opcion){
		case 1: 
			if(contadorGatos < MAX){
				
				System.out.print("Ingrese color: ");
				String color = sc.next();
				System.out.print("Ingrese tipo de pelaje: ");
				String pelaje = sc.next();
				System.out.print("Ingrese peso: ");
				float peso = sc.nextFloat();
				System.out.print("Ingrese edad: ");
				int edad = sc.nextInt();
				System.out.print("Ingrese nombre: ");
				String nombre = sc.next();
				System.out.print("Ingrese sexo (macho o hembra): ");
				String sexo = sc.next();
				System.out.print("Ingrese personalidad: ");
				String personalidad = sc.next();
				
				gatos[contadorGatos] = new GatoSimple(color, pelaje, peso, edad, nombre, sexo, personalidad);
				contadorGatos++;
				}
			else{
				System.out.print("Solo se pueden crear 5 gatos simples. \n");
				}
			break;
			
		case 2:
			if(contadorGatos>0) {
				System.out.print("Ingrese un plato de comida para el gato: ");
				String comida = sc.next();
				gatos[contadorGatos-1].darComida(comida);
			}
			else {
				System.out.print("Debe crear por lo menos un gato simple. \n");
			}
			break;
			
		case 3:
			if(contadorGatos>0) {
				for(int i=0; i<contadorGatos; i++) {
					System.out.println(i+1 + "- " + gatos[i].toString());
					System.out.println("Maullido: " + gatos[i].maullar());
					System.out.println("Ronroneo: " + gatos[i].ronronear() + "\n");
				}
			}
			else {
				System.out.print("Debe crear por lo menos un gato simple. \n");
			}
			break;
			
		case 4: 
			if(contadorGatos>0) {
				System.out.print("Ingrese color: ");
				String color = sc.next();
				System.out.print("Ingrese tipo de pelaje: ");
				String pelaje = sc.next();
				System.out.print("Ingrese peso: ");
				float peso = sc.nextFloat();
				System.out.print("Ingrese edad: ");
				int edad = sc.nextInt();
				System.out.print("Ingrese nombre: ");
				String nombre = sc.next();
				System.out.print("Ingrese sexo (macho o hembra): ");
				String sexo = sc.next();
				System.out.print("Ingrese personalidad: ");
				String personalidad = sc.next();
				
				GatoSimple gatoContrincante = new GatoSimple(color, pelaje, peso, edad, nombre, sexo, personalidad);
				
				gatos[contadorGatos-1].pelear(gatoContrincante);
				
			}
			else {
				System.out.print("Debe crear por lo menos un gato simple. \n");
			}
			break;
			
		case 5: 
			System.out.print("Fin del programa.");
			break;
		default: 
			System.out.print("Ingrese una opción válida. \n");
			break;
		}
		
		} while(opcion !=5);
		
		sc.close();
	}
}
