package com.ruveyda.entity;

import com.ruveyda.entity.superclasses.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tbl_credit_card_info")
public class CreditCardInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownersName;
    private String ownersSurname;
    @Column(unique = true)
    @Size(min = 16, max = 16)
    private String creditCardNo;
    private String creditCardExpirationDate;
    @Size(min = 3,max = 3)
    private String cvc;
}
