package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cliente[] clientes = new Cliente[4];
		
		int cantidadClientes = 0;
		int opcion;
		
		do {
			System.out.println("MENU");
			System.out.println("1 - Crear cliente");
			System.out.println("2 - Mostrar los datos de un cliente");
			System.out.println("3 - Mostrar todos los clientes");
			System.out.println("4 - Mostrar todos los clientes por categoria");
			System.out.println("5 - Salir");
			System.out.print("Ingrese una opcion: ");
			
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				if(cantidadClientes < 4){
					System.out.print("ingrese DNI: ");
					int dni = teclado.nextInt();
					System.out.print("ingrese nombre: ");
					String nombre = teclado.next();
					System.out.print("ingrese categoria: ");
					char categoria = teclado.next().charAt(0);
					clientes[cantidadClientes] = new Cliente(dni, nombre, categoria);
					cantidadClientes++;
					System.out.println("cliente creado correctamente");
					}
				else{
					System.out.println("no se pueden crear mas clientes");
					}
				break;
				
			case 2:
				System.out.print("ingrese el DNI a buscar: ");
				int dniBuscar = teclado.nextInt();
				boolean encontrado = false;
				for(int i = 0; i < cantidadClientes; i++){
					if(clientes[i].getDni() == dniBuscar){
						System.out.println(clientes[i]); encontrado = true;
						}
					}
				if(!encontrado){
					System.out.println("no se encontro el dni");
					}
				break;
				
			case 3:
				if(cantidadClientes == 0){
					System.out.println("no hay clientes registrados");
					}
				else {
					for(int i = 0; i < cantidadClientes; i++){
						System.out.println(clientes[i]);
						}
				}
				break;
				
			case 4:
				System.out.print("ingrese la categoria a buscar: ");
				char categoriaBuscar = teclado.next().charAt(0);
				boolean categoriaEncontrada = false;
				for(int i = 0; i < cantidadClientes; i++){
					if(clientes[i].getCategoria() == categoriaBuscar){
						System.out.println(clientes[i]);
						categoriaEncontrada = true;
						}
					}
				if(!categoriaEncontrada){
					System.out.println("no se encontraron clientes de esa categoria");
					}
				break;
				
			case 5:
				System.out.println("programa finalizado");
				break;
				
			default:
				System.out.println("ppcion invalida");
				break;
			}
		} while(opcion != 5);
		
		teclado.close();
	}
}
