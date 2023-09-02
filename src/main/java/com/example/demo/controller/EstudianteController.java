package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;
	
	
	@PostMapping("/crearEstudiante")
	public String crearEstudiante(Estudiante estudiante){
		this.estudianteService.ingresar(estudiante);
		
		return "redirect:/estudiantes/nuevoEstudiante";
	}
	
	@GetMapping("/nuevoEstudiante")
	public String nuevoEstudiante(Estudiante estudiante) {
		
		return "vistaNuevoEstudiante";
	}
	
	
}
