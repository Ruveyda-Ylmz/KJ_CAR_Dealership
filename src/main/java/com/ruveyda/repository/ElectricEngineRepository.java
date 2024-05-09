package com.ruveyda.repository;

import com.ruveyda.entity.ElectricEngine;
import com.ruveyda.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricEngineRepository extends JpaRepository<ElectricEngine,Long> {
}
