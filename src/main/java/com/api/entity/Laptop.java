package com.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import lombok.*;

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
	
	@Column(name = "MODEL_NUMBER",unique = true)
	private String modelNumber;
	
	@Column(name = "BRAND_NAME",updatable = false)
	private String brandName;
	
	@Column(name = "LAPTOP_PRICE")
	private Double laptopPrice;
	
	@OneToOne
	private Student student;
}
