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

import com.examen.examen03.entity.Ajustes;
import com.examen.examen03.service.AjustesService;


@RestController
@RequestMapping("/ajustes")
public class AjustesController {
	@Autowired
	AjustesService x;
	
	@PostMapping
	public Ajustes guardar (@RequestBody Ajustes a) {
		return x.registrar(a);
	}
	@PutMapping
	public Ajustes actualizar   (@RequestBody Ajustes a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Ajustes a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Ajustes> verc(){
		return x.ver();
	}
}
