package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

   // ArrayList<Post> posts = new ArrayList<Post>();
    public PostService() {


    }

    public List<Post> listAllPosts(){

        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

        //posts.add(new Post(listAllPosts().getLast().getId() + 1, text, new Date(),2));
    public void create(final String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
