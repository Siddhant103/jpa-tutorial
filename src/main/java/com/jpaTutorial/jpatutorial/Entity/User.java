package com.jpaTutorial.jpatutorial.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Store this User in a table. For this we need to make this an entity. An entity is something
 * that can be persisted to a database
 * Table Name = User
 */
@Entity
public class User {

    @Id//To define it as a primary key
    @GeneratedValue//To define is as auto-generate
    private long id;

    private String name;

    private String role;

    protected User(){}

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
