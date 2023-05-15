package com.msproducto.request;

public class CotizacionesRequest {
	
	private int cotizacionId;
	private String nombre;
	private int producto;
	private int plazo;
	
	public CotizacionesRequest(int cotizacionId, String nombre, int producto, int plazo) {
		this.cotizacionId = cotizacionId;
		this.nombre = nombre;
		this.producto = producto;
		this.plazo = plazo;
	}

	public int getCotizacionId() {
		return cotizacionId;
	}

	public void setCotizacionId(int cotizacionId) {
		this.cotizacionId = cotizacionId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
	

}
