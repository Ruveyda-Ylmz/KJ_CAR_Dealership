package com.ruveyda.mapper;

import com.ruveyda.dto.request.OrderRequestDto;
import com.ruveyda.entity.Address;
import com.ruveyda.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer fromOrderRequestToCustomer(final OrderRequestDto dto);
}
