package com.example.demo.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entities.Compte;
import com.example.demo.entities.CompteE;


@RepositoryRestResource(collectionResourceRel="comptee",path="comptee")
public interface AccountErepo extends JpaRepository<CompteE,Long>{
	

}
