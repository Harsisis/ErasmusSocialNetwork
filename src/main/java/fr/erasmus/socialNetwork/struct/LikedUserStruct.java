package fr.erasmus.socialNetwork.struct;

import fr.erasmus.socialNetwork.enums.LikeTypeEnum;

public class LikedUserStruct {

	private int id;
	private int userId;
	private int likedUserId;
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
	public LikedUserStruct(int id, int userId, int likedUserId, LikeTypeEnum like) {
		super();
		this.id = id;
		this.userId = userId;
		this.likedUserId = likedUserId;
		this.like = like;
	}
	public LikedUserStruct() {
	}
	
	
}
