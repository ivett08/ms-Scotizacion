package com.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msproducto.entity.Producto;


@Repository
public interface ProductoRepository extends JpaRepository <Producto, Integer>{
	

}
