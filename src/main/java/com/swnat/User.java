package com.swnat;

public class User {
    private UserRole userRole;

    public User(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserRole getUserRole(){
        return userRole;
    }
}
