package com.infinite.SpringBootMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.SpringBootMvc.model.Login;
import com.infinite.SpringBootMvc.service.LoginServiceImpl;

@Controller
public class LoginController {

	@Autowired
	LoginServiceImpl loginService;

		@RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
		public String showLoginForm(@PathVariable String username, Model model) {
			model.addAttribute("loginForm", new Login());
			model.addAttribute("username", username);
			return "login"; // This maps to login.jsp (your login form view)
		}

		@RequestMapping(value = "/login/{username}", method = RequestMethod.POST)
		public String login(@PathVariable String username,
			   @ModelAttribute("loginForm") Login loginForm, Model model) {
			if (loginService(username, loginForm.getPassword())) {
				model.addAttribute("message", "Login successful!");
				return "success"; // This maps to success.jsp (your success
									// page)
			} else {
				model.addAttribute("message", "Login failed. Invalid username or password.");
				model.addAttribute("username", username);
				return "failure"; // This maps to failure.jsp (your failure
									// page)
			}
		}
	}

