package com.rakib.armanvaiplayground.variable_injection;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isActive;
    private Integer age;

    public User(String firstName, String lastName, Integer age) {
        this.firstName = "Mr. " + firstName;
        this.lastName = " " + lastName;

        if (age > 0) {
            this.age = age;
        } else {
            throw new RuntimeException("Age cannot be negative");
        }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserDetailsInformation() {
        return "name: " + firstName + lastName + " \nEmail: " + email + "\nActive: " + isActive + "\nAge: " + age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                ", age=" + age +
                '}';
    }
}

