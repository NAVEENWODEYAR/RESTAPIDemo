package com.api.service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.entity.Laptop;
import com.api.repo.LaptopRepo;
import jakarta.annotation.PostConstruct;

/**
 * @author Naveen K Wodeyar
 */
@Service
public class LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;

    @PostConstruct
    public void addDataToDb() {
        List<Laptop> laptops = IntStream.rangeClosed(1, 1000)
                .mapToObj(i -> new Laptop(null, "P" + i, "Q" + i, null, null))
                .collect(Collectors.toList());
        laptopRepo.saveAll(laptops);
    }
}
