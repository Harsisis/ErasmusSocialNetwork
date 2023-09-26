package fr.erasmus.socialNetwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.erasmus.socialNetwork.service.LikedPostService;
import fr.erasmus.socialNetwork.struct.LikedPostStruct;

@RestController
@RequestMapping(value = "/post")
public class LikedPostController {

	@Autowired
	private LikedPostService likedPostService;

	@PostMapping(value = "/like")
	public ResponseEntity<LikedPostStruct> likePost(@RequestBody LikedPostStruct likedPostStruct) {
		return ResponseEntity.status(HttpStatus.OK).body(likedPostService.like(likedPostStruct));
	}

	@DeleteMapping(value = "/unlike")
	public ResponseEntity<Boolean> unlikePost(@RequestHeader int likedPostId) {
		return ResponseEntity.status(HttpStatus.OK).body(likedPostService.unlike(likedPostId));
	}

	@GetMapping(value = "/allLiked")
	public ResponseEntity<List<LikedPostStruct>> findAllLikedPostByUser(@RequestHeader("userId") int userId) {
		return ResponseEntity.status(HttpStatus.OK).body(likedPostService.likedByUser(userId));
	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<LikedPostStruct>> findAllLikedPost() {
		return ResponseEntity.status(HttpStatus.OK).body(likedPostService.findAll());
	}

}
