package com.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JPA_LAPTOP")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long laptopId;
	
	private String modelNumber;
	
	private String brandName;
	
	private Double laptopPrice;
}
