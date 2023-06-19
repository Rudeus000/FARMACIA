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

import com.examen.examen03.entity.Devoluciones;
import com.examen.examen03.service.DevolucionesService;

@RestController
@RequestMapping("/devoluciones")
public class DevolucionesController {
	@Autowired
	DevolucionesService x;
	
	@PostMapping
	public Devoluciones guardar (@RequestBody Devoluciones a) {
		return x.registrar(a);
	}
	@PutMapping
	public Devoluciones actualizar   (@RequestBody Devoluciones a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Devoluciones a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Devoluciones> verc(){
		return x.ver();
	}
}
