package com.example.mamechishiki.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.mamechishiki.entity.Mamechishiki;

public interface MamechishikiRepository extends CrudRepository<Mamechishiki, Integer> {
	
}
