package dao;

import java.util.*;

public interface DAO<T> {

	Optional<T> mostrar(long id);
	
	List<T> mostrarTodos();
	
	void guardar(T t);
	
	void actualizar(T t, String[] params);
	
	void borrar(T t);
}
