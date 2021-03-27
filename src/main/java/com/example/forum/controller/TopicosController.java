package com.example.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.forum.controller.dto.TopicoDto;
import com.example.forum.modelo.Curso;
import com.example.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		
		//converte a lista de Topico para lista de TopicoDto
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
		
	}

}
