package fr.erasmus.socialNetwork.controller;

import org.springframework.stereotype.Controller;
import fr.erasmus.socialNetwork.service.PostService;

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
