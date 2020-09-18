package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="endpoint")
public class Endpoints {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name="DiagnosticsCentre",joinColumns = { @JoinColumn(name="id")} )
    
	private DiagnosticsCentre diagnosticcentre;
	
	private String name;
	
	@ManyToOne
    @JoinColumn(name="tests_id")
	private Tests tests;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DiagnosticsCentre getDiagnosticcentre() {
		return diagnosticcentre;
	}
	public void setDiagnosticcentre(DiagnosticsCentre diagnosticcentre) {
		this.diagnosticcentre = diagnosticcentre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
