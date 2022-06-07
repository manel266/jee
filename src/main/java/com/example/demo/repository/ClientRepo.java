package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entities.Client;

@RepositoryRestResource(collectionResourceRel="client",path="client")
public interface ClientRepo extends JpaRepository<Client,Long>{
	
	List<Client> findAll(); 
	List<Client> findByNameContains(@Param("name") String name);
	  List<Client> findByName(@Param("name") String name);
	 
	  @RestResource(path="fname") List<Client> findByName(@Param("name") String
	  name,Pageable pageable);
	  
	  @RestResource(path="name") List<Client> findByNameContains(@Param("name")
	  String name,Pageable pageable); List<Client>
	  deleteByName(@Param("name")String name);
	 


	


}
