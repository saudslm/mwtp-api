package movingwalls.rest.resources;

import movingwalls.core.models.entities.Tour;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

public class TourListResource extends ResourceSupport {
    private List<TourResource> tours = new ArrayList<TourResource>();

    public TourListResource(List<TourResource> list) {
        this.tours = list;
    }

    public List<TourResource> getTours() {
        return this.tours;
    }

    public void setTours(List<TourResource> list) {
        this.tours = list;
    }
}