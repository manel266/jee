package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Cpt",discriminatorType=DiscriminatorType.STRING, length=2)
public abstract class Compte implements Serializable {
	@Id
	@GeneratedValue
	private Long numCompte;
	private Date dateCreation;
	private double solde;
	
	@OneToMany(mappedBy="compte")
	private Collection<Operation> operations;
	
	@ManyToOne
	@JoinColumn(name="Code_Cli")
	private Client client;

	

	public Long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Collection<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@ManyToOne
	@JoinColumn(name="code_emp")
	private Employee emp;

	public Compte(Long numCompte, Date dateCreation, double solde, Collection<Operation> operations, Client client,
			Employee emp) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.operations = operations;
		this.client = client;
		this.emp = emp;
	}

	public Compte() {
		
	}
	
	
}
