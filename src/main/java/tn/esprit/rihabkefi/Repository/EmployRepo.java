package tn.esprit.rihabkefi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.rihabkefi.Entity.Employe;

public interface EmployRepo extends JpaRepository<Employe,Long> {
    public Employe findByFirstName(String FirstName);
}
