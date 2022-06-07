package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Opt",discriminatorType=DiscriminatorType.STRING, length=2)

public class Operation implements Serializable{
	@Id
	@GeneratedValue
	private Long numOperation;
	private Date dateOperation;
	private double Montant;
	
	@ManyToOne
	@JoinColumn(name="Code_cpt")
	private Compte compte;
	@ManyToOne
	@JoinColumn(name="Code_emp")
	private Employee emp;
	
	public Long getNumOperation() {
		return numOperation;
	}
	public void setNumOperation(Long numOperation) {
		this.numOperation = numOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontant() {
		return Montant;
	}
	public void setMontant(double montant) {
		Montant = montant;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

}
