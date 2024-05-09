package com.ruveyda.service;

import com.ruveyda.dto.CarCreateRequestDto;
import com.ruveyda.entity.HybridCar;
import com.ruveyda.mapper.HybridCarMapper;
import com.ruveyda.repository.HybridCarRepository;
import com.ruveyda.utility.CarCodeGenerator;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HybridCarService extends ServiceManager<HybridCar,Long> {
    private final HybridCarRepository hybridCarRepository;

    public HybridCarService(HybridCarRepository hybridCarRepository) {
        super(hybridCarRepository);
        this.hybridCarRepository = hybridCarRepository;
    }

    public List<HybridCar> createHybridCars(List<CarCreateRequestDto> dtoList) {
        List<HybridCar> hybridCarList = HybridCarMapper.INSTANCE.fromCarCreateRequestToHybridCars(dtoList);
        String batchNumber = CarCodeGenerator.generateBatchNumber();
        hybridCarList.forEach(car -> car.setCarCode(CarCodeGenerator.generateCarCode(batchNumber,car)));
        return (List<HybridCar>) saveAll(hybridCarList);
    }
}
