package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.dto.MatriculaDto;
import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaRepository {
	
	public void insertar(Matricula matricula);
	public List<MatriculaDto> seleccionarLista();

}
