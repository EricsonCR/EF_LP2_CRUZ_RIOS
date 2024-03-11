package com.example.demo.model;

import javax.persistence.Id;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String NombreComprador;
	private Date FechaVenta;
	private double MontoTotal;

	public Venta() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombreComprador() {
		return NombreComprador;
	}

	public void setNombreComprador(String nombreComprador) {
		NombreComprador = nombreComprador;
	}

	public Date getFechaVenta() {
		return FechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		FechaVenta = fechaVenta;
	}

	public double getMontoTotal() {
		return MontoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		MontoTotal = montoTotal;
	}

}
