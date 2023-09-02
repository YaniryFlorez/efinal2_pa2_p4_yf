package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {

	@Autowired
	private IMateriaService materiaService;
	
	
	@PostMapping("/crearMateria")
	public String crearMateria(Materia materia){
		this.materiaService.ingresar(materia);
		
		return "redirect:/materias/nuevaMateria";
	}
	
	@GetMapping("/nuevaMateria")
	public String nuevaMateria(Materia materia) {
		
		return "vistaNuevaMateria";
	}
	
	
}
