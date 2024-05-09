package com.ruveyda.dto;

import com.ruveyda.entity.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarCreateRequestDto {
    private Long electricEngineId;
    private Long internalCombustionEngineId;
    private Double batteryCapacity;
    private Double energyConsumption;
    private Double singleEngineEnergyConsumption;
    private Double fuelCapacity;
    private Double fuelConsumption;
    private Double singleEngineFuelConsumption;
    private EBrand brand;
    private String model;
    private EColor color;
    private Integer year;
    private Double price;
    private EBodyType bodyType;
    private EDrivetrainType drivetrainType;
    private Double weight;
    private Double topSpeed;
    private ECarType carType;
}
