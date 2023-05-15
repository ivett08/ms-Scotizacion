package com.msproducto.service;

import java.util.List;


import com.msproducto.entity.Producto;
import com.msproducto.request.ProductoRequest;

public interface ProductoService {
	
	Producto guardar(ProductoRequest request);
	Producto editar(ProductoRequest request);
	Producto buscar(int id);
	String eliminar(int id);
	List<Producto>mostrar();

}
