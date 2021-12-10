package by.itacademy.javaenterprise.borisevich.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Set;

@Table(name = "Trainings", indexes = {
        @Index(name = "user_name_idx", columnList = "user_id")
})
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Training implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "training_id")
    private Long id;

    @Column(name = "training_date")
    private Instant trainingDate;

    @Column(name = "start")
    private LocalTime start;

    @Column(name = "end")
    private LocalTime end;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private DiaryUser user;

    @OneToMany(mappedBy = "training")
    private Set<Approach> approachSet;

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", trainingDate=" + trainingDate +
                ", user=" + user +
                + '\'' +
                '}';
    }
}