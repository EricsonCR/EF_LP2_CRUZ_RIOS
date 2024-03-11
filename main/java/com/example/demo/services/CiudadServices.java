package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ICiudad;
import com.example.demo.interfacesServices.ICiudadServices;
import com.example.demo.model.Ciudad;

@Service
public class CiudadServices implements ICiudadServices {

	@Autowired
	private ICiudad data;

	@Override
	public List<Ciudad> Listar() {
		return (List<Ciudad>) data.findAll();
	}

	@Override
	public Optional<Ciudad> BuscarId(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int Guardar(Ciudad oCiudad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Eliminar(String id) {
		// TODO Auto-generated method stub

	}

}
