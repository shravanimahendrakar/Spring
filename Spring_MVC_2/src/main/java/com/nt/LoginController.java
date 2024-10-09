package com.nt;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Employee;
import com.nt.service.EmpService;

@Controller
public class LoginController {

	@Autowired
	private EmpService service;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam() String emailId, @RequestParam() String password, Model model,HttpSession session) {
		Employee e = service.isValidUser(emailId);
		if (e != null && e.getPassword().equals(password)) {
			session.setAttribute("loggedInUser", e.getName());
			model.addAttribute("msg", "Login Successfully");
			return "login";
		} else {
			model.addAttribute("msg", "Login failed");
			return "index";
		}
	}
	
	@RequestMapping("/logout")
	public String Logout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("msg", "Logout Successfully");
		return "index";
	}
}
