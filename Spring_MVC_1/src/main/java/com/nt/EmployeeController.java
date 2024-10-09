package com.nt;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.entity.Employee;
import com.nt.service.EmpService;

@Controller
public class EmployeeController {

	@Autowired
	private EmpService service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/register-form")
	public String registerForm() {
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute Employee e, Model model) {
		System.out.println(e.getName());
		service.register(e);
		model.addAttribute("msg", "Registeration Successfully");
		return "index";
	}
	
	@RequestMapping("/allUser")
	public String getAllUser(Model model,HttpSession session) {
		if(session.getAttribute("loggedInUser")==null) {
			model.addAttribute("msg", "First Login..");
			return "index";
		}else {
			List<Employee> eList=service.getAllUser();
			model.addAttribute("eList", eList);
			return "displayAll";
		}
	}
}
