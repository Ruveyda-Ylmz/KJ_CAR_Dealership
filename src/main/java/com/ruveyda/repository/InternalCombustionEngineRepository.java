package com.ruveyda.repository;

import com.ruveyda.entity.ElectricEngine;
import com.ruveyda.entity.InternalCombustionEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalCombustionEngineRepository extends JpaRepository<InternalCombustionEngine,Long> {
}
