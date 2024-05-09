package com.ruveyda.mapper;

import com.ruveyda.dto.OrderRequestDto;
import com.ruveyda.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address fromOrderRequestToAddress(final OrderRequestDto dto);
}
