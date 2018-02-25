package movingwalls.core.repositories.jpa;

import movingwalls.core.models.entities.Person;
import movingwalls.core.repositories.PersonRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class JpaPersonRepo implements PersonRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Person login(String username, String password) {
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p WHERE p.username = :username", Person.class);
        Person p = query.setParameter("username", username).getSingleResult();

        if( p.getPassword().equals(password) )
            return p;
        else
            return null;
    }

    @Override
    public Person find(int id) {
        Person p = em.find(Person.class, id);
        return p;
    }

    @Override
    public List<Person> getAllManagers() {
        Query query = em.createQuery("SELECT p FROM Person p WHERE p.role = 'manager'");
        return query.getResultList();
    }

    @Override
    public List<Person> getAllFinanceManagers() {
        Query query = em.createQuery("SELECT p FROM Person p WHERE p.role = 'finance_manager'");
        return query.getResultList();
    }
}
