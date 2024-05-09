package com.ruveyda.service;

import com.ruveyda.dto.request.OrderRequestDto;
import com.ruveyda.entity.*;
import com.ruveyda.entity.ElectricEngine;
import com.ruveyda.mapper.AddressMapper;
import com.ruveyda.mapper.CustomerMapper;
import com.ruveyda.mapper.OrderMapper;
import com.ruveyda.repository.ElectricEngineRepository;
import com.ruveyda.repository.OrderRepository;
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

