package it.asystel.location.locationweb.services;

import it.asystel.location.locationweb.entities.Location;
import it.asystel.location.locationweb.repos.LocatinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocatinoRepository repository;

    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {
        return repository.findById(id).get(); //ritorna un optional senza fare un check se presente
    }

    @Override
    public List<Location> getAllLocations() {
        return repository.findAll();
    }
}
