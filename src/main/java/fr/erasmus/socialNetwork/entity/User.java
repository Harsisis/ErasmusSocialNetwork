package fr.erasmus.socialNetwork.entity;

import java.util.Date;
import java.util.Set;

import fr.erasmus.socialNetwork.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="email")
	private String email;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="gender")
	private Gender gender;
	
	@Column(name="birthdate")
	private Date birthdate;
	
	@OneToMany(mappedBy="user")
    private Set<Post> posts;
	
	@OneToMany(mappedBy="user")
    private Set<Comment> comments;
	
	@ManyToMany(mappedBy="likedComments")
	private Set<Comment> likedComments;
	
	@ManyToMany(mappedBy="likedPosts")
	private Set<Post> likedPosts;
	
	@ManyToMany(mappedBy="likedUsers")
	private Set<User> likedUsers;
	
	@ManyToMany
	@JoinTable(name = "user_liked_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "liked_user_id"))
	private Set<User> userLikes;

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

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<Comment> getLikedComments() {
		return likedComments;
	}

	public void setLikedComments(Set<Comment> likedComments) {
		this.likedComments = likedComments;
	}

	public Set<Post> getLikedPosts() {
		return likedPosts;
	}

	public void setLikedPosts(Set<Post> likedPosts) {
		this.likedPosts = likedPosts;
	}

	public Set<User> getLikedUsers() {
		return likedUsers;
	}

	public void setLikedUsers(Set<User> likedUsers) {
		this.likedUsers = likedUsers;
	}

	public Set<User> getUserLikes() {
		return userLikes;
	}

	public void setUserLikes(Set<User> userLikes) {
		this.userLikes = userLikes;
	}
	
	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public User(int id, String name, String familyName, String email, Gender gender, Date birthdate, Set<Post> posts,
			Set<Comment> comments, Set<Comment> likedComments, Set<Post> likedPosts, Set<User> likedUsers,
			Set<User> userLikes) {
		super();
		this.id = id;
		this.name = name;
		this.familyName = familyName;
		this.email = email;
		this.gender = gender;
		this.birthdate = birthdate;
		this.posts = posts;
		this.comments = comments;
		this.likedComments = likedComments;
		this.likedPosts = likedPosts;
		this.likedUsers = likedUsers;
		this.userLikes = userLikes;
	}

	
}
