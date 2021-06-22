package com.example.prices;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private Date fechaAplicacion;
	private String idProduct;
	private String idCadena;
	
	private Integer tarifaAplicar;
	private Integer precioFinalAplicar;
	
	public Controller() {
		super();
	}
	
	public Controller(Date fechaAplicacion, String idProduct, String idCadena,
			Integer tarifaAplicar, Integer precioFinalAplicar) {
		super();
		this.fechaAplicacion = fechaAplicacion;
		this.idProduct = idProduct;
		this.idCadena = idCadena;
		this.tarifaAplicar = tarifaAplicar;
		this.precioFinalAplicar = precioFinalAplicar;
	}

	@GetMapping("/prices")
	public String getData(Date fechaAplicacion, Long idProduct, Long idCadena) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Prices [fechaAplicacion=");
		builder.append(fechaAplicacion);
		builder.append(", idProduct=");
		builder.append(idProduct);
		builder.append(", idCadena=");
		builder.append(idCadena);
		builder.append(", tarifaAplicar=");
		builder.append(tarifaAplicar);
		builder.append(", precioFinalAplicar=");
		builder.append(precioFinalAplicar);
		builder.append("]");
		return builder.toString();
	}

	

	public Date getFechaAplicacion() {
		return fechaAplicacion;
	}

	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getIdCadena() {
		return idCadena;
	}

	public void setIdCadena(String idCadena) {
		this.idCadena = idCadena;
	}

	public Integer getTarifaAplicar() {
		return tarifaAplicar;
	}

	public void setTarifaAplicar(Integer tarifaAplicar) {
		this.tarifaAplicar = tarifaAplicar;
	}

	public Integer getPrecioFinalAplicar() {
		return precioFinalAplicar;
	}

	public void setPrecioFinalAplicar(Integer precioFinalAplicar) {
		this.precioFinalAplicar = precioFinalAplicar;
	}

	
}
