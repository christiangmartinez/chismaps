package io.xtian.chismaps.models;

public class Comment {
    private String location;
    private String body;

    public Comment(String location, String body) {
        this.location = location;
        this.body = body;
    }

    public Comment() {};

    public String getLocation() {
        return location;
    }

    public String getBody() {
        return body;
    }

}
