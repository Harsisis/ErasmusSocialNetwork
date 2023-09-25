package fr.erasmus.socialNetwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.erasmus.socialNetwork.service.LikedCommentService;
import fr.erasmus.socialNetwork.struct.LikedCommentStruct;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired 
    private LikedCommentService likedCommentService;

    @PostMapping(name="/like")
    public ResponseEntity<Boolean> likeComment(@RequestBody LikedCommentStruct likedCommentStruct){
        return ResponseEntity.status(HttpStatus.OK).body(likedCommentService.like(likedCommentStruct));
    }
    
    @PostMapping(name="/unlike")
    public ResponseEntity<Boolean> unlikeComment(@RequestBody LikedCommentStruct likedCommentStruct){
        return ResponseEntity.status(HttpStatus.OK).body(likedCommentService.unlike(likedCommentStruct));
    }
    
    @GetMapping(name="/allLiked")
    public ResponseEntity<List<LikedCommentStruct>> findAllLikedComment(@RequestHeader("userId") int userId){
        return ResponseEntity.status(HttpStatus.OK).body(likedCommentService.likedByUser(userId));
    }
}
