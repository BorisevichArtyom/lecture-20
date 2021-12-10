package by.itacademy.javaenterprise.borisevich.entity;

import by.itacademy.javaenterprise.borisevich.util.Convertation;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Table(name = "Diary_users", indexes = {
        @Index(name = "UNIQUE", columnList = "email", unique = true),
})
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SecondaryTable(name = "User_roles")
public class DiaryUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "balance_amount", nullable = false)
    private Long balanceAmount;

    @OneToMany(mappedBy = "user")
    private Set<Training> trainingSet;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_Name")
    private RoleType roleTypeName;

    public String getBalanceAmount() {
        return Convertation.convertToBYN(balanceAmount);
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = (long) (balanceAmount * 100);
    }

    @Override
    public String toString() {
        return "DiaryUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balanceAmount=" + balanceAmount +
                '}';
    }
}