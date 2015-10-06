package com.uno.carrito;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductosAComprar {

	private ArrayList<Producto> listaProductos;
	Producto prodtemporal;

	public ProductosAComprar(String nombreArchivo) {

		this.listaProductos = new ArrayList<Producto>();
		this.cargarListaProductos(nombreArchivo);

	}

	public void cargarListaProductos(String nombreArchivo) {

		try {
			FileReader input = new FileReader(nombreArchivo);
			BufferedReader bufInput = new BufferedReader(input);

			String line;

			line = bufInput.readLine();

			while (line != null) {
				String[] datos;

				datos = line.split(":");

				int id = Integer.parseInt(datos[0]);
				String nombre = (datos[1]);
				float precio = Float.parseFloat(datos[2]);

				prodtemporal = new Producto(id, nombre, precio);
				listaProductos.add(prodtemporal);

				line = bufInput.readLine();

			}

			bufInput.close();

		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void mostrarListaProductos() {

		for (int i = 0; i < listaProductos.size(); i++) {// imprimo la lista
			System.out.printf("\t%3d\t%-30s\t%3.2f\n", listaProductos.get(i)
					.getId(), listaProductos.get(i).getNombre(), listaProductos
					.get(i).getPrecio());

		}

	}
	
	public Producto getProducto(int id) {
		
		boolean encontre = false;
		Producto producto = null;
		
		for (int i = 0; i < this.listaProductos.size() && !encontre; i++)
			if (this.listaProductos.get(i).getId() == id) {
				producto = this.listaProductos.get(i);
				encontre = true;
			}
		
		return producto;
		
	}

}
