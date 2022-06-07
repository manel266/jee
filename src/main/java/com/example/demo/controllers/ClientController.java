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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Client;
import com.example.demo.entities.Employee;
import com.example.demo.repository.ClientRepo;
import com.example.demo.repository.Employeerepo;

@Controller
public class ClientController {
	
	@Autowired
	ClientRepo c;
	@GetMapping("/getallclients")
    public String showView2(Model model) {
       
        model.addAttribute("clients",c.findAll()) ;

        return  "getallclients" ;	

}
	@GetMapping("/UpdatecForm/{Code}")
	public ModelAndView Updatestudent(@PathVariable(name = "Code") Long Code,Model model) {
		ModelAndView mav = new ModelAndView("updateclient");
		Client client = c.findById(Code).get();
		mav.addObject("client", client);
		return mav;
	}
	
	@PostMapping("/saveclient")
	public String saveEmployee(@ModelAttribute Client client) {
		c.save(client);
		return "redirect:/getallclients";
	}
	
	@GetMapping("/deletec/{Code}")
	public String deleteclient(@PathVariable Long Code) {
		c.deleteById(Code);
		return "redirect:/getallclients";
	}
	
	@RequestMapping("/Addclient")
	public String Addnewclient(Client client,Model model) {
		
		List<Client> clist = c.findAll();
		model.addAttribute("clientslist",clist);
        return  "Addclient" ;	
       }

}
