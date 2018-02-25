package movingwalls.core.services;

import movingwalls.core.models.entities.Tour;
import movingwalls.core.services.utils.TourList;

public interface TourService {
    public Tour find(int id);
    public TourList findByEmployeeId(int employeeId);
    public TourList findByManagerId(int managerId);
    public TourList findByFinanceManagerId(int managerId);
    public TourList all();
    public Tour create(Tour tour);
    public Tour update(int id, Tour tour);
}
