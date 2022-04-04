package it.asystel.location.locationweb.controllers;

import it.asystel.location.locationweb.entities.Location;
import it.asystel.location.locationweb.services.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

    @Autowired
    LocationServiceImpl service;

    @RequestMapping("/v1/showCreate")
    public String showCreate() {
        return "createLocation"; //ritorna la view jsp, ecco perchè ritorna String
    }

    @RequestMapping("/v1/saveLoc")
    //il ModelAttribute binda il parametro all'entità corrispondente SE metti il nome della classe minuscolo
    public String saveLocation(@ModelAttribute("location") Location loc, ModelMap modelMap) {
        Location locationSaved = service.saveLocation(loc);
        String msg = "Location saved with id: " + locationSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }
}
