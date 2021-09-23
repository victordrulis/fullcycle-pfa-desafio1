package com.victor.desafioum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursosController {

    @GetMapping("/cursos")
	public String index() {
		return "Cursos fullcycle!";
	}
}