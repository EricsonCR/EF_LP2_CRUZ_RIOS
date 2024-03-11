package com.example.demo.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Ciudad;

public interface ICiudadServices {

	public List<Ciudad> Listar();

	public Optional<Ciudad> BuscarId(String id);

	public int Guardar(Ciudad oCiudad);

	public void Eliminar(String id);
}
