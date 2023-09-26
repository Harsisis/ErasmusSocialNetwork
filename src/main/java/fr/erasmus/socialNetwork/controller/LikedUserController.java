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
@RequestMapping(value = "/user")
public class LikedUserController {

	@Autowired
	private LikedUserService likedUserService;

	@PostMapping(value = "/like")
	public ResponseEntity<LikedUserStruct> likeUser(@RequestBody LikedUserStruct LikedUserStruct) {
		return ResponseEntity.status(HttpStatus.OK).body(likedUserService.like(LikedUserStruct));
	}

	@PostMapping(value = "/unlike")
	public ResponseEntity<Boolean> unlikeUser(@RequestBody LikedUserStruct LikedUserStruct) {
		return ResponseEntity.status(HttpStatus.OK).body(likedUserService.unlike(LikedUserStruct));
	}

	@GetMapping(value = "/allLiked")
	public ResponseEntity<List<LikedUserStruct>> findAllLikedUserByUser(@RequestHeader("userId") int userId) {
		return ResponseEntity.status(HttpStatus.OK).body(likedUserService.likedByUser(userId));

	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<LikedUserStruct>> findAllLikedUser() {
		return ResponseEntity.status(HttpStatus.OK).body(likedUserService.findAll());
	}

}
