package com.ruveyda.entity.superclasses;

import com.ruveyda.entity.enums.*;
import com.ruveyda.entity.enums.EBodyType;
import com.ruveyda.entity.enums.EBrand;
import com.ruveyda.entity.enums.EColor;
import com.ruveyda.entity.enums.EDrivetrainType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class Car extends BaseEntity {

//    private Long carId;
    @Enumerated(EnumType.STRING)
    private EBrand brand;
    private String model;
    @Enumerated(EnumType.STRING)
    private EColor color; //diger denilebilir (tanimlanmamislar icin)
    private Integer year;
    private Double price;
    @Builder.Default
    private Boolean isNew = true;
    @Enumerated(EnumType.STRING)
    private EBodyType bodyType;
    @Enumerated(EnumType.STRING)
    private EDrivetrainType drivetrainType;
    private Long mileage;
    @Column(name = "weight_kg")
    private Double weight;
    @Column(name = "top_speed_km/h")
    private Double topSpeed;
    private String carCode;
    @Builder.Default
    private Boolean isSold = false;
}
