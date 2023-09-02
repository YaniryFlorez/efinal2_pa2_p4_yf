package com.example.demo.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.EstudianteRepositoryImpl;
import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IEstudianteRepository estudianteRepository;
	@Autowired
	private IMateriaRepository materiaRepository ;
	
	@Transactional(value = TxType.REQUIRED)
	@Override
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void CrearMatricula(String cedulaEst, String codigoMate) {
	     Estudiante estu= this.estudianteRepository.buscarPorCedula(cedulaEst);
	     Materia mate=this.materiaRepository.buscarPorCodigo(codigoMate);
	     
	     Matricula matri=new Matricula();
	     
	     matri.setEstudiante(estu);
	    
	     
	     
		
		
	}

	
	
	

}
