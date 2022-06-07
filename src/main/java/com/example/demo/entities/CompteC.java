package com.example.demo.entities;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteC extends Compte{
	
	
	
	public CompteC() {
		super();
	
	}

	public CompteC(Long numCompte, Date dateCreation, double solde, Collection<Operation> operations, Client client,
			Employee emp) {
		super(numCompte, dateCreation, solde, operations, client, emp);
		
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	private double decouvert;

}
