package com.ruveyda.mapper;

import com.ruveyda.dto.CarCreateRequestDto;
import com.ruveyda.entity.FuelCar;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FuelCarMapper {
    FuelCarMapper INSTANCE = Mappers.getMapper(FuelCarMapper.class);


    List<FuelCar> fromCarCreateRequestToFuelCars(final List<CarCreateRequestDto> dtoList);
}
