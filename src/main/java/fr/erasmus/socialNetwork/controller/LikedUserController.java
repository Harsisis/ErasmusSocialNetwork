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

import fr.erasmus.socialNetwork.service.LikedUserService;
import fr.erasmus.socialNetwork.struct.LikedUserStruct;

@RestController
@RequestMapping(name = "/user")
public class LikedUserController {

	@Autowired
	private LikedUserService likedUserService;
	
    @PostMapping(name="/like")
    public ResponseEntity<Boolean> likeComment(@RequestBody LikedUserStruct LikedUserStruct){
        return ResponseEntity.status(HttpStatus.OK).body(likedUserService.like(LikedUserStruct));
    }
    
    @PostMapping(name="/unlike")
    public ResponseEntity<Boolean> unlikeComment(@RequestBody LikedUserStruct LikedUserStruct){
        return ResponseEntity.status(HttpStatus.OK).body(likedUserService.unlike(LikedUserStruct));
    }
    
    @GetMapping(name="/allLiked")
    public ResponseEntity<List<LikedUserStruct>> findAllLikedComment(@RequestHeader("userId") int userId){
        return ResponseEntity.status(HttpStatus.OK).body(likedUserService.likedByUser(userId));
    }
}
