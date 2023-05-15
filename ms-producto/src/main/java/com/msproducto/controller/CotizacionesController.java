package com.msproducto.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproducto.logic.CotizacionesLogic;
import com.msproducto.logic.PlazoLogic;
import com.msproducto.logic.ProductoLogic;

@RestController

@RequestMapping("cotizacion")
public class CotizacionesController {

	@Autowired
	CotizacionesLogic service;
	
	
	
	
	@GetMapping("cotizar/{producto_Id}/{plazoId}")
	public ResponseEntity<Object>cotizar(@PathVariable int producto_Id,@PathVariable int plazoId){
	String ct = String.valueOf(service.cotizacion(producto_Id, plazoId));
	
//	return new ResponseEntity<String>(pr, HttpStatus.OK);
	return generatedResponse(HttpStatus.OK, "cotizacion", ct);
	}
	
	
	public static ResponseEntity<Object> generatedResponse(HttpStatus status, String messages, Object response) {
        HashMap<String, Object> res = new HashMap<>();
        res.put("data", response);
        res.put("messages", messages);
        res.put("status", status.value());
        return new ResponseEntity<Object>(res, status);
    }
	
	

}
