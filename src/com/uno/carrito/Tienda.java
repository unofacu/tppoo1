package com.uno.carrito;

import java.util.ArrayList;

public class Tienda {

	ArrayList<Cliente> clientes;

	public Tienda() {
		
		this.clientes = new ArrayList<Cliente>();
		
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void quitarCliente(int id) {
		this.clientes.remove(id);
	}
	
	public Cliente obtenerCliente(int id) {
		
		Cliente cliente = null;
		
		if (id < this.clientes.size())
			cliente = this.clientes.get(id);
		
		return cliente;
		
	}
	
	public void mostrarClientes() {
		int i = 0;
		System.out.printf("%3s\t%-30s\t%-30s\t%-30s\n\n", "id", "Nombre", "Direccion de Cobro", "Email");
		for (Cliente cliente : this.clientes) {
			System.out.printf("%3d\t%-30s\t%-30s\t%-30s\n", i, cliente.getNombre(), cliente.getDireccionEnvio(), cliente.getEmail());
			i++;
		}
	}
	
	
}
