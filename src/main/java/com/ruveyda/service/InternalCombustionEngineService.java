package com.ruveyda.service;

import com.ruveyda.entity.ElectricEngine;
import com.ruveyda.entity.InternalCombustionEngine;
import com.ruveyda.repository.ElectricEngineRepository;
import com.ruveyda.repository.InternalCombustionEngineRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class InternalCombustionEngineService extends ServiceManager<InternalCombustionEngine,Long> {
    private final InternalCombustionEngineRepository internalCombustionEngineRepository;


    public InternalCombustionEngineService(InternalCombustionEngineRepository internalCombustionEngineRepository) {
        super(internalCombustionEngineRepository);
        this.internalCombustionEngineRepository = internalCombustionEngineRepository;

    }
}

