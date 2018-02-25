package movingwalls.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

public class PersonListResource extends ResourceSupport {
    private List<PersonResource> persons = new ArrayList<PersonResource>();

    public PersonListResource(List<PersonResource> list) {
        this.persons = list;
    }

    public List<PersonResource> getPersons() {
        return this.persons;
    }

    public void setPersons(List<PersonResource> list) {
        this.persons = list;
    }
}