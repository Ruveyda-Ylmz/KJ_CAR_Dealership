package com.ruveyda.repository;

import com.ruveyda.entity.HybridEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridEngineRepository extends JpaRepository<HybridEngine,Long> {
}
