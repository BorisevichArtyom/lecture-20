package by.itacademy.javaenterprise.borisevich.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;

@Table(name = "Approaches", indexes = {
        @Index(name = "Training_id_fk_idx", columnList = "training_id"),
        @Index(name = "Muscle_id_fk_idx", columnList = "name_exercises_id")
})
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Approach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "approach_id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "training_id", nullable = false)
    private Training training;

    @ManyToOne(optional = false)
    @JoinColumn(name = "name_exercises_id", nullable = false)
    private Exercise nameExercise;

    @Column(name = "approach_counter")
    private Integer approachCounter;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "repeats")
    private Integer repeats;

}