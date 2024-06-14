package tn.esprit.rihabkefi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity

public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmployeId;
    private String Lastname;
    private String FirstName;
    private String position;
    @ManyToOne
    private Company company;

    @OneToMany(mappedBy = "DonId")
    private Set<Donation> donationSet;

}
