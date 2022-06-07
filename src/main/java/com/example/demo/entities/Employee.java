package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
public class Employee implements Serializable{
	
    
	@Id
	@GeneratedValue
	private Long CodeEmployee;
	private String nomEmployee;
	@ManyToOne
	@JoinColumn(name="code_emp_sup" )
	private Employee supemp;

	
	@ManyToMany
	@JoinTable(name="Emp_Gr",joinColumns=
	@JoinColumn(name="Num_Emp"),inverseJoinColumns=
	@JoinColumn(name="NumGroupe"))
	private Collection<Groupe> groupes;


	public Long getCodeEmployee() {
		return CodeEmployee;
	}

	public void setCodeEmployee(Long codeEmployee) {
		CodeEmployee = codeEmployee;
	}

	public String getNomEmployee() {
		return nomEmployee;
	}

	public void setNomEmployee(String nomEmployee) {
		this.nomEmployee = nomEmployee;
	}

	public Employee getSupemp() {
		return supemp;
	}

	public void setSupemp(Employee supemp) {
		this.supemp = supemp;
	}

	public Collection<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}
	

}
