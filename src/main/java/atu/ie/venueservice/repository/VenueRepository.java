package atu.ie.venueservice.repository;

import atu.ie.venueservice.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}