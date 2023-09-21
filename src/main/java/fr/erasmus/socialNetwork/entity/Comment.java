package fr.erasmus.socialNetwork.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table(name="comment")
public class Comment {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne  
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne  
	@JoinColumn(name="post_id")
	private Post post;
	
	@Column(name="content")
	private String content;
	
	@Column(name="creation_date")
	private LocalDate creationDate;
}
