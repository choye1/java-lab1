package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<Post>();
    public PostService() {

    posts.add(new Post("aaewfsd", new Date(), 12));
    posts.add(new Post("badsfe", new Date(),12113));
    posts.add(new Post("dsdafc", new Date(),14009493));

    }

    public List<Post> listAllPosts(){

        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date(),2));
    }
}
