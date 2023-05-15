package com.msproducto.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproducto.entity.Producto;
import com.msproducto.request.ProductoRequest;
import com.msproducto.service.ProductoService;

import com.producto.repository.ProductoRepository;

@Service
public class ProductoLogic implements ProductoService{
	
	
	@Autowired
	ProductoRepository daoProducto;
	


	@Override
	public Producto guardar(ProductoRequest request) {
		
		Producto pr= new Producto();
		
		pr.setNombre(request.getNombre());
		pr.setDescripcion(request.getDescripcion());
		pr.setPrecio(request.getPrecio());
		
		daoProducto.save(pr);
		
		return pr;
	}

	@Override
	public Producto editar(ProductoRequest request) {
		
		Producto pr= daoProducto.findById(request.getProductoId()).get();
		
		pr.setNombre(request.getNombre());
		pr.setDescripcion(request.getDescripcion());
		pr.setPrecio(request.getPrecio());
		
		daoProducto.save(pr);

		
		return pr;
	}
	

	@Override
	public Producto buscar(int id) {
		
		return daoProducto.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		
		daoProducto.deleteById(id);
		
		return "Registro Eliminado";
	}

	@Override
	public List<Producto> mostrar() {
		return daoProducto.findAll();
	}	
	

}
