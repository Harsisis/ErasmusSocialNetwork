package fr.erasmus.socialNetwork.struct;

public class CommentDto {

        private int id;
        private UserDto user;
        private PostDto post;
        private String content;
        private LocalDate creationDate;
        private Set<User> comment_likes;

}
