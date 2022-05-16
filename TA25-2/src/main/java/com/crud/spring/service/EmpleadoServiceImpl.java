package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IEmpleadoDAO;
import com.crud.spring.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado createEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado readEmpleado(String dni) {
		return iEmpleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void deleteEmpleado(String dni) {
		iEmpleadoDAO.deleteById(dni);
	}

}
