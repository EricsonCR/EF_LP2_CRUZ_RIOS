package com.example.demo.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Venta;

public interface IVentasServices {

	public List<Venta> Listar();

	public Optional<Venta> BuscarId(int id);

	public int Guardar(Venta oVenta);

	public void eliminar(int id);
}
