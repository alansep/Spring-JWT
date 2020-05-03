package com.alansep.JWT.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alansep.JWT.core.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}
