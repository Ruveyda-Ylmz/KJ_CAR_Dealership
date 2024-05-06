package com.ruveyda.entity;

import com.ruveyda.entity.enums.ECarType;
import com.ruveyda.entity.superclasses.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_order")
@Entity
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carCode;
    private ECarType carType;
    private Long customerId;

    //TODO DTO'da bunlar verilecek.
//    private String buyersName;
//    private String buyersSurname;
//    private String buyersIdNumber;
//    @Email
//    private String buyersEmail;
//    private String buyersPhoneNumber;
    private Double transactedAmount;
    @Builder.Default
    private Boolean isTransactionCompleted = false;

    private Long addressId;
    //TODO DTO'da bunlar verilecek.
//    @Column(nullable = false)
//    private String street;
//
//    @Column(nullable = false)
//    private String city;
//
//    @Column(nullable = false)
//    private String apartmentNo;
//
//    @Column(nullable = false)
//    private String postalCode;
//
//    @Column(nullable = false)
//    private String country;

}
