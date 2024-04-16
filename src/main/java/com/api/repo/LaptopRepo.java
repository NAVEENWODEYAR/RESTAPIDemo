package com.api.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entity.Laptop;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, UUID> {

}
