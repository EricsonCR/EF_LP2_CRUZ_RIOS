package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IVentas;
import com.example.demo.interfacesServices.IVentasServices;
import com.example.demo.model.Venta;

@Service
public class VentasServices implements IVentasServices {

	@Autowired
	private IVentas data;

	@Override
	public List<Venta> Listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Venta> BuscarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int Guardar(Venta oVenta) {
		Venta obj = data.save(oVenta);
		if (obj.getId() > 0) {
			return obj.getId();
		}
		return 0;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

}
