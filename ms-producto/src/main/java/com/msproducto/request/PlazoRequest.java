package com.msproducto.request;

public class PlazoRequest {

	private int plazoId;
	private String tipo;
	private float tnormal;
	private float tpuntual;
	
	
	public PlazoRequest(int plazoId, String tipo, float tnormal, float tpuntual) {
		this.plazoId = plazoId;
		this.tipo = tipo;
		this.tnormal = tnormal;
		this.tpuntual = tpuntual;
	}


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
	
	
	
	
	
}
