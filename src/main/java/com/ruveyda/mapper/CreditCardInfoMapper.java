package com.ruveyda.mapper;

import com.ruveyda.dto.OrderRequestDto;
import com.ruveyda.entity.CreditCardInfo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CreditCardInfoMapper {
    CreditCardInfoMapper INSTANCE = Mappers.getMapper(CreditCardInfoMapper.class);

    CreditCardInfo fromOrderRequestToCreditCardInfo(final OrderRequestDto dto);
}
