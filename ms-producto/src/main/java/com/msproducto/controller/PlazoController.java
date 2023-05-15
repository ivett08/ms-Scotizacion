package com.msproducto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproducto.entity.Plazo;
import com.msproducto.logic.PlazoLogic;
import com.msproducto.request.PlazoRequest;


@RestController

@RequestMapping("plazo")

public class PlazoController {
	
	@Autowired
	PlazoLogic service;
	
	//http:localhost:8081/plazo/mostrar
		@GetMapping("mostrar")
		public ResponseEntity<List<Plazo>>mostrar(){
		List<Plazo> lista = service.mostrar();
		return new ResponseEntity<List<Plazo>>(lista, HttpStatus.OK);
		}
		
		//http:localhost:8081/plazo/editar
		@PutMapping("editar")
		public ResponseEntity<Plazo>editar(@RequestBody PlazoRequest request){
		Plazo pl = service.editar(request);
		return new ResponseEntity<Plazo>(pl, HttpStatus.OK);
		
		}
		
		//http:localhost:8081/plazo/guardar
		@PostMapping("guardar")
		public ResponseEntity<Plazo>guardar(@RequestBody PlazoRequest request){
		Plazo pl = service.guardar(request);
		return new ResponseEntity<Plazo>(pl, HttpStatus.OK);
		
		}
		
		//http:localhost:8081/plazo/buscar/id
		@GetMapping("buscar/{id}")
		public ResponseEntity<Plazo>buscar(@PathVariable int id){
		Plazo pl = service.buscar(id);
		return new ResponseEntity<Plazo>(pl, HttpStatus.OK);
		}
		
		
		//http:localhost:8081/producto/buscar/id
		@DeleteMapping("eliminar/{id}")
		public ResponseEntity<String>eliminar(@PathVariable int id){
		String pl = service.eliminar(id);
		return new ResponseEntity<String>(pl, HttpStatus.OK);
		}
		
		

}
