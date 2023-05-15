package com.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msproducto.entity.Plazo;

@Repository
public interface PlazoRepository extends JpaRepository <Plazo, Integer>{

	
	
}
