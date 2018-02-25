package movingwalls.rest.resources.asm;

import movingwalls.core.services.utils.PersonList;
import movingwalls.rest.mvc.AccountController;
import movingwalls.rest.resources.PersonListResource;
import movingwalls.rest.resources.PersonResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.List;

public class PersonListResourceAsm extends ResourceAssemblerSupport<PersonList, PersonListResource> {

    public PersonListResourceAsm() {
        super(AccountController.class, PersonListResource.class);
    }

    @Override
    public PersonListResource toResource(PersonList personList) {
        List<PersonResource> resList = new PersonResourceAsm().toResources(personList.getPersons());
        PersonListResource finalRes = new PersonListResource(resList);
        return finalRes;
    }
}