package fr.erasmus.socialNetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.erasmus.socialNetwork.service.LikedPostService;
import fr.erasmus.socialNetwork.struct.LikedPostStruct;

@Controller
@RequestMapping(name="/post")
public class LikedPostController {

	@Autowired
	private LikedPostService likedPostService;
	
	@PostMapping("/like")
	public ResponseEntity<Boolean> likePost(@RequestBody LikedPostStruct likedpost){
		return ResponseEntity.status(HttpStatus.OK).body(likedPostService.like(likedpost));
	}
	

}
