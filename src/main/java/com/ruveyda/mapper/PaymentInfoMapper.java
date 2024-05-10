package com.ruveyda.mapper;

import com.ruveyda.dto.OrderRequestDto;
import com.ruveyda.entity.PaymentInfo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaymentInfoMapper {

    PaymentInfoMapper INSTANCE = Mappers.getMapper(PaymentInfoMapper.class);
    PaymentInfo fromOrderRequestToPaymentInfo(final OrderRequestDto dto);
}
