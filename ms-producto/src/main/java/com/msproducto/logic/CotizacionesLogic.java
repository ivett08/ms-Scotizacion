package com.msproducto.logic;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproducto.entity.Plazo;
import com.msproducto.entity.Producto;
import com.msproducto.service.CotizacionesService;
import com.producto.repository.CotizacionesRepository;
import com.producto.repository.PlazoRepository;
import com.producto.repository.ProductoRepository;

@Service
public class CotizacionesLogic implements CotizacionesService{
	
	//@Autowired
	//CotizacionesRepository daoCotizaciones;
	@Autowired
	ProductoRepository daoProducto;
	@Autowired
	PlazoRepository daoPlazo;

	@Override
	public String cotizacion(int productoId, int plazoId) {
		Optional<Producto> tmpDaoPro = daoProducto.findById(productoId);
		float precio = tmpDaoPro.get().getPrecio();
		
		Optional<Plazo> tmpDaoPla = daoPlazo.findById(plazoId);
		float t_normal = tmpDaoPla.get().getTnormal();
		float t_puntual = tmpDaoPla.get().getTpuntual();
		float plazos = Float.parseFloat(tmpDaoPla.get().getTipo());
		
		
		float total_normal = ((precio * t_normal) + precio) / plazos;
		
		
		float total_puntual = ((precio * t_puntual) + precio) / plazos;

		String res = "";
		
		res += res.format("c_normal : %s ,", String.valueOf(total_normal));
		res += res.format("c_puntual : %s", String.valueOf(total_puntual));
		
		
		return res;
	}
	

}
