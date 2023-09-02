package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.dto.MatriculaDto;
import com.example.demo.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Transactional
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);
		
	}

	@Override
	public List<MatriculaDto> seleccionarLista() {
		TypedQuery<MatriculaDto> myQuery = this.entityManager.createQuery("SELECT e FROM com.example.demo.modelo.dto(MatriculaDto)", MatriculaDto.class);
		return null;
	}

}
