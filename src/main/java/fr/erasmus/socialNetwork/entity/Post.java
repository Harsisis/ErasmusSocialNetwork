package fr.erasmus.socialNetwork.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
public class Post {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne  
	@JoinColumn(name="user_id", nullable=false)
	private User user;
	
	@Column(name="creation_date")
	private LocalDate creationDate;
	
	@Column(name="content")
	private String content;
	
	@OneToMany(mappedBy="post")
    private Set<Comment> comments;
	
	@ManyToMany
	@JoinTable(name = "user_liked_post", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "post_id"))
	private Set<User> likedPosts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<User> getLikedPosts() {
		return likedPosts;
	}

	public void setLikedPosts(Set<User> likedPosts) {
		this.likedPosts = likedPosts;
	}

	public Post(int id, User user, LocalDate creationDate, String content, Set<Comment> comments,
			Set<User> likedPosts) {
		super();
		this.id = id;
		this.user = user;
		this.creationDate = creationDate;
		this.content = content;
		this.comments = comments;
		this.likedPosts = likedPosts;
	}
	
	
}
