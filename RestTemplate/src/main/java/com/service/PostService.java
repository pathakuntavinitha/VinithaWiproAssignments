package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dto.Post;

@Service
public class PostService {

    private final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private RestTemplate restTemplate;

    public Post getPostById(int id) {
        return restTemplate.getForObject(BASE_URL + "/" + id, Post.class);
    }

    public Post[] getAllPosts() {
        return restTemplate.getForObject(BASE_URL, Post[].class);
    }

    public Post createPost(Post post) {
        return restTemplate.postForObject(BASE_URL, post, Post.class);
    }

    public void updatePost(int id, Post post) {
        String url = BASE_URL + "/" + id;
        restTemplate.put(url, post);
    }

    public void deletePost(int id) {
        restTemplate.delete(BASE_URL + "/" + id);
    }
}
