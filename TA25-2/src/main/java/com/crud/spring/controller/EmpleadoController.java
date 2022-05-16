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

import com.crud.spring.dto.Empleado;
import com.crud.spring.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoService;
	
	//Listar
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoService.listarEmpleados();
	}
	//C
	@PostMapping("/empleados")
	public Empleado createEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.createEmpleado(empleado);
	}
	
	//R
	@GetMapping("/empleados/{dni}")
	public Empleado readEmpleado(@PathVariable(name="dni") String dni) {
		return empleadoService.readEmpleado(dni);
	}
	
	//U
	@PutMapping("/empleados/{dni}")
	public Empleado updateEmpleado(@PathVariable(name="dni") String dni,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();
		
		empleado_seleccionado = empleadoService.readEmpleado(dni);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadoService.updateEmpleado(empleado_seleccionado);
		
		return empleado_actualizado;
	}
	
	//D
	@DeleteMapping("/empleados/{dni}")
	public void deleteEmpleados(@PathVariable(name="dni") String dni) {
		empleadoService.deleteEmpleado(dni);
	}

}
