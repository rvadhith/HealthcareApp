package com.ecommerce.dto;

import java.time.LocalDate;
import java.util.List;

public class TestDTO {
	private Long id;
	private String name;
	private LocalDate startDate;
	private LocalDate validTillDate;
	private int availableSeats;
	private double cost;
	private Long diagnosticcentre_id;
	private List<Long> endpoints_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getValidTillDate() {
		return validTillDate;
	}
	public void setValidTillDate(LocalDate validTillDate) {
		this.validTillDate = validTillDate;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Long getDiagnosticcentre_id() {
		return diagnosticcentre_id;
	}
	public void setDiagnosticcentre_id(Long diagnosticcentre_id) {
		this.diagnosticcentre_id = diagnosticcentre_id;
	}
	public List<Long> getEndpoints_id() {
		return endpoints_id;
	}
	public void setEndpoints_id(List<Long> endpoints_id) {
		this.endpoints_id = endpoints_id;
	}
}
