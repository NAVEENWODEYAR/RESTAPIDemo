///**
// * 
// */
//package com.api.entity;
//
//import java.time.LocalDate;
//import java.util.*;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.*;
//import lombok.*;
//
///**
// * @author Naveen K Wodeyar
// */
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "JPA_STUDENT")
//@JsonIgnoreProperties
//public class Student {
//	
//	@Id
//	@GeneratedValue
//	@Column(name = "STUDENT_ID")
//	private UUID studentId;
//	
//	@Column(name = "STUDENT_NAME")
//	private String studentName;
//	
//	@Column(name = "STUDENT_INFO")
//	private String studentInfo;
//	
//	@Column(name = "DOB")
//	private LocalDate dob;
//	
//	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
//	private List<Laptop> laptop;
//	
//}