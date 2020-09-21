package com.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.DiagnosticsCentre;
import com.ecommerce.model.Endpoints;

@Repository
public interface EndpointRepo extends JpaRepository<Endpoints, Long> {
}
