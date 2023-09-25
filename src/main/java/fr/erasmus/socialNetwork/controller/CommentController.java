package fr.erasmus.socialNetwork.controller;

import java.util.List;

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

import fr.erasmus.socialNetwork.service.LikedCommentService;
import fr.erasmus.socialNetwork.struct.CommentDto;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired 
    private LikedCommentService commentService;

    @GetMapping(name="/like")
    public ResponseEntity<Boolean> likeComment(@RequestHeader("commentId") int commentId, @RequestHeader("userId") int userId){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.like(commentId, userId));
    }
    
    @GetMapping(name="/allLiked")
    public ResponseEntity<List<Integer>> findAllLikedComment(@RequestHeader("commentId") int commentId, @RequestHeader("userId") int userId){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.like(commentId, userId));
    }
    
    
}
