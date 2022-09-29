package com.springcoding.springcoding.Entity;

import java.lang.invoke.LambdaMetafactory;

public class Customer {

    private Long Id;
    private String Name;
    private Long Age;
    private String Location;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getAge() {
        return Age;
    }

    public void setAge(Long age) {
        Age = age;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Location='" + Location + '\'' +
                '}';
    }
}
