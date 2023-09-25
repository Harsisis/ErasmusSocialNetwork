package fr.erasmus.socialNetwork.struct;

public class LikedUserStruct {

	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LikedUserStruct(int id, int userId, int likedUserId) {
		super();
		this.id = id;
		this.userId = userId;
		this.likedUserId = likedUserId;
	}
	
	
}
