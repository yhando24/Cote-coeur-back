package com.cotecoeur.operation.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.Setter;


@NamedQueries(value = {
    @NamedQuery(name = "Operation.getAll", query = "SELECT o FROM Operation o")
})
@Entity
@Getter
@Setter
public class Operation {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	private LocalDate date;
	
	private float montant;
	
	private Sens sens;
	
	private String UrlImage;

}
