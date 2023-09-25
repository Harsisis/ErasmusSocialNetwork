package fr.erasmus.socialNetwork.struct;

import java.util.Date;
import java.util.Set;

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
    private Set<CommentDto> comments;
	private Set<CommentDto> likedComments;
	private Set<PostDto> likedPosts;
	private Set<UserDto> likedUsers;
	private Set<UserDto> likes;
}
