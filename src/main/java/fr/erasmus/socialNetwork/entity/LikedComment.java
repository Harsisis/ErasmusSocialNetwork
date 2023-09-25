package fr.erasmus.socialNetwork.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "liked_comment")
public class LikedComment {

	@Id
	@Column(name="comment_id")
	private int commentId;
	
	@Id
	@Column(name="user_id")
	private int userId;

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

	public LikedComment(int commentId, int userId) {
		super();
		this.commentId = commentId;
		this.userId = userId;
	}
	
}
