package io.xtian.chismaps.models;

public class Comment {
    private String longitude;
    private String latitude;
    private String body;

    public Comment(String longitude, String latitude, String body) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.body = body;
    }

    public Comment() {};

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }



    public String getBody() {
        return body;
    }

}
