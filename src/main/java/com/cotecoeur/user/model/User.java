package com.cotecoeur.user.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="_user")
@Getter
@Setter
public class User {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;	

private String nom; 

private String prenom;

private String email;

private String password;

@Enumerated
private RoleEnum role;

}



