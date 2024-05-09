package com.ruveyda.dto;

import com.ruveyda.entity.enums.ECarType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDto {
    //Car info
    private String carCode;
    private ECarType carType;

    //Customer info
    private String customerName;
    private String customerSurname;
    private String customersIdNumber;
    @Email
    private String customersEmail;
    private String customersPhoneNumber;

    //Payment info
    private String creditCardNo;
    private String CreditCarExpirationDate;
    @Size(min = 3,max = 3)
    private String cvc;
    private Double transactedAmount;

    //Address info
    private String street;
    private String city;
    private String apartmentNo;
    private String postalCode;
    private String country;
}
