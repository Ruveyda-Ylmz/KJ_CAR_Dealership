package com.ruveyda.repository;

import com.ruveyda.entity.FuelCar;
import com.ruveyda.entity.InternalCombustionEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelCarRepository extends JpaRepository<FuelCar,Long> {
}
