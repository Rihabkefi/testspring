package tn.esprit.rihabkefi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity

public class Donation  implements Serializable {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long DonId ;
        private float amount;
        private LocalDate date;
    @Enumerated(EnumType.STRING)
        private  Donationtype Donationtype;

    @ManyToOne
    private Employe employe;

    @ManyToOne
    private RedCrescent RedCrescentSet;
    }


