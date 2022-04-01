package it.asystel.location.locationweb.repos;

import it.asystel.location.locationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocatinoRepository extends JpaRepository<Location, Integer> {
}
