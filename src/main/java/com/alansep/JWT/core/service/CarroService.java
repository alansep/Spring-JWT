package com.alansep.JWT.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alansep.JWT.core.model.Carro;
import com.alansep.JWT.core.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;
	
	
	public CarroRepository getRepository() {
		return carroRepository;
	}


	public Carro salvarCarro(Carro carro) {
		return carroRepository.save(carro);
	}
	
}
