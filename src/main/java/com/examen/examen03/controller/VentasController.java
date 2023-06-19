package com.examen.examen03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examen03.entity.Ventas;
import com.examen.examen03.service.VentasService;
@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	VentasService x;
	
	@PostMapping 
	public Ventas guardar (@RequestBody Ventas a) {
		return x.registrar(a);
	}
	@PutMapping
	public Ventas actualizar   (@RequestBody Ventas a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Ventas a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Ventas> verc(){
		return x.ver();
	}
}
