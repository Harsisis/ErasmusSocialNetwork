package fr.erasmus.socialNetwork.struct;


public class LikedCommentStruct {

	private int commentId;
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
	public LikedCommentStruct(int commentId, int userId) {
		super();
		this.commentId = commentId;
		this.userId = userId;
	}
	
}
