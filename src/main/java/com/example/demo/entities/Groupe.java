package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Groupes")
public class Groupe implements Serializable {
	@Id
	@GeneratedValue
	private Long numGroupe;
	public Long getNumGroupe() {
		return numGroupe;
	}
	public void setNumGroupe(Long numGroupe) {
		this.numGroupe = numGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	private String nomGroupe;
	
}
