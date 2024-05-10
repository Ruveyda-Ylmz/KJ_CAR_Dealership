package com.ruveyda.entity;

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
@Table(name = "tbl_country") //ülke
@Entity
public class Country extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String name;
    
    @Column(nullable = false)
    private String isoCode;
    
    @Column(nullable = false)
    private String capital; //başkent
    
    @Column(nullable = false)
    private String continent; //kıta
    
    @Column(nullable = false)
    private String region; //bölge
    

    

}
