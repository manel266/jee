package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;

@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue
	private Long Code;
	private String name;
	
	@Override
	public String toString() {
		return "Client [Code=" + Code + ", name=" + name + ", comptes=" + comptes + "]";
	}

	public Long getCode() {
		return Code;
	}

	public void setCode(Long code) {
		Code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	@OneToMany(mappedBy="client",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Compte> comptes;
}
