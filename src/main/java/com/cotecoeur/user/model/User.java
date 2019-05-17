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
import java.io.Serializable;

@Entity
@Table(name="user_")
@Getter
@Setter
public class User  implements Serializable {

    private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;	

private String nom; 

private String prenom;

private String email;

private String password;

@Enumerated
private RoleEnum role;

    public User(String nom, String prenom, String email, String password, RoleEnum role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {
    }
}



