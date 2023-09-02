package com.example.demo.modelo.dto;

public class MatriculaDto {

	private String cedulaEstudiante;
	private String nombreMateria;
	private String cedulaProfesor;
	private String nombreHilo;
	
	public MatriculaDto() {
		
	}

	public MatriculaDto(String cedulaEstudiante, String nombreMateria, String cedulaProfesor, String nombreHilo) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.nombreMateria = nombreMateria;
		this.cedulaProfesor = cedulaProfesor;
		this.nombreHilo = nombreHilo;
	}

	//set y get
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getCedulaProfesor() {
		return cedulaProfesor;
	}

	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	@Override
	public String toString() {
		return "MatriculaDto [cedulaEstudiante=" + cedulaEstudiante + ", nombreMateria=" + nombreMateria
				+ ", cedulaProfesor=" + cedulaProfesor + ", nombreHilo=" + nombreHilo + "]";
	}
	
	
	
}
