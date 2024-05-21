package com.Final;

// Factory Method Pattern for creating different types of users
abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
