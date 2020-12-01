package app;

import java.util.List;

import dao.ClienteDao;
import modelo.Cliente;

public class App {

	public static void main(String[] args) {
		
		ClienteDao clienteDao = new ClienteDao();
        List<Cliente> misClientes = clienteDao.mostrarTodos();
       
        for(Cliente u: misClientes) {
        	System.out.println(u.toString());
        }

	}

}
