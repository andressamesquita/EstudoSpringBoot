package com.example.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.forum.modelo.Curso;
import com.example.forum.modelo.Topico;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	public List<Topico> lista(){
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		
		return Arrays.asList(topico, topico, topico);
		
	}

}
