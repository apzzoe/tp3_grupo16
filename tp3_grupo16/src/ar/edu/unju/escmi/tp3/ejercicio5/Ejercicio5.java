package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Producto[] productos = new Producto[3];
        
        int cantidadProductos = 0;
        int opcion;

        do {
            System.out.println("========= MENU =========");
            System.out.println("1 - Crear producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar precio de producto");
            System.out.println("4 - Mostrar los productos que superen un precio");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opción: ");
            
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    if (cantidadProductos < 3) {
                        Producto nuevoProducto = new Producto();
                        
                        System.out.print("Ingrese código del producto: ");
                        nuevoProducto.setCodigo(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.print("Ingrese descripción: ");
                        nuevoProducto.setDescripcion(teclado.nextLine());
                        
                        System.out.print("Ingrese precio $: ");
                        nuevoProducto.setPrecio(teclado.nextDouble());
                        teclado.nextLine();
                        
                        productos[cantidadProductos] = nuevoProducto;
                        cantidadProductos++;
                        System.out.println("¡Producto creado y almacenado correctamente!");
                    } else {
                        System.out.println("Error: Capacidad máxima alcanzada. No se pueden agregar más productos.");
                    }
                    break;

                case 2:
                    if (cantidadProductos == 0) {
                        System.out.println("No hay productos registrados en el sistema.");
                    } else {
                        System.out.println("======= LISTA TOTAL DE PRODUCTOS =======");
                        for (int i = 0; i < cantidadProductos; i++) {
                            System.out.println((i + 1) + ". " + productos[i]);
                        }
                    }
                    break;

                case 3:
                    if (cantidadProductos == 0) {
                        System.out.println("No hay productos registrados para modificar.");
                    } else {
                        System.out.print("Ingrese el código del producto a modificar: ");
                        int codigoBuscar = teclado.nextInt();
                        teclado.nextLine();
                        
                        boolean encontrado = false;
                        for (int i = 0; i < cantidadProductos; i++) {
                            if (productos[i].getCodigo() == codigoBuscar) {
                                System.out.print("Producto encontrado: " + productos[i].getDescripcion() + ". Ingrese el nuevo precio $: ");
                                double nuevoPrecio = teclado.nextDouble();
                                teclado.nextLine();
                                
                                productos[i].setPrecio(nuevoPrecio);
                                System.out.println("¡Precio modificado con éxito!");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Error: No se encontró ningún producto con el código especificado.");
                        }
                    }
                    break;

                case 4:
                    if (cantidadProductos == 0) {
                        System.out.println("No hay productos registrados en el sistema.");
                    } else {
                        System.out.print("Ingrese el precio límite para filtrar: ");
                        double precioLimite = teclado.nextDouble();
                        teclado.nextLine();
                        
                        boolean huboSuperacion = false;
                        System.out.println("======= PRODUCTOS QUE SUPERAN $" + precioLimite + " =======");
                        for (int i = 0; i < cantidadProductos; i++) {
                            if (productos[i].getPrecio() > precioLimite) {
                                System.out.println(productos[i]);
                                huboSuperacion = true;
                            }
                        }
                        if (!huboSuperacion) {
                            System.out.println("Ningún producto registrado supera el precio ingresado.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        teclado.close();
    }
}
