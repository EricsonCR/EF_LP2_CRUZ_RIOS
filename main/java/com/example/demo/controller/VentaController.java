package com.example.demo.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Ciudad;
import com.example.demo.model.Venta;
import com.example.demo.model.VentaDetalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.interfacesServices.ICiudadServices;
import com.example.demo.interfacesServices.IVentaDetalleServices;
import com.example.demo.interfacesServices.IVentasServices;

@Controller
public class VentaController {

	@Autowired
	private IVentasServices serviceVenta;
	@Autowired
	private ICiudadServices serviceCiudad;
	@Autowired
	private IVentaDetalleServices serviceVentaDetalle;

	List<VentaDetalle> lista = new ArrayList<VentaDetalle>();

	@GetMapping("venta")
	public String Venta(Model model) throws ParseException {
		model.addAttribute("ListaVentaDetalle", lista);
		model.addAttribute("ListaCiudades", serviceCiudad.Listar());
		model.addAttribute("VentaDetalle", new VentaDetalle());
		return "venta";
	}

	@GetMapping("/venta/agregar")
	public String Agregar(@Validated VentaDetalle obj, Model model) {
		double subtotal = obj.getCantidad();
		subtotal *= 50;
		obj.setSubTotal(subtotal);
		lista.add(obj);
		System.out.println("total:" + lista.size());
		return "redirect:/venta";
	}

	@GetMapping("/venta/grabar")
	public String Grabar(@Validated VentaDetalle obj, Model model) throws ParseException {

		double total = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			total += lista.get(i).getSubTotal();
		}

		Venta oVenta = new Venta();
		oVenta.setNombreComprador(lista.get(0).getNombreComprador());
		oVenta.setFechaVenta(leerFecha());
		oVenta.setMontoTotal(total);

		// se definio el metodo para que devolviera el id del registro ingresado
		int idVenta = serviceVenta.Guardar(oVenta);
		if (idVenta > 0) {
			for (int i = 0; i < lista.size(); i++) {
				lista.get(i).setIdVenta(idVenta);
				serviceVentaDetalle.Guardar(lista.get(i));
			}
			System.out.println("venta registrada");
			lista.clear();
			return "mensaje";
		}

		return "redirect:/venta";
	}

	public Date leerFecha() throws ParseException {
		LocalDate localDate = LocalDate.now();// For reference
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedString = localDate.format(formatter);

		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = isoFormat.parse(formattedString);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		System.out.println(sqlDate);
		return sqlDate;
	}

}
