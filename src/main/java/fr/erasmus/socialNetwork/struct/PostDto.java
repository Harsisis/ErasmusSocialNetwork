package fr.erasmus.socialNetwork.struct;

import java.time.LocalDate;
import java.util.Set;

import fr.erasmus.socialNetwork.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
