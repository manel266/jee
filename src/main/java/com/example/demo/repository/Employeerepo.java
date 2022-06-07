package com.example.demo.repository;

import java.awt.print.Pageable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Employee;
@RepositoryRestResource(collectionResourceRel="employee",path="employee")
public interface Employeerepo extends JpaRepository<Employee,Long> {
	
	List<Employee> findAll(); 

	
	List<Employee> findByNomEmployee(@Param("name") String name);
	
	List<Employee> findByNomEmployeeContains(@Param("name") String name);
	
	
	@Transactional
	List<Employee> deleteByNomEmployee(@Param("name")String name);

}
