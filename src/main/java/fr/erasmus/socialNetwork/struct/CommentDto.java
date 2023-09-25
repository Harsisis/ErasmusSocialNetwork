package fr.erasmus.socialNetwork.struct;

import java.time.LocalDate;
import java.util.Set;

public class CommentDto {

        private int id;
        private UserDto user;
        private PostDto post;
        private String content;
        private LocalDate creationDate;
        private Set<UserDto> comment_likes;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public UserDto getUser() {
			return user;
		}
		public void setUser(UserDto user) {
			this.user = user;
		}
		public PostDto getPost() {
			return post;
		}
		public void setPost(PostDto post) {
			this.post = post;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public LocalDate getCreationDate() {
			return creationDate;
		}
		public void setCreationDate(LocalDate creationDate) {
			this.creationDate = creationDate;
		}
		public Set<UserDto> getComment_likes() {
			return comment_likes;
		}
		public void setComment_likes(Set<UserDto> comment_likes) {
			this.comment_likes = comment_likes;
		}
		public CommentDto(int id, UserDto user, PostDto post, String content, LocalDate creationDate,
				Set<UserDto> comment_likes) {
			super();
			this.id = id;
			this.user = user;
			this.post = post;
			this.content = content;
			this.creationDate = creationDate;
			this.comment_likes = comment_likes;
		}
        
        

}
