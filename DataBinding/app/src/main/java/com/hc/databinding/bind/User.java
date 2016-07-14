package com.hc.databinding.bind;

/**
 * Created by liulei0905 on 2016/6/17.
 */

public class User {

    private String firstName;
    private String lastName;
    private int age;

    public User() {
    }

    public User(String first, String last, int age) {
        firstName = first;
        lastName = last;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
