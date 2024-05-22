package JSONserializer;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
@JsonSerialize(using=customser.class)
public class JSONserlist {

    private String firstName;
    private String lastName;
    private List<String> skills;

    private device devices;

    public device getDevices() {
        return devices;
    }

    public void setDevices(device devices) {
        this.devices = devices;
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

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
