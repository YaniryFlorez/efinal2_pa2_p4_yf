package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(value = TxType.MANDATORY)
	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Materia buscarPorCodigo(String codigo) {
		TypedQuery<Materia> myQuery = this.entityManager.createQuery(
				"SELECT m FROM Materia m WHERE m.codigo=:datoCodigo", Materia.class);
		myQuery.setParameter("datoCodigo", codigo);

		try {
			return myQuery.getSingleResult();
		  } catch (Exception e) {
			return null;
		  }
	  }
}
	
	
	
	


