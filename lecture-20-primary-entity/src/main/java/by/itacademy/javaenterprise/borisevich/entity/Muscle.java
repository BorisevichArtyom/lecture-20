package by.itacademy.javaenterprise.borisevich.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "Muscles", indexes = {
        @Index(name = "Muscle_name_UNIQUE", columnList = "muscle_name", unique = true)
})
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Muscle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "muscle_id", nullable = false)
    private Long id;

    @Column(name = "muscle_name", nullable = false, length = 45)
    private String muscleName;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "Muscles_x_Exercises_name",
            joinColumns = @JoinColumn(name = "muscle_id"),
            inverseJoinColumns = @JoinColumn(name = "name_exercises_id"))
    private Set<Exercise> exerciseSet = new HashSet<>();


    @Override
    public String toString() {
        return "Muscle{" +
                "id=" + id +
                ", muscleName='" + muscleName + '\'' +
                '}';
    }
}