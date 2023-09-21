package fr.erasmus.socialNetwork.entity;

import java.util.Date;

import fr.erasmus.socialNetwork.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
