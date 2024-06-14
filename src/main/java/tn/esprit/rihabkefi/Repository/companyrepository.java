package tn.esprit.rihabkefi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.rihabkefi.Entity.Company;

public interface companyrepository extends JpaRepository<Company,Long> {


}
