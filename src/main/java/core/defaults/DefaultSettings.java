package core.defaults;

import core.models.Settings;

public class DefaultSettings implements Settings {

    private String name;
    private String email;
    private Integer age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultSettings)) return false;

        DefaultSettings that = (DefaultSettings) o;

        if (!age.equals(that.age)) return false;
        if (!email.equals(that.email)) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DefaultSettings{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
