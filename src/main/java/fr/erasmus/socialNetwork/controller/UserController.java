package fr.erasmus.socialNetwork.controller;

import java.util.List;

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

import fr.erasmus.socialNetwork.service.UserService;
import fr.erasmus.socialNetwork.struct.UserDto;

@Controller
@RequestMapping(name="/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/find/{id}")
	public ResponseEntity<UserDto> getUser(@PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus.OK).body(userService.find(id));
	}
	
	@GetMapping("/find/all")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
	}
	
	@PostMapping("/create")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		return ResponseEntity.status(HttpStatus.OK).body(userService.create(userDto));
	}
	
	@PutMapping("/update")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto){
		return ResponseEntity.status(HttpStatus.OK).body(userService.update(userDto));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("id") int id){
		userService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).body(true);
	}
}
