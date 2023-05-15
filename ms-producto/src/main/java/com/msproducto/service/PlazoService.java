package com.msproducto.service;

import java.util.List;

import com.msproducto.entity.Plazo;
import com.msproducto.request.PlazoRequest;


public interface PlazoService {
	

	Plazo guardar(PlazoRequest request);
	Plazo editar(PlazoRequest request);
	Plazo buscar(int id);
	String eliminar(int id);
	List<Plazo>mostrar();

}
