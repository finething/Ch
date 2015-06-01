package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Service;
import data.User;

@Controller
public class Front {
	
	@Autowired
	private Service service;
	
		
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String welcom() {
		return "start";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(User user){
		service.saveUser(user);
		return "start";
	}
}
