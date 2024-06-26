package com.ruveyda.entity;

import com.ruveyda.entity.superclasses.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_address")
@Entity
public class Address extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String street; //sokak
    
    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String apartmentNo;
    
    @Column(nullable = false)
    private String postalCode;
    
    @Column(nullable = false)
    private Long countryId; //ülke kimliği

    @Builder.Default
    private Boolean isAddressVerified = false;
    //Mail gönderilecek, address onaylanacak.
    // Onaylama yerine değişiklik yapılması durumunda değiştirilen address onaylı address olacak mapper lazım.
}
