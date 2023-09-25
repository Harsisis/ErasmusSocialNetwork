package fr.erasmus.socialNetwork.struct;


public class LikedCommentStruct {

	private int id;
	private int userId;
	private int commentId;
	
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
	public LikedCommentStruct(int id, int commentId, int userId) {
		super();
		this.id = id;
		this.commentId = commentId;
		this.userId = userId;
	}
	
	
}
