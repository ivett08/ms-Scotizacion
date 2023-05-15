package com.msproducto.controller;

import java.util.HashMap;
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

import com.msproducto.entity.Producto;
import com.msproducto.logic.ProductoLogic;
import com.msproducto.request.ProductoRequest;

@RestController

@RequestMapping("producto")
public class ProductoController {

	@Autowired
	ProductoLogic service;
	
	//http:localhost:8090/prodcuto/mostrar
	@GetMapping("Mostrar")
	public ResponseEntity<List<Producto>>mostrar(){
	List<Producto> lista = service.mostrar();
	return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);
	}
	
	//http:localhost:8090/prodcuto/editar
	@PutMapping("editar")
	public ResponseEntity<Producto>editar(@RequestBody ProductoRequest request){
	Producto pr = service.editar(request);
	return new ResponseEntity<Producto>(pr, HttpStatus.OK);
	}
	
	//http:localhost:8090/prodcuto/guardar
	@PostMapping("guardar")
	public ResponseEntity<Producto>guardar(@RequestBody ProductoRequest request){
	Producto pr = service.guardar(request);
	return new ResponseEntity<Producto>(pr, HttpStatus.OK);
	}
	
	//http:localhost:8090/producto/buscar/id
	@GetMapping("buscar/{id}")
	public ResponseEntity<Producto>buscar(@PathVariable int id){
	Producto pr = service.buscar(id);
	return new ResponseEntity<Producto>(pr, HttpStatus.OK);
	}
	
	//http:localhost:8090/producto/eliminar/id
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String>eliminar(@PathVariable int id){
	String pr = service.eliminar(id);
	return new ResponseEntity<String>(pr, HttpStatus.OK);
	}
	
	
	
	
}
