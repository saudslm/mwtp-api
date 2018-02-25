package movingwalls.core.repositories.jpa;

import movingwalls.core.models.entities.Tour;
import movingwalls.core.repositories.TourRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class JpaTourRepo implements TourRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Tour find(int id) {
        return em.find(Tour.class, id);
    }

    @Override
    public List<Tour> findByEmployeeId(int employeeId) {
        Query query = em.createQuery("SELECT t FROM Tour t WHERE t.employeeId = :employeeId");
        query.setParameter("employeeId", employeeId);
        return query.getResultList();
    }

    @Override
    public List<Tour> findByManagerId(int managerId) {
        Query query = em.createQuery("SELECT t FROM Tour t WHERE t.managerId = :managerId");
        query.setParameter("managerId", managerId);
        return query.getResultList();
    }

    @Override
    public List<Tour> findByFinanceManagerId(int fManagerId) {
        Query query = em.createQuery("SELECT t FROM Tour t WHERE t.financeManagerId = :managerId");
        query.setParameter("managerId", fManagerId);
        return query.getResultList();
    }

    @Override
    public List<Tour> all() {
        Query query = em.createQuery("SELECT t FROM Tour t");
        return query.getResultList();
    }

    @Override
    public Tour create(Tour tour) {
        em.persist(tour);
        return tour;
    }

    @Override
    public Tour update(int id, Tour tour) {
        Tour t = em.find(Tour.class, id);
        t.setFinanceManagerId(tour.getFinanceManagerId());
        t.setStatus(tour.getStatus());
        em.merge(t);
        return t;
    }
}
