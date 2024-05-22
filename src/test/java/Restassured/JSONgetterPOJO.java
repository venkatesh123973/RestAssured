package Restassured;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic = true)
//@JsonPropertyOrder({"id","email","firstName","lastName"})
public class JSONgetterPOJO {

    private int id;
    private String email;
    private String firstName;

    @JsonGetter(value="employeeId")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    private String lastName;

}
