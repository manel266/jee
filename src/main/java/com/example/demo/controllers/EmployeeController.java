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



@Controller
public class EmployeeController {

	
	@Autowired
	Employeerepo e;
	

	@GetMapping("/getallemployees")
    public String showView2(Model model) {
       
        model.addAttribute("employees",e.findAll()) ;

        return  "getallemployees" ;	

}
	
	@GetMapping("/delete")
	public String deleteemployee(@RequestParam Long CodeEmployee) {
		e.deleteById(CodeEmployee);
		return "redirect:/getallemployees";
	}
	
	@GetMapping("/UpdateForm/{CodeEmployee}")
	public ModelAndView Updatestudent(@PathVariable(name = "CodeEmployee") Long CodeEmployee,Model model) {
		ModelAndView mav = new ModelAndView("updateemployee");
		Employee employee = e.findById(CodeEmployee).get();
		mav.addObject("employee", employee);
		return mav;
	}
	
	@PostMapping("/saveemployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		e.save(employee);
		return "redirect:/getallemployees";
	}
	
	@RequestMapping("/Addemployee")
	public String Addnewstudent(Employee etudiant,Model model) {
		
		List<Employee> elist = e.findAll();
		model.addAttribute("employeelist",elist);
        return  "Addemployee" ;	
       }
}
