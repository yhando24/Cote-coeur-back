package com.cotecoeur.operation.model;

public enum Sens {
	
	  DEBIT ("Débit"),
	  CREDIT ("Crédit");

	  private String sens;
	
	  Sens(String sens){
		this.sens = sens;
	  }
}
