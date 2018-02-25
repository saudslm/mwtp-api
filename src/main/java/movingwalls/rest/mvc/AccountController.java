package movingwalls.rest.mvc;

import movingwalls.core.models.entities.Person;
import movingwalls.core.services.PersonService;
import movingwalls.core.services.utils.PersonList;
import movingwalls.rest.resources.PersonListResource;
import movingwalls.rest.resources.PersonResource;
import movingwalls.rest.resources.asm.PersonListResourceAsm;
import movingwalls.rest.resources.asm.PersonResourceAsm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@CrossOrigin(origins = {"http://localhost:4200", "https://mwtp.herokuapp.com"},
        maxAge = 6000, allowCredentials = "false")
@Controller
@RequestMapping("/api")
public class AccountController {

    private PersonService personService;

    @Autowired
    public AccountController(PersonService ps)
    {
        this.personService = ps;
    }

    @RequestMapping(value = "/account/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResource> login(@RequestBody Map<String, Object> credentials)
    {
        Person p = this.personService.login(credentials.get("username").toString(), credentials.get("password").toString());
        if(p != null) {
            PersonResource pr = new PersonResourceAsm().toResource(p);
            return new ResponseEntity<PersonResource>(pr, HttpStatus.OK);
        } else {
            return new ResponseEntity<PersonResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/managers", method = RequestMethod.GET)
    public ResponseEntity<PersonListResource> allManagers()
    {
        PersonList personList = this.personService.getAllManagers();
        if( personList != null ) {
            PersonListResource plr = new PersonListResourceAsm().toResource(personList);
            return new ResponseEntity<PersonListResource>(plr, HttpStatus.OK);
        } else {
            return new ResponseEntity<PersonListResource>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/financeManagers", method = RequestMethod.GET)
    public ResponseEntity<PersonListResource> allFinanceManagers()
    {
        PersonList personList = this.personService.getAllFinanceManagers();
        if( personList != null ) {
            PersonListResource plr = new PersonListResourceAsm().toResource(personList);
            return new ResponseEntity<PersonListResource>(plr, HttpStatus.OK);
        } else {
            return new ResponseEntity<PersonListResource>(HttpStatus.NOT_FOUND);
        }

    }
}
