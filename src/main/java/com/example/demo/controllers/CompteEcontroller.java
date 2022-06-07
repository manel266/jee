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
import com.example.demo.entities.CompteE;
import com.example.demo.entities.Employee;
import com.example.demo.repository.AccountCrepo;
import com.example.demo.repository.AccountErepo;
import com.example.demo.repository.ClientRepo;
import com.example.demo.repository.Employeerepo;


@Controller
public class CompteEcontroller {
	
	
@Autowired
AccountErepo ae;


@Autowired
Employeerepo er;


@Autowired
ClientRepo c;


@GetMapping("/getallaccountse")
public String showView2(Model model) {
   
    model.addAttribute("accountse",ae.findAll()) ;

    return  "getallaccountse" ;	

}




  @RequestMapping("/Addaccounte") public String Addnewaccount(Model model) {
  
  
  List<Client> clist = c.findAll(); List<Employee> elist = er.findAll();
  
  model.addAttribute("clientslist",clist);
  model.addAttribute("employeeslist",elist);
  
  
  return "Addaccounte" ; }

  
	
@PostMapping("/saveaccounte")
public String saveaccountc(@ModelAttribute CompteE accounte , Model model) 
		  { ae.save(accounte); 
		  return "redirect:/Addaccounte"; }

@GetMapping("/deleteae/{Code}") public String deleteclient(@PathVariable Long
Code) { ae.deleteById(Code); return "redirect:/getallaccountse"; }

}
