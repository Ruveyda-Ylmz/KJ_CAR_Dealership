package com.ruveyda.service;

import com.ruveyda.entity.ElectricCar;
import com.ruveyda.entity.FuelCar;
import com.ruveyda.repository.ElectricCarRepository;
import com.ruveyda.repository.FuelCarRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ElectricCarService extends ServiceManager<ElectricCar,Long> {
    private final ElectricCarRepository electricCarRepository;


    public ElectricCarService(ElectricCarRepository electricCarRepository) {
        super(electricCarRepository);
        this.electricCarRepository = electricCarRepository;

    }
}

