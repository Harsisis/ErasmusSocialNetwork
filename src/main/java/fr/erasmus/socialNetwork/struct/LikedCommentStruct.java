package fr.erasmus.socialNetwork.struct;

import fr.erasmus.socialNetwork.enums.LikeTypeEnum;

public class LikedCommentStruct {

	private int id;
	private int userId;
	private int commentId;
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
	
	public LikedCommentStruct(int id, int userId, int commentId, LikeTypeEnum like) {
		super();
		this.id = id;
		this.userId = userId;
		this.commentId = commentId;
		this.like = like;
	}
	public LikedCommentStruct() {
	}
	
	
}
