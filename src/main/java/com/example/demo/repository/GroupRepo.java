package com.example.demo.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Groupe;

@RepositoryRestResource(collectionResourceRel="groupe",path="groupe")
public interface GroupRepo extends JpaRepository<Groupe,Long>{
	List<Groupe> findByNomGroupe(@Param("nom") String nom);
	
	List<Groupe> findByNomGroupeContains(@Param("nom") String nom);
	List<Groupe> findByNumGroupe(@Param("num") Long numerogrp);
	
	@Transactional
	List<Groupe> deleteByNomGroupe(@Param("name")String name);

	


	


}
