package it.asystel.location.locationweb.services;

import it.asystel.location.locationweb.entities.Location;
import it.asystel.location.locationweb.repos.ILocatinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements ILocationService {

    @Autowired
    private ILocatinoRepository repository;

    @Override
    public Location saveLocation(Location location) {
        return null;
    }

    @Override
    public Location updateLocation(Location location) {
        return null;
    }

    @Override
    public void deleteLocation(Location location) {

    }

    @Override
    public Location getLocationById(int id) {
        return null;
    }

    @Override
    public List<Location> getAllLocations() {
        return null;
    }
}
