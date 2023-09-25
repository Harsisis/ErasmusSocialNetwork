package fr.erasmus.socialNetwork.struct;

import java.util.Date;
import java.util.Set;

import fr.erasmus.socialNetwork.entity.User;

public class PostDto {
	
	private int id;
	private UserDto user;
	private String content;
	private Date creationDate;
	private Set<User> usersLiked;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Set<User> getUsersLiked() {
		return usersLiked;
	}
	public void setUsersLiked(Set<User> usersLiked) {
		this.usersLiked = usersLiked;
	}
	public PostDto(int id, UserDto user, String content, Date creationDate, Set<User> usersLiked) {
		super();
		this.id = id;
		this.user = user;
		this.content = content;
		this.creationDate = creationDate;
		this.usersLiked = usersLiked;
	}
	
	

}
