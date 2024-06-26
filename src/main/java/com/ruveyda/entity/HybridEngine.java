package com.ruveyda.entity;

import com.ruveyda.entity.superclasses.Engine;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_hybrid_engine")
@Entity
public class HybridEngine extends Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long internalCombustionEngineId;
    private Long electricEngineId;

}
