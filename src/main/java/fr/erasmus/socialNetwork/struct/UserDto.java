package fr.erasmus.socialNetwork.struct;

import java.util.Date;
import java.util.Set;

import fr.erasmus.socialNetwork.enums.Gender;

public class UserDto {

	private int id;
	private String name;
	private String familyName;
	private String email;
	private Gender gender;
	private Date birthdate;
    private Set<CommentDto> comments;
	private Set<CommentDto> likedComments;
	private Set<PostDto> likedPosts;
	private Set<UserDto> likedUsers;
	private Set<UserDto> likes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Set<CommentDto> getComments() {
		return comments;
	}
	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}
	public Set<CommentDto> getLikedComments() {
		return likedComments;
	}
	public void setLikedComments(Set<CommentDto> likedComments) {
		this.likedComments = likedComments;
	}
	public Set<PostDto> getLikedPosts() {
		return likedPosts;
	}
	public void setLikedPosts(Set<PostDto> likedPosts) {
		this.likedPosts = likedPosts;
	}
	public Set<UserDto> getLikedUsers() {
		return likedUsers;
	}
	public void setLikedUsers(Set<UserDto> likedUsers) {
		this.likedUsers = likedUsers;
	}
	public Set<UserDto> getLikes() {
		return likes;
	}
	public void setLikes(Set<UserDto> likes) {
		this.likes = likes;
	}
	public UserDto(int id, String name, String familyName, String email, Gender gender, Date birthdate,
			Set<CommentDto> comments, Set<CommentDto> likedComments, Set<PostDto> likedPosts, Set<UserDto> likedUsers,
			Set<UserDto> likes) {
		super();
		this.id = id;
		this.name = name;
		this.familyName = familyName;
		this.email = email;
		this.gender = gender;
		this.birthdate = birthdate;
		this.comments = comments;
		this.likedComments = likedComments;
		this.likedPosts = likedPosts;
		this.likedUsers = likedUsers;
		this.likes = likes;
	}
	
	
}
