package com.msproducto.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproducto.entity.Plazo;

import com.msproducto.request.PlazoRequest;
import com.msproducto.service.PlazoService;
import com.producto.repository.PlazoRepository;


 @Service
public class PlazoLogic implements  PlazoService{


	@Autowired
	PlazoRepository daoPlazo;

	@Override
	public Plazo guardar(PlazoRequest request) {
		Plazo pl=new Plazo();
		
		pl.setTipo(request.getTipo());
		pl.setTnormal(request.getTnormal());
		pl.setTpuntual(request.getTpuntual());
		
		daoPlazo.save(pl);
		
		return pl;
	}

	@Override
	public Plazo editar(PlazoRequest request) {
		Plazo pl= daoPlazo.findById(request.getPlazoId()).get();
		
		pl.setTipo(request.getTipo());
		pl.setTnormal(request.getTnormal());
		pl.setTpuntual(request.getTpuntual());
		
		daoPlazo.save(pl);
		return pl;
	}

	@Override
	public Plazo buscar(int id) {
		return  daoPlazo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		daoPlazo.deleteById(id);
		return "Registro Elimado";
	}

	@Override
	public List<Plazo> mostrar() {
		return daoPlazo.findAll();
	}

	
	

}
