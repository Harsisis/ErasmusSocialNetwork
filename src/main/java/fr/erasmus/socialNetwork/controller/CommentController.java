package fr.erasmus.socialNetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.erasmus.socialNetwork.service.CommentService;
import fr.erasmus.socialNetwork.struct.CommentDto;

@RestController
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

    @GetMapping(name="/like")
    public ResponseEntity<Boolean> likeComment(@RequestHeader("id") int id, @RequestHeader("userId") int userId){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.like(id, userId));
    }
}
