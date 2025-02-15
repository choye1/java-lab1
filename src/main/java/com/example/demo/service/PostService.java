package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){

        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("aaewfsd",12));
        posts.add(new Post("badsfe",13));
        posts.add(new Post("dsdafc",14009493));
        return posts;
    }
}
