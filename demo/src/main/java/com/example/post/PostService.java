package com.example.post;

import com.example.location.Location;
import com.example.user.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    User user1 = new User(
            "u1",
            "Jany",
            "Lawrence",
            new Location("l1", "Lagos"),
            "Jany@gmail.com");

    User user2 = new User(
            "u2",
            "Jadon",
            "Mills",
            new Location("l2", "Asaba"),
            "Jadon@gmail.com");

    Post post1 = new Post(
            "p1",
            "01-Jan-19",
            user1,
            "Its good to love and be loved");

    Post post2 = new Post(
            "p2",
            "02-Jan-19",
            user2,
            "We all need someone");

    List<Post> posts = Arrays.asList(post1, post2);

    public List<Post> getAllPosts() {
        return posts;
    }
}
