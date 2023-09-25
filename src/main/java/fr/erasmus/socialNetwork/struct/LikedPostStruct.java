package fr.erasmus.socialNetwork.struct;

public class LikedPostStruct {

	private int postId;
	private int userId;
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
	public LikedPostStruct(int postId, int userId) {
		super();
		this.postId = postId;
		this.userId = userId;
	}
}
