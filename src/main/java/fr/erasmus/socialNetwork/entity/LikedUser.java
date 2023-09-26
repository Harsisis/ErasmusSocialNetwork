package fr.erasmus.socialNetwork.entity;

import fr.erasmus.socialNetwork.enums.LikeTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="liked_user")
public class LikedUser {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="liked_user_id")
	private int likedUserId;
	
	@Enumerated(EnumType.STRING)
    private LikeTypeEnum like;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public LikeTypeEnum getLike() {
		return like;
	}

	public void setLike(LikeTypeEnum like) {
		this.like = like;
	}

	public LikedUser(int id, int userId, int likedUserId, LikeTypeEnum like) {
		super();
		this.id = id;
		this.userId = userId;
		this.likedUserId = likedUserId;
		this.like = like;
	}

	public LikedUser() {
	}

	
}
