package com.ruveyda.entity;

import com.ruveyda.entity.superclasses.Car;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_fuel_car")
@Entity
public class FuelCar extends Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long internalCombustionEngineId;  //dahili Yanma Motoru Kimliği
    @Column(name = "fuel_capacity_L")
    private Double fuelCapacity;
    @Column(name = "fuel_consumption_L/km")
    private Double fuelConsumption; //Yakıt tüketimi

}
