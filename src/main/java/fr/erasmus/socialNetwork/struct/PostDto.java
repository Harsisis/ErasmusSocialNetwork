package fr.erasmus.socialNetwork.struct;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class PostDto {
	
	private int id;
	private UserDto user;
	private String content;
	private Date creation_date;
	private Set<User> usersLiked;

}
