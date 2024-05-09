package com.ruveyda.service;

import com.ruveyda.entity.ElectricEngine;
import com.ruveyda.repository.ElectricEngineRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ElectricEngineService extends ServiceManager<ElectricEngine,Long> {
    private final ElectricEngineRepository electricEngineRepository;


    public ElectricEngineService(ElectricEngineRepository electricEngineRepository) {
        super(electricEngineRepository);
        this.electricEngineRepository = electricEngineRepository;

    }
}

