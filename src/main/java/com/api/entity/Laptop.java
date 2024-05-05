package com.api.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JPA_LAPTOP")
public class Laptop extends AbstractEntity {

	@Id
	@GeneratedValue
	@Column(name = "LAPTOP_ID")
	private UUID laptopId;
	
	@Column(name = "MODEL_NUMBER",unique = true)
	private String modelNumber;
	
	@Column(name = "BRAND_NAME",updatable = false)
	private String brandName;
	
	@Column(name = "LAPTOP_PRICE")
	@Min(5000)
	private Double laptopPrice;
	
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID",insertable = false,updatable = false)
	private Student student;
}
