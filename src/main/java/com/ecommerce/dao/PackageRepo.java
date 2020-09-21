package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Packages;

@Repository
public interface PackageRepo extends JpaRepository<Packages, Long> {

}
