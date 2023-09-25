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

}
