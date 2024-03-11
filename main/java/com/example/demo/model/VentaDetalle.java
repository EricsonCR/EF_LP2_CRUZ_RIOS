package com.example.demo.model;

import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "venta_detalle")
public class VentaDetalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String CodigoDestino;
	private String CodigoOrigen;
	private int IdVenta;
	private int Cantidad;
	private String NombreComprador;
	private Date FechaSalida;
	private Date FechaRetorno;
	private double SubTotal;

	public VentaDetalle() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCodigoDestino() {
		return CodigoDestino;
	}

	public void setCodigoDestino(String codigoDestino) {
		CodigoDestino = codigoDestino;
	}

	public String getCodigoOrigen() {
		return CodigoOrigen;
	}

	public void setCodigoOrigen(String codigoOrigen) {
		CodigoOrigen = codigoOrigen;
	}

	public int getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(int idVenta) {
		IdVenta = idVenta;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public String getNombreComprador() {
		return NombreComprador;
	}

	public void setNombreComprador(String nombreComprador) {
		NombreComprador = nombreComprador;
	}

	public Date getFechaSalida() {
		return FechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		FechaSalida = fechaSalida;
	}

	public Date getFechaRetorno() {
		return FechaRetorno;
	}

	public void setFechaRetorno(Date fechaRetorno) {
		FechaRetorno = fechaRetorno;
	}

	public double getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(double subTotal) {
		SubTotal = subTotal;
	}

}
