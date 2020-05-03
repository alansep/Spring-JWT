package com.alansep.JWT.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alansep.JWT.core.model.Carro;
import com.alansep.JWT.core.service.CarroService;

@RestController
@RequestMapping("/carros")
public class CarroController {

	
	@Autowired
	private CarroService carroService;
	
	@GetMapping
	public List<Carro> getCarros(){
		return carroService.getRepository().findAll();
	}
	
	@PostMapping
	public Carro saveCarro(@Valid @RequestBody Carro carro) {
		return carroService.salvarCarro(carro);
	}
	
}
