package com.uno.carrito;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductosAComprar {
		
		protected static ArrayList <Producto> listaProductos = new ArrayList <Producto>();
		Producto prodtemporal;
		
		public ProductosAComprar() {
		}
		
		public void listaDeProductos (){
			try {
				FileReader input = new FileReader("listaproductos.txt");
				BufferedReader bufInput = new BufferedReader(input);
				
				String line;
				
				line = bufInput.readLine();
				
				while(line != null){
					String [] datos;
					
					datos = line.split(":");
								
					int id = Integer.parseInt(datos[0]);
					String nombre  = (datos[1]);
					float precio = Float.parseFloat(datos[2]);
					
					prodtemporal= new Producto(id, nombre, precio); 
				    listaProductos.add(prodtemporal);
				
				line = bufInput.readLine();
				
				}
				
				bufInput.close();
				
				for (int i = 0; i < listaProductos.size(); i++) {//imprimo la lista
					System.out.printf("\t%3d\t%-30s\t%3.2f\n", listaProductos.get(i).getId(), 
							listaProductos.get(i).getNombre(), listaProductos.get(i).getPrecio());

				}
				
			} 
			 
			catch (IOException e){
				e.printStackTrace();
		    }
		}		

	public void mostrarCantidad() {
		System.out.println(listaProductos.size());
	}
	
}

