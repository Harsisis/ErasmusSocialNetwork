package fr.erasmus.socialNetwork.struct;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

        private int id;
        private UserDto user;
        private String content;
        private LocalDate creationDate;
        private Set<User> likes;
}
