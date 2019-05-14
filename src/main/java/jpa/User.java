package jpa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)	
@Column(name="id")
private Integer id;	

@Column(name="mail")
private String mail;

@Column(name="password")
private String password;

@Column(name="role")
private String role;

}



