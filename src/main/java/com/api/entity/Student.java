/**
 * 
 */
package com.api.entity;

import java.util.UUID;

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
	@GeneratedValue
	private UUID studentId;
	
	private String studentName;
	
	private String studentInfo;
	
	@OneToOne(mappedBy = "student")
	private Laptop laptop;
	

}
