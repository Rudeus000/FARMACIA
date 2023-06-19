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

import com.examen.examen03.entity.Lotes;
import com.examen.examen03.service.LotesService;
@RestController
@RequestMapping("/lotes")
public class LotesController {
	@Autowired
	LotesService x;
	
	@PostMapping
	public Lotes guardar (@RequestBody Lotes a) {
		return x.registrar(a);
	}
	@PutMapping
	public Lotes actualizar   (@RequestBody Lotes a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Lotes a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Lotes> verc(){
		return x.ver();
	}
}
