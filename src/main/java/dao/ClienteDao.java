package dao;

import java.util.*;
import java.util.Optional;

import modelo.Cliente;

public class ClienteDao implements DAO<Cliente>{

	private List<Cliente> clientes = new ArrayList<>();
	
	public ClienteDao() {
		
		clientes.add(new Cliente(1, "Sergio", "675246874"));
		clientes.add(new Cliente(2, "Belen", "658745896"));
		clientes.add(new Cliente(3, "Jaime", "987456321"));
	}
	
	public Optional<Cliente> mostrar(long id) {
		return null;
	}

	public List<Cliente> mostrarTodos() {
		return clientes;
	}

	public void guardar(Cliente cliente) {
		
		for (Cliente Cliente : clientes) {
			
			if(Cliente.getCodigoCliente() == cliente.getCodigoCliente()) {
				
				System.out.println("El cliente que quiere crear ya esta en nuestra base de datos");
				return;
			}
		}
		
		clientes.add(cliente);
		System.out.println("Cliente añadido a nuestra base de datos");
	}

	public void actualizar(Cliente cliente,String[] params) {
		
		cliente.setNombreCliente(Objects.requireNonNull(params[0], "Requiere un nombre"));
		cliente.setTelefono(Objects.requireNonNull(params[1], "Requiere un telefono de contacto"));
	}

	public void borrar(Cliente cliente) {
		
		clientes.remove(cliente);
	}

}
