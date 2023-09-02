package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepository materiaRepository;

	@Transactional(value =TxType.REQUIRED)
	@Override
	public void ingresar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(materia);;
	}

	@Transactional(value =TxType.NOT_SUPPORTED)
	@Override
	public Materia buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscarPorCodigo(codigo);
	}
	
	
	
	

}
