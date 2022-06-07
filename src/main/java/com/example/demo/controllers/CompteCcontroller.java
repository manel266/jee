package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Client;
import com.example.demo.entities.CompteC;
import com.example.demo.entities.Employee;
import com.example.demo.repository.AccountCrepo;
import com.example.demo.repository.ClientRepo;
import com.example.demo.repository.Employeerepo;


@Controller
public class CompteCcontroller {
	
	
@Autowired
AccountCrepo ac;


@Autowired
Employeerepo er;


@Autowired
ClientRepo c;


@GetMapping("/getallaccountsc")
public String showView2(Model model) {
   
    model.addAttribute("accountsc",ac.findAll()) ;

    return  "getallaccountsc" ;	

}

@RequestMapping("/Addaccountc") 
public String Addnewaccount(Model model) {
		 
	
	  List<Client> clist = c.findAll();
	  List<Employee> elist = er.findAll();

	  model.addAttribute("clientslist",clist);
	  model.addAttribute("employeeslist",elist);

	 
		 return "Addaccountc" ; }


		
@PostMapping("/saveaccountc")
public String saveaccountc(@ModelAttribute CompteC accountc , Model model) 
		  { ac.save(accountc); 
		  return "redirect:/Addaccountc"; }

@GetMapping("/deleteac/{Code}") 
public String deleteaccountc(@PathVariable Long Code) { 
	ac.deleteById(Code); return "redirect:/getallaccountsc"; }
 

}
