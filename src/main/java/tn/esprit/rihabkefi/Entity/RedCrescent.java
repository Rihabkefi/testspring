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


public class RedCrescent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long RedCID ;
    private String area;
    @OneToMany(mappedBy = "DonId")
    private Set<Donation> donationSet;

}
