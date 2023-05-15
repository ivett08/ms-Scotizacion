package com.msproducto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table (name ="COTIZACIONES")

public class Cotizaciones implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Cotizaciones () {
		
	}
	
	
	public Cotizaciones(int cotizacionId) {
		this.cotizacionId = cotizacionId;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "cid")
	@SequenceGenerator(name="cid", sequenceName="COTIZACIONES_SEQ", allocationSize=1)
	
	@Column(name="ID_COTIZACION", columnDefinition="NUMBER")
	private int cotizacionId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(30)")
	private String nombre;
	@Column(name="ID_PRODUCTO", columnDefinition="NUMBER")
	private int producto;
	@Column(name="ID_PLAZO", columnDefinition="NUMBER")
	private int plazo;

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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
