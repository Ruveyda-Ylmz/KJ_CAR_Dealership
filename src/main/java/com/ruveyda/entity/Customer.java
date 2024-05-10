package com.ruveyda.entity;

import com.ruveyda.entity.superclasses.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_customer") //müşteri
@Entity
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String customerSurname;
    private String customerCitizenshipId; //müşteri vatandaşlık kimliği
    @Email
    private String customersEmail;
    private String customersPhoneNumber;
    @Builder.Default
    private Boolean isCustomerVerified = false; //MüşteriDoğrulandı
}
