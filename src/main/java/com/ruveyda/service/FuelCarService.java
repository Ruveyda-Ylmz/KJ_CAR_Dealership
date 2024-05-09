package com.ruveyda.service;

import com.ruveyda.entity.ElectricEngine;
import com.ruveyda.entity.FuelCar;
import com.ruveyda.repository.ElectricEngineRepository;
import com.ruveyda.repository.FuelCarRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class FuelCarService extends ServiceManager<FuelCar,Long> {
    private final FuelCarRepository fuelCarRepository;


    public FuelCarService(FuelCarRepository fuelCarRepository) {
        super(fuelCarRepository);
        this.fuelCarRepository = fuelCarRepository;

    }
}

