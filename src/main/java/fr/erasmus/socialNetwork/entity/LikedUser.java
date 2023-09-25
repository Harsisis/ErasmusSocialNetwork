package fr.erasmus.socialNetwork.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="liked_user")
public class LikedUser {

	@Id
	@Column(name="user_id")
	private int userId;
	
	@Id
	@Column(name="liked_user_id")
	private int likedUserId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getLikedUserId() {
		return likedUserId;
	}

	public void setLikedUserId(int likedUserId) {
		this.likedUserId = likedUserId;
	}

	public LikedUser(int userId, int likedUserId) {
		super();
		this.userId = userId;
		this.likedUserId = likedUserId;
	}
	
}
