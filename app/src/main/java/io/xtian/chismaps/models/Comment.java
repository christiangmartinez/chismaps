package io.xtian.chismaps.models;

public class Comment {
    private String commentLongitude;
    private String commentLatitude;
    private String body;

    public Comment(String commentLongitude, String commentLatitude, String body) {
        this.commentLongitude = commentLongitude;
        this.commentLatitude = commentLatitude;
        this.body = body;
    }

    public Comment() {};

    public String getCommentLongitude() {
        return commentLongitude;
    }

    public String getCommentLatitude() {
        return commentLatitude;
    }



    public String getBody() {
        return body;
    }

}
