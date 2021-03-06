package movingwalls.rest.resources;

import org.springframework.hateoas.ResourceSupport;

public class PersonResource extends ResourceSupport {
    private int id;
    private String firstName;
    private String lastName;
    private String username;

    private String role;

    public int getPersonId() {
        return id;
    }

    public void setPersonId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
