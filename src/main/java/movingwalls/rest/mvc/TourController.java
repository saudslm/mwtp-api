package movingwalls.rest.mvc;

import movingwalls.core.services.TourService;
import movingwalls.core.services.utils.TourList;
import movingwalls.rest.resources.TourListResource;
import movingwalls.rest.resources.TourResource;
import movingwalls.rest.resources.asm.TourListResourceAsm;
import movingwalls.rest.resources.asm.TourResourceAsm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import movingwalls.core.models.entities.Tour;

@CrossOrigin(origins = {"http://localhost:4200", "https://mwtp.herokuapp.com"},
        maxAge = 6000, allowCredentials = "false")
@Controller
@RequestMapping("/api/tour")
public class TourController {

    private TourService tourService;

    @Autowired
    public TourController(TourService service)
    {
        this.tourService = service;
    }

    @RequestMapping(value = "/employee/{employeeId}/all", method = RequestMethod.GET)
    public ResponseEntity<TourListResource> getAllTours(@PathVariable int employeeId) {
        TourList tourList = null;
        tourList = this.tourService.findByEmployeeId(employeeId);
        if(tourList != null) {
            TourListResource tourListResource = new TourListResourceAsm().toResource(tourList);
            return new ResponseEntity<TourListResource>(tourListResource, HttpStatus.OK);
        } else {
            return new ResponseEntity<TourListResource>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/manager/{managerId}/all", method = RequestMethod.GET)
    public ResponseEntity<TourListResource> getAllToursByManagerId(@PathVariable int managerId) {
        TourList tourList = null;
        tourList = this.tourService.findByManagerId(managerId);
        if(tourList != null) {
            TourListResource tourListResource = new TourListResourceAsm().toResource(tourList);
            return new ResponseEntity<TourListResource>(tourListResource, HttpStatus.OK);
        } else {
            return new ResponseEntity<TourListResource>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/fmanager/{managerId}/all", method = RequestMethod.GET)
    public ResponseEntity<TourListResource> getAllToursByFinanceManagerId(@PathVariable int managerId) {
        TourList tourList = null;
        tourList = this.tourService.findByFinanceManagerId(managerId);
        if(tourList != null) {
            TourListResource tourListResource = new TourListResourceAsm().toResource(tourList);
            return new ResponseEntity<TourListResource>(tourListResource, HttpStatus.OK);
        } else {
            return new ResponseEntity<TourListResource>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/{tourId}", method = RequestMethod.GET)
    public ResponseEntity<TourResource> getTour(@PathVariable int tourId) {
        Tour tour = tourService.find(tourId);
        if(tour != null) {
            TourResource tourResource = new TourResourceAsm().toResource(tour);
            return new ResponseEntity<TourResource>(tourResource, HttpStatus.OK);
        } else {
            return new ResponseEntity<TourResource>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<TourResource> createTour(@RequestBody TourResource sentTourResource) {
        Tour tour = this.tourService.create(sentTourResource.toTour());
        //this.tourService.create(tour);
        TourResource tourResource = new TourResourceAsm().toResource(tour);

        return new ResponseEntity<TourResource>(tourResource, HttpStatus.OK);
    }

    @RequestMapping(value = "/{tourId}/update", method = RequestMethod.POST)
    public ResponseEntity<TourResource> updateTour(@PathVariable int tourId, @RequestBody TourResource sentTourResource) {
        Tour tour = this.tourService.update(tourId, sentTourResource.toTour());
        TourResource tourResource = new TourResourceAsm().toResource(tour);
        return new ResponseEntity<TourResource>(tourResource, HttpStatus.OK);
    }
}
