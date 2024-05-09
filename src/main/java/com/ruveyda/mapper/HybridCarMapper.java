package com.ruveyda.mapper;

import com.ruveyda.dto.CarCreateRequestDto;
import com.ruveyda.entity.HybridCar;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HybridCarMapper {
    HybridCarMapper INSTANCE = Mappers.getMapper(HybridCarMapper.class);

    List<HybridCar> fromCarCreateRequestToHybridCars(final List<CarCreateRequestDto> dtoList);
}
