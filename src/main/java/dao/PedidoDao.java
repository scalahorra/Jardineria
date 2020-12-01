package dao;

import java.util.*;

import modelo.Pedido;

public class PedidoDao implements DAO<Pedido>{
	
	private List<Pedido> pedidos = new ArrayList<>();
	
	public PedidoDao() {
		
		pedidos.add(new Pedido(1, "Pendiente", new Calendar.Builder().setDate(2021, Calendar.JANUARY, 18).build(),
				new Calendar.Builder().setDate(2021, Calendar.FEBRUARY, 25).build()));
		pedidos.add(new Pedido(2, "Entregado", new Calendar.Builder().setDate(2021, Calendar.JANUARY, 15).build(),
				new Calendar.Builder().setDate(2021, Calendar.SEPTEMBER, 30).build()));
	}

	@Override
	public Optional<Pedido> mostrar(long id) {
		return null;
	}

	@Override
	public List<Pedido> mostrarTodos() {
		return pedidos;
	}

	@Override
	public void guardar(Pedido pedido) {
		
		for (Pedido Pedido : pedidos) {
			
			if(Pedido.getCodigoPedido() == pedido.getCodigoPedido()) {
				
				System.out.println("El pedido que quiere crear ya esta en nuestra base de datos");
				return;
			}
		}
		
		pedidos.add(pedido);
		System.out.println("Pedido añadido a nuestra base de datos");
	}

	@Override
	public void actualizar(Pedido pedido, String[] params) {
		
		pedido.setEstado(Objects.requireNonNull(params[0], "Requiere un estado de envio"));
	}

	@Override
	public void borrar(Pedido pedido) {
		pedidos.remove(pedido);
	}

}
