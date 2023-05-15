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
@Table (name ="PLAZO")

public class Plazo implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Plazo() {
		
	}
	
	
	
	public Plazo(int plazoId) {
		this.plazoId = plazoId;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "lid_auto")//Equivale al trigger de SQL
	@SequenceGenerator(name="lid_auto", sequenceName="PLAZO_SEQ", allocationSize=1)
	
	@Column(name="ID_PLAZO", columnDefinition="NUMBER")
	private int plazoId;
	@Column(name="TIPO_PLAZO", columnDefinition="NVARCHAR2(30)")
	private String tipo;
	@Column(name="T_NORMAL", columnDefinition="NUMBER")
	private float tnormal;
	@Column(name="T_PUNTUAL", columnDefinition="NUMBER")
	private float tpuntual;

	public int getPlazoId() {
		return plazoId;
	}



	public void setPlazoId(int plazoId) {
		this.plazoId = plazoId;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public float getTnormal() {
		return tnormal;
	}



	public void setTnormal(float tnormal) {
		this.tnormal = tnormal;
	}



	public float getTpuntual() {
		return tpuntual;
	}



	public void setTpuntual(float tpuntual) {
		this.tpuntual = tpuntual;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


}
