package com.cotecoeur.user.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;	

	private String nom; 

	private String prenom;

	private String email;

	private String password;

	@Enumerated
	private RoleEnum role;



	public UserDTO() {
	}

	/*
	public UserDTO(Long id, String nom, String prenom, String email, String password, RoleEnum role) {
		super();
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.sens = sens;
		this.role = role;
	}
	

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + ", role=" + role + "]";
	}
	*/

}
