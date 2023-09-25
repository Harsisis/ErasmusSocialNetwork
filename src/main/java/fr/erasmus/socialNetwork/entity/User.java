package fr.erasmus.socialNetwork.entity;

import java.util.Date;
import java.util.Set;

import fr.erasmus.socialNetwork.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table(name="user")
public class User {

	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="email")
	private String email;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="gender")
	private Gender gender;
	
	@Column(name="birthdate")
	private Date birthdate;
	
	@OneToMany(mappedBy="user")
    private Set<Comment> comments;
	
	@ManyToMany(mappedBy="comment_likes")
	private Set<Comment> likedComments;
	
	@ManyToMany(mappedBy="post_likes")
	private Set<Post> likedPosts;
	
	@ManyToMany(mappedBy="user_likes")
	private Set<User> likedUsers;
	
	@ManyToMany
	@JoinTable(name = "user_liked_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "liked_user_id"))
	private Set<User> user_likes;
}
