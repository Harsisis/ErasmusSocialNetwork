package fr.erasmus.socialNetwork.struct;

public class LikedUserStruct {

	private int userId;
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
	public LikedUserStruct(int userId, int likedUserId) {
		super();
		this.userId = userId;
		this.likedUserId = likedUserId;
	}
	
	
}
