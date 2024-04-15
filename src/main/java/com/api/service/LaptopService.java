/**
 * 
 */
package com.api.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Laptop;
import com.api.repo.LaptopRepo;
import com.global.exception.entity.Person;

import jakarta.annotation.PostConstruct;


/**
 * 
 */
@Service
public class LaptopService {

	@Autowired
	private LaptopRepo laptopRepo;

	@PostConstruct
	public void addDataToDb() {
		@SuppressWarnings("unchecked")
		List<Laptop> person = (List<Laptop>) IntStream.rangeClosed(1, 1000).
					mapToObj(i-> new Laptop(null, "P"+i,"Q"+i, null, null));
		laptopRepo.saveAll(person);
	}
	
}
