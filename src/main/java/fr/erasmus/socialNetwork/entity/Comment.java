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
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable=false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "post_id", nullable=false)
	private Post post;

	@Column(name = "content")
	private String content;

	@Column(name = "creation_date")
	private LocalDate creationDate;

	@ManyToMany
	@JoinTable(name = "user_liked_comment", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "comment_id"))
	private Set<User> likedComments;

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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Set<User> getLikedComments() {
		return likedComments;
	}

	public void setLikedComments(Set<User> likedComments) {
		this.likedComments = likedComments;
	}

	public Comment(int id, User user, Post post, String content, LocalDate creationDate, Set<User> likedComments) {
		super();
		this.id = id;
		this.user = user;
		this.post = post;
		this.content = content;
		this.creationDate = creationDate;
		this.likedComments = likedComments;
	}
	
	
}
