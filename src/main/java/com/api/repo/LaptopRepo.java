package com.api.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, UUID> {

}
