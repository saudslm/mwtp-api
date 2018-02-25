package movingwalls.core.repositories;

import movingwalls.core.models.entities.Tour;
import movingwalls.core.services.utils.TourList;

import java.util.List;

public interface TourRepo {
    public Tour find(int id);
    public List<Tour> findByEmployeeId(int employeeId);
    public List<Tour> findByManagerId(int managerId);
    public List<Tour> findByFinanceManagerId(int fManagerId);
    public List<Tour> all();
    public Tour create(Tour tour);
    public Tour update(int id, Tour tour);
}
