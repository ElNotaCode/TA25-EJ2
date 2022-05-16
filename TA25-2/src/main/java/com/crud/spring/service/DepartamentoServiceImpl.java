package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IDepartamentoDAO;
import com.crud.spring.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	IDepartamentoDAO iDepartamentoDao;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		return iDepartamentoDao.findAll();
	}

	@Override
	public Departamento createDepartamento(Departamento departamento) {
		return iDepartamentoDao.save(departamento);
	}

	@Override
	public Departamento readDepartamento(Long codigo) {
		return iDepartamentoDao.findById(codigo).get();
	}

	@Override
	public Departamento updateDepartamento(Departamento departamento) {
		return iDepartamentoDao.save(departamento);
	}

	@Override
	public void deleteDepartamento(Long codigo) {
		// TODO Auto-generated method stub
		iDepartamentoDao.deleteById(codigo);
	}

}
