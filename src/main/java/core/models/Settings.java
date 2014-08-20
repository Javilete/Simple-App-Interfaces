package core.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface Settings {

    @JsonProperty(value = "name", required = true)
    public String getName();

    public void setName(String name);

    @JsonProperty(value = "email", required = true)
    public String getEmail();

    public void setEmail(String email);

    @JsonProperty(value = "age", required = true)
    public Integer getAge();

    public void setAge(Integer age);
}
