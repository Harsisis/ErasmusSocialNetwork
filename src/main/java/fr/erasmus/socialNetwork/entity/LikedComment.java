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
@Table(name = "liked_comment")
public class LikedComment {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="comment_id")
	private int commentId;
	
	@Column(name="user_id")
	private int userId;
	
	@Enumerated(EnumType.ORDINAL)
    private LikeTypeEnum like;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
	
	public LikedComment(int id, int commentId, int userId, LikeTypeEnum like) {
		super();
		this.id = id;
		this.commentId = commentId;
		this.userId = userId;
		this.like = like;
	}

	public LikedComment() {
	}

	
}
