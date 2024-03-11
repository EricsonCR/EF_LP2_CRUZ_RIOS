package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IVentaDetalle;
import com.example.demo.interfacesServices.IVentaDetalleServices;
import com.example.demo.model.VentaDetalle;

@Service
public class VentaDetalleServices implements IVentaDetalleServices {

	@Autowired
	private IVentaDetalle data;

	@Override
	public List<VentaDetalle> Listar() {
		return (List<VentaDetalle>) data.findAll();
	}

	@Override
	public Optional<VentaDetalle> BuscarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int Guardar(VentaDetalle obj) {
		data.save(obj);
		return 0;
	}

	@Override
	public void Eliminar(int id) {
		// TODO Auto-generated method stub

	}
}
