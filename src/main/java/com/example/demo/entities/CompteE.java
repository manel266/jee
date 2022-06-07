package com.example.demo.entities;


import java.sql.Date;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteE  extends Compte{
	
	

	public CompteE() {
		super();
		
	}

	public CompteE(Long numCompte, Date dateCreation, double solde, Collection<Operation> operations, Client client,
			Employee emp) {
		super(numCompte, dateCreation, solde, operations, client, emp);
		
	}

	public double getTaux() {
		return Taux;
	}

	public void setTaux(double taux) {
		Taux = taux;
	}

	private double Taux;
}
