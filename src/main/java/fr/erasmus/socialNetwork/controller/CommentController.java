package fr.erasmus.socialNetwork.controller;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired private CommentService commentService;

    @GetMapping(name="/{id}")
    public ResponseEntity<CommentDto> getComment(@PathVariable("id") int id){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.find(id));
    }

    @PostMapping()
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.create(commentDto));
    }

    @PutMapping()
    public ResponseEntity<CommentDto> updateComment(@RequestBody CommentDto commentDto){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.update(commentDto));
    }

    @DeleteMapping(name="/{id}")
    public ResponseEntity<Boolean> deleteComment(@PathVariable("id") int id){
        commentService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

    @GetMapping(name="/like/{id}")
    public ResponseEntity<Boolean> likeComment(@PathVariable("id") int id){
        commentService.like(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
}
