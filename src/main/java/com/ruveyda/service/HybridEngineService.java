package com.ruveyda.service;

import com.ruveyda.entity.HybridEngine;
import com.ruveyda.repository.HybridEngineRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HybridEngineService extends ServiceManager<HybridEngine,Long> {
    private final HybridEngineRepository hybridEngineRepository;

    public HybridEngineService(HybridEngineRepository hybridEngineRepository) {
        super(hybridEngineRepository);
        this.hybridEngineRepository = hybridEngineRepository;

    }
}
