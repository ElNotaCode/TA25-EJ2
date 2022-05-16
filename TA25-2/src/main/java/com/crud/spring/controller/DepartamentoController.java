package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.dto.Departamento;
import com.crud.spring.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoService;
	
	//listar
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoService.listarDepartamentos();
	}
	
	//C
	@PostMapping("/departamentos")
	public Departamento createDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.createDepartamento(departamento);
	}
	
	//R
	@GetMapping("/departamentos/{codigo}")
	public Departamento readDepartamento(@PathVariable(name="codigo") Long codigo) {
		return departamentoService.readDepartamento(codigo);
	}
	
	//U
	@PutMapping("/departamentos/{codigo}")
	public Departamento updateDepartamento(@PathVariable(name="codigo") Long codigo,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado;
		Departamento departamento_actualizado;
		
		departamento_seleccionado = departamentoService.readDepartamento(codigo);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoService.updateDepartamento(departamento_seleccionado);
		
		return departamento_actualizado;
	}
	
	//D
	@DeleteMapping("/departamentos/{codigo}")
	public void deleteDepartamento(@PathVariable(name="codigo") Long codigo) {
		departamentoService.deleteDepartamento(codigo);
	}
}
