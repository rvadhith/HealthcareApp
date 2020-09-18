package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.DiagnosticsCentre;

@Repository
public interface DiagnosticsCentreRepo extends JpaRepository<DiagnosticsCentre, Long> {

}
