package com.ruveyda.repository;

import com.ruveyda.entity.FuelCar;
import com.ruveyda.entity.InternalCombustionEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuelCarRepository extends JpaRepository<FuelCar,Long> {
    Optional<FuelCar> findByCarCode(String carCode);
}
