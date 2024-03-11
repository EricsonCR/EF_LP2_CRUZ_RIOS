package com.example.demo.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.VentaDetalle;

public interface IVentaDetalleServices {

	public List<VentaDetalle> Listar();

	public Optional<VentaDetalle> BuscarId(int id);

	public int Guardar(VentaDetalle obj);

	public void Eliminar(int id);
}
