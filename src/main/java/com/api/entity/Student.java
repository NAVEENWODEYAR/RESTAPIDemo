/**
 * 
 */
package com.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen K Wodeyar
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JPA_STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long studentId;
	
	private String studentName;
	
	private String studentInfo;
	
	@OneToOne
	private Laptop laptop;
	

}
