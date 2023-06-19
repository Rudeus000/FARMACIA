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

import com.examen.examen03.entity.Detalle_Compra;

import com.examen.examen03.service.Detalle_CompraService;
@RestController
@RequestMapping("/detalleLo")
public class Detalle_LoteController {
	@Autowired
	Detalle_CompraService x;
	
	@PostMapping
	public Detalle_Compra guardar (@RequestBody Detalle_Compra a) {
		return x.registrar(a);
	}
	@PutMapping
	public Detalle_Compra actualizar   (@RequestBody Detalle_Compra a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Detalle_Compra a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Detalle_Compra> verc(){
		return x.ver();
	}
}
