package movingwalls.core.repositories;

import movingwalls.core.models.entities.Person;

import java.util.List;

public interface PersonRepo {
    public Person login(String username, String password);
    public Person find(int id);
    public List<Person> getAllManagers();
    public List<Person> getAllFinanceManagers();
}
