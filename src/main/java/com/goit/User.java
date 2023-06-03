package com.goit;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Setter
    @Getter
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
