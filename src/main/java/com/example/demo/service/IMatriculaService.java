
package com.example.demo.service;

import java.time.LocalDate;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaService {
 
	public void ingresar(Matricula matricula);
	
	public void CrearMatricula(String cedulaEst, String codigoMate);
	
}
