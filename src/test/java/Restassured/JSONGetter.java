package Restassured;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class JSONGetter {

  private Map<String, Object> emp;
    @JsonAnyGetter
    public Map<String, Object> getEmp() {
        return emp;
    }

    public void setEmp(Map<String, Object> emp) {
        this.emp = emp;
    }
}
