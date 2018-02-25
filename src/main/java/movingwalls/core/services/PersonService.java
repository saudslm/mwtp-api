package movingwalls.core.services;

import movingwalls.core.models.entities.Person;
import movingwalls.core.services.utils.PersonList;

public interface PersonService {
    public Person login(String username, String password);
    public Person find(int id);
    public PersonList getAllManagers();
    public PersonList getAllFinanceManagers();
}
