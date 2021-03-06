package com.uno.carrito;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		ProductosAComprar lista = new ProductosAComprar("listaproductos.txt");
		String nombre = "NULL";
		String dirdeenvio = "NULL";
		String dirdecobro = "NULL";
		String mail = "NULL";
		long nroTarjeta = 0;
		String validoDesde = "";
		String validoHasta = "";
		int cvs = 0;
		int descuento = 0;
		Cliente cliente = null;
		int carritoActual = 0;
		Scanner keyboard = new Scanner(System.in);
		int opcion = 0;
		Tarjeta tarjeta = null ;
		String confirmar = "";

		while (!(opcion == 9)) {

			System.out.println("1.-Ingresar cliente");
			System.out.println("2.-Agregar Carrito al cliente.");
			System.out.println("3.-Listar Carritos");
			System.out.println("4.-Seleccionar Carrito");
			System.out.println("5.-Listar productos");
			System.out.println("6.-Agregar producto al carrito");
			System.out.println("7.-Borrar producto del carrito");
			System.out.println("8.-Comprar");
			System.out.println("9.-Salir");
			System.out.println("");
			System.out.print("Ingrese una opcion: ");
			opcion = keyboard.nextInt();

			switch (opcion) {
			case 1:

				System.out.print("Ingrse el nomrbre del cliente: ");
				nombre = keyboard.next();
				System.out.print("Ingrese la direccion de Envio: ");
				dirdeenvio = keyboard.next();
				System.out.print("Ingrese la direccion de Cobro: ");
				dirdecobro = keyboard.next();
				System.out.print("Ingrese el mail del cliente: ");
				mail = keyboard.next();

				// Solicitar datos de Tarjeta
				System.out.print("Ingrese nro. de Tarjeta: ");
				nroTarjeta = keyboard.nextLong();
				System.out.print("Ingrese valida desde (aaaa-mm-d): ");
				validoDesde = keyboard.next();
				System.out.print("Ingrese valida hasta (aaaa-mm-d): ");
				validoHasta = keyboard.next();
				System.out.print("Ingrese codigo de verificacion: ");
				cvs = keyboard.nextInt();

				tarjeta = new Tarjeta(nroTarjeta, validoDesde, validoHasta, cvs);
				System.out.print("Ingrese el procentaje de descuento: ");
				descuento = keyboard.nextInt();

				if ((descuento > 0) || (descuento <= 50)) {

					cliente = new ClientePreferencial(nombre, dirdeenvio, dirdecobro, mail, tarjeta, descuento);
				} else
					cliente = new Cliente(nombre, dirdeenvio, dirdecobro, mail, tarjeta);

				break;
			case 2:
				cliente.agregarCarrito(new Carrito());
				System.out.print("Su nuevo Carrito fue creado!!!! presione enter para continuar...");
				System.in.read();

				break;
			case 3:
				cliente.ListarCarritos();
				break;
			case 4:
				System.out.print("Ingrese el carrito a usar: ");
				carritoActual = keyboard.nextInt();
				break;
			case 5:
				lista.mostrarListaProductos();
				break;
			case 6:
				System.out.print("Ingrese el ID del producto a comprar: ");
				int id = keyboard.nextInt();
				System.out.print("Ingrese la cantidad de unidades: ");
				int cantidad = keyboard.nextInt();

				Producto producto = lista.getProducto(id);
				if (producto == null)
					System.out.println("Producto inexistente.");
				else {
					System.out.printf("Se agregaron %d unidades del producto %d - %s. Total : %7.2f", cantidad,
							producto.getId(), producto.getNombre(), cantidad * producto.getPrecio());
					cliente.getCarrito(carritoActual).agregarProducto(producto, cantidad);
					System.out.printf("Su producto ha sido agregado al carrito Nro: %d\n", carritoActual);
					System.out.println(" presione enter para continuar...");
					System.in.read();
				}

				break;
			case 7:
				System.out.print(" \n\n\n");
				cliente.getCarrito(carritoActual).listarItems();
				System.out.print(" \n\n\nSelecciones el ID del producto a borrar del carrito: ");
				id = keyboard.nextInt();
				cliente.getCarrito(carritoActual).borrarProducto(id);
				System.out.printf("Su producto ha sido borrado del carrito Nro: %d\n", carritoActual);
				System.out.println(" presione enter para continuar...");
				System.in.read();
				break;
			case 8:
				
				int idcarrito = 0;
				cvs = 0;
				System.out.print("Ingrese el ID del carrito a comprar: ");
				idcarrito = keyboard.nextInt();
				
				System.out.print("reingrese el codigo de validacion de la tarjea: ");
				cvs = keyboard.nextInt();
				
				cliente.mostrarDetalle(idcarrito);
				
				System.out.print("Confirma la compra (S/N);");
				confirmar = keyboard.next();
				if (confirmar.equals("S")) {
					cliente.comprar(idcarrito, cvs);
					cliente = null;
				}
				
				break;
			case 9:
				System.out.println("Saliendo del programa!!!");
				break;
			default:
				System.out.printf("Ingrese una opcion valida!!!\n\n\n");
				break;

			}

		}
	}
}