package io.xtian.chismaps.models;

public class User {
    private String email;
    private String username;
    private String location;
    private String bio;

    public User(String email, String username, String location, String bio){
        this.email = email;
        this.username = username;
        this.location = location;
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getLocation() {
        return location;
    }

    public String getBio() {
        return bio;
    }
}
