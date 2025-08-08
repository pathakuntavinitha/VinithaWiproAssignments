package com.controller;

import com.dto.Post;
import com.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public Post[] getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable int id) {
        return postService.getPostById(id);
    }

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @PutMapping("/posts/{id}")
    public String updatePost(@PathVariable int id, @RequestBody Post post) {
        postService.updatePost(id, post);
        return "Updated successfully!";
    }

    @DeleteMapping("/posts/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return "Deleted successfully!";
    }
}
