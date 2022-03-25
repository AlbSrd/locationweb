package it.asystel.location.locationweb.repos;

import it.asystel.location.locationweb.entities.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocatinoRepository extends CrudRepository<Location, Integer> {
}