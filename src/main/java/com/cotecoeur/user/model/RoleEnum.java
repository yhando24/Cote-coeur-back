package com.cotecoeur.user.model;

public enum RoleEnum {
	

	RESPONSABLE ("Responsable"),
	CONSULTANT ("Consultant"),
	SUPERADMIN ("SuperAdmin");

	private String role;

	RoleEnum(String role){
		this.role = role;
	}
}
