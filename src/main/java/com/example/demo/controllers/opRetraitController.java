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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Employee;
import com.example.demo.repository.Employeerepo;
import com.example.demo.repository.retraitRepo;
import com.example.demo.repository.versementRepo;



@Controller
public class opRetraitController {

	
	@Autowired
	retraitRepo e;
	

	@GetMapping("/getallroperations")
    public String showView2(Model model) {
       
        model.addAttribute("operationsr",e.findAll()) ;

        return  "getallroperations" ;	

}
	
}
