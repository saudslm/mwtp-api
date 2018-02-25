package movingwalls.core.services.impl;

import movingwalls.core.models.entities.Tour;
import movingwalls.core.repositories.TourRepo;
import movingwalls.core.services.TourService;
import movingwalls.core.services.utils.TourList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TourServiceImpl implements TourService {

    @Autowired
    TourRepo tourRepo;

    @Override
    public Tour find(int id) {
        return tourRepo.find(id);
    }

    @Override
    public TourList findByEmployeeId(int employeeId) {
        return new TourList( tourRepo.findByEmployeeId(employeeId) );
    }

    @Override
    public TourList findByManagerId(int managerId) {
        return new TourList( tourRepo.findByManagerId(managerId) );
    }

    @Override
    public TourList findByFinanceManagerId(int managerId) {
        return new TourList( tourRepo.findByFinanceManagerId(managerId) );
    }

    @Override
    public TourList all() {
        return new TourList( tourRepo.all() );
    }

    @Override
    public Tour create(Tour tour) {
        return tourRepo.create(tour);
    }

    @Override
    public Tour update(int id, Tour tour) {
        return tourRepo.update(id, tour);
    }
}
