//package com.ecommerce.model;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="packages")
//public class Packages {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String name;
//	private DiagnosticsCentre diagnosticcentre;
//	private List<Tests> test;
//	private LocalDate startDate;
//	private LocalDate validTillDate;
//	private int availableSeats;
//	private double cost;
//	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public DiagnosticsCentre getDiagnosticcentre() {
//		return diagnosticcentre;
//	}
//	public void setDiagnosticcentre(DiagnosticsCentre diagnosticcentre) {
//		this.diagnosticcentre = diagnosticcentre;
//	}
//	public List<Tests> getTest() {
//		return test;
//	}
//	public void setTest(List<Tests> test) {
//		this.test = test;
//	}
//	public LocalDate getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(LocalDate startDate) {
//		this.startDate = startDate;
//	}
//	public LocalDate getValidTillDate() {
//		return validTillDate;
//	}
//	public void setValidTillDate(LocalDate validTillDate) {
//		this.validTillDate = validTillDate;
//	}
//	public int getAvailableSeats() {
//		return availableSeats;
//	}
//	public void setAvailableSeats(int availableSeats) {
//		this.availableSeats = availableSeats;
//	}
//	public double getCost() {
//		return cost;
//	}
//	public void setCost(double cost) {
//		this.cost = cost;
//	}
//}
