package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Tests;

@Repository
public interface TestRepo extends JpaRepository<Tests, Long> {

}
