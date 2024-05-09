package com.ruveyda.mapper;

import com.ruveyda.dto.OrderRequestDto;
import com.ruveyda.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order fromOrderRequestToOrder(final OrderRequestDto dto);
}
