package com.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msproducto.entity.Cotizaciones;

@Repository
public interface CotizacionesRepository extends JpaRepository<Cotizaciones, Integer>{

}
