package fr.erasmus.socialNetwork.struct;

import fr.erasmus.socialNetwork.enums.LikeTypeEnum;

public class LikedPostStruct {

	private int id;
	private int postId;
	private int userId;
	private LikeTypeEnum like;
	
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
	public LikedPostStruct() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LikedPostStruct(int id, int postId, int userId, LikeTypeEnum like) {
		super();
		this.id = id;
		this.postId = postId;
		this.userId = userId;
		this.like = like;
	}
	
}
