package movingwalls.core.services.utils;

import movingwalls.core.models.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> persons = new ArrayList<Person>();

    public PersonList(List<Person> list) {
        this.persons = list;
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(List<Person> list) {
        this.persons = list;
    }
}
