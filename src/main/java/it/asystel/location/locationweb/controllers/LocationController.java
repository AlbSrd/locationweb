package it.asystel.location.locationweb.controllers;

import it.asystel.location.locationweb.entities.Location;
import it.asystel.location.locationweb.services.LocationService;
import it.asystel.location.locationweb.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LocationController {

    @Qualifier("locationServiceImpl")
    @Autowired
    LocationService service;
    @Autowired
    EmailUtil emailUtil;

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

        emailUtil.sendEmail("add", "subj", "body"); //non ho creato l'account gmail
        
        return "createLocation";
    }

    @RequestMapping("/v1/displayLocatinos")
    public String listAllLocations(ModelMap modelMap) {
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }
}
