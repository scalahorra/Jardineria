package modelo;

import java.util.*;

public class Pedido {

	private Integer codigoPedido;
	private Calendar fechaPedido;
	private Calendar fechaEsperada;
	private Calendar fechaEntrega;
	private String estado;
	private String comentario;
	
	
	public Pedido(Integer codigoPedido, String estado, Calendar fechaPedido, Calendar fechaEsperada) {
		
		this.codigoPedido = codigoPedido;
		this.estado = estado;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
	}
	

	public Integer getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Calendar getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Calendar fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Calendar getFechaEsperada() {
		return fechaEsperada;
	}
	public void setFechaEsperada(Calendar fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}

	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Calendar fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
