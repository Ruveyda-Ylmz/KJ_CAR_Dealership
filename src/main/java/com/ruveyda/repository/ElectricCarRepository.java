package com.ruveyda.repository;

import com.ruveyda.entity.ElectricCar;
import com.ruveyda.entity.FuelCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ElectricCarRepository extends JpaRepository<ElectricCar,Long> {
    Optional<ElectricCar> findByCarCode(String carCode);
}
