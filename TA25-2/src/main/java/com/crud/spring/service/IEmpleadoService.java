package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Empleado;

public interface IEmpleadoService {
	
	//listar
	public List<Empleado> listarEmpleados();
	//C
	public Empleado createEmpleado(Empleado empleado);
	//R
	public Empleado readEmpleado(String dni);
	//U
	public Empleado updateEmpleado(Empleado empleado);
	//D
	public void deleteEmpleado(String dni);
}
