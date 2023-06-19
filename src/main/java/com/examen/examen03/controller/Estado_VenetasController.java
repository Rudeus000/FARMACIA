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

import com.examen.examen03.entity.Estado_Ventas;
import com.examen.examen03.service.Estado_VentasService;
@RestController
@RequestMapping
public class Estado_VenetasController {
	@Autowired
	Estado_VentasService x;
	
	@PostMapping
	public Estado_Ventas guardar (@RequestBody Estado_Ventas a) {
		return x.registrar(a);
	}
	@PutMapping
	public Estado_Ventas actualizar   (@RequestBody Estado_Ventas a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Estado_Ventas a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Estado_Ventas> verc(){
		return x.ver();
	}
}
