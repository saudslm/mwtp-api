package movingwalls.rest.resources.asm;

import movingwalls.core.models.entities.Person;
import movingwalls.rest.mvc.AccountController;
import movingwalls.rest.resources.PersonResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public class PersonResourceAsm extends ResourceAssemblerSupport<Person, PersonResource> {

    public PersonResourceAsm()
    {
        super(AccountController.class, PersonResource.class);
    }

    @Override
    public PersonResource toResource(Person person)
    {

        PersonResource pr = new PersonResource();
        pr.setFirstName(person.getFirstName());
        pr.setLastName(person.getLastName());
        pr.setPersonId(person.getId());
        pr.setUsername(person.getUsername());
        pr.setRole(person.getRole());

        return pr;
    }
}
