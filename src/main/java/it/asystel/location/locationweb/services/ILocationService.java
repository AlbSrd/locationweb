package it.asystel.location.locationweb.services;

import it.asystel.location.locationweb.entities.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILocationService {
    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Location getLocationById(int id);

    List<Location> getAllLocations();
}
