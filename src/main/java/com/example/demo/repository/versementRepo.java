package com.example.demo.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.demo.entities.Versement;

@RepositoryRestResource(collectionResourceRel="versement",path="versement")
public interface versementRepo extends JpaRepository<Versement,Long>{
	
}
