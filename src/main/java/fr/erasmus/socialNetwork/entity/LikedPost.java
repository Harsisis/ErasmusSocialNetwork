package fr.erasmus.socialNetwork.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="liked_post")
public class LikedPost {

	@Id
	@Column(name="post_id")
	private int postId;
	
	@Id
	@Column(name="user_id")
	private int userId;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LikedPost(int postId, int userId) {
		super();
		this.postId = postId;
		this.userId = userId;
	}
	
}
