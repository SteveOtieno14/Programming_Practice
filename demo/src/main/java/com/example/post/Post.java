package com.example.post;

import com.example.user.User;

public class Post {
    private String id;
    private String postDate;
    private User user;
    private String details;

    public Post() {

    }

    public Post(String id, String postdate, User user, String details) {
        this.id=id;
        this.postDate=postdate;//this.setLocation(location.getName());
        this.user=user;
        this.details=details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
