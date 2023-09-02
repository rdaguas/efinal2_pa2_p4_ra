package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Matricula matricula) {
		Estudiante estu = new Estudiante();
		Materia mate = new Materia();
		Matricula matri = new Matricula();
		matricula.getCedulaEstudiante();
		matricula.getCodigoMateria();
		
		this.matriculaRepository.insertar(matricula);
		
	}

}
