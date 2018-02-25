package movingwalls.core.services.utils;

import movingwalls.core.models.entities.Tour;

import java.util.ArrayList;
import java.util.List;

public class TourList {
    private List<Tour> tours = new ArrayList<Tour>();

    public TourList(List<Tour> list) {
        this.tours = list;
    }

    public List<Tour> getTours() {
        return this.tours;
    }

    public void setTours(List<Tour> list) {
        this.tours = list;
    }
}
