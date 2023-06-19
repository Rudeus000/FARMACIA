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

import com.examen.examen03.entity.Inventario;
import com.examen.examen03.service.InventarioService;
@RestController
@RequestMapping("/inventario")
public class InventarioController {
	@Autowired
	InventarioService x;

	@PostMapping
	public Inventario guardar (@RequestBody Inventario a) {
		return x.registrar(a);
	}
	@PutMapping
	public Inventario actualizar   (@RequestBody Inventario a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Inventario a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Inventario> verc(){
		return x.ver();
	}
}
