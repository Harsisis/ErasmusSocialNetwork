package fr.erasmus.socialNetwork.struct;

import java.util.Date;
import java.util.Set;

import fr.erasmus.socialNetwork.entity.Comment;
import fr.erasmus.socialNetwork.entity.Post;
import fr.erasmus.socialNetwork.entity.User;
import fr.erasmus.socialNetwork.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class UserDto {

	private int id;
	private String name;
	private String familyName;
	private String email;
	private Gender gender;
	private Date birthdate;
    private Set<Comment> comments;
	private Set<Comment> likedComments;
	private Set<Post> likedPosts;
	private Set<User> likedUsers;
	private Set<User> likes;
}
