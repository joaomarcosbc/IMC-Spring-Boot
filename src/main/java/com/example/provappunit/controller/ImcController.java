package com.example.provappunit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.provappunit.model.IMC;

@RestController
@RequestMapping("/imc")
public class ImcController {

	@GetMapping
	public ResponseEntity<String> calculoIMC(@RequestBody IMC imc) {
		
		new IMC(imc.getAltura(), imc.getPeso());
		return ResponseEntity.ok(imc.getResultado());
		
	}
	
}
