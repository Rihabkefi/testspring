package tn.esprit.rihabkefi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.rihabkefi.Entity.Donation;

public interface DonationRepository extends JpaRepository<Donation,Long> {
}
