package fr.erasmus.socialNetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.erasmus.socialNetwork.service.PostService;
import fr.erasmus.socialNetwork.struct.PostDto;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(name="/{id}")
    public ResponseEntity<PostDto> getPost(@PathVariable("id") int id){
        return ResponseEntity.status(HttpStatus.OK).body(postService.find(id));
    }

    @PostMapping()
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        return ResponseEntity.status(HttpStatus.OK).body(postService.create(postDto));
    }

    @PutMapping()
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto){
        return ResponseEntity.status(HttpStatus.OK).body(postService.update(postDto));
    }

    @DeleteMapping(name="/{id}")
    public ResponseEntity<Boolean> deletePost(@PathVariable("id") int id){
        postService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

    @GetMapping(name="/like/{id}")
    public ResponseEntity<Boolean> likePost(@PathVariable("id") int id){
        postService.like(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
}
