package movingwalls.core.services.impl;

import movingwalls.core.models.entities.Person;
import movingwalls.core.repositories.PersonRepo;
import movingwalls.core.services.PersonService;
import movingwalls.core.services.utils.PersonList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepo personRepo;

    @Override
    public Person login(String username, String password) {
        return personRepo.login(username, password);
    }

    @Override
    public Person find(int id) {
        return personRepo.find(id);
    }

    @Override
    public PersonList getAllManagers() {
        return new PersonList( personRepo.getAllManagers());
    }

    @Override
    public PersonList getAllFinanceManagers() {
        return new PersonList( personRepo.getAllFinanceManagers());
    }
}
