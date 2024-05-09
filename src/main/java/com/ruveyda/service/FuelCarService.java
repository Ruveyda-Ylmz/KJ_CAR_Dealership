package com.ruveyda.service;

import com.ruveyda.dto.CarCreateRequestDto;
import com.ruveyda.entity.ElectricEngine;
import com.ruveyda.entity.FuelCar;
import com.ruveyda.mapper.FuelCarMapper;
import com.ruveyda.repository.ElectricEngineRepository;
import com.ruveyda.repository.FuelCarRepository;
import com.ruveyda.utility.CarCodeGenerator;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelCarService extends ServiceManager<FuelCar,Long> {
    private final FuelCarRepository fuelCarRepository;

    public FuelCarService(FuelCarRepository fuelCarRepository) {
        super(fuelCarRepository);
        this.fuelCarRepository = fuelCarRepository;

    }

    public List<FuelCar> createFuelCars(List<CarCreateRequestDto> dtoList) {
        List<FuelCar> fuelCarList = FuelCarMapper.INSTANCE.fromCarCreateRequestToFuelCars(dtoList);
        String batchNumber = CarCodeGenerator.generateBatchNumber();
        fuelCarList.forEach(car -> car.setCarCode(CarCodeGenerator.generateCarCode(batchNumber,car)));
        return (List<FuelCar>) saveAll(fuelCarList);
    }
}

