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
@Table(name = "liked_post")
public class LikedPost {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "post_id")
	private int postId;

	@Column(name = "user_id")
	private int userId;
	
	@Enumerated(EnumType.ORDINAL)
    private LikeTypeEnum like;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public LikeTypeEnum getLike() {
		return like;
	}

	public void setLike(LikeTypeEnum like) {
		this.like = like;
	}

	public LikedPost(int id, int postId, int userId, LikeTypeEnum like) {
		super();
		this.id = id;
		this.postId = postId;
		this.userId = userId;
		this.like = like;
	}

	public LikedPost() {
	}

}
