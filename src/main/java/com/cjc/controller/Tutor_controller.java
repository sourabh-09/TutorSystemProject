package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.Model.Tutor;
import com.cjc.Service.TutorService;

@RestController
@RequestMapping("/tutorservice")
public class Tutor_controller {

	@Autowired
	private TutorService service;
	
	@RequestMapping("/home")
	public String index() {
		return "index";
	}
	
	@PostMapping("/addTutor")
	public Tutor addtutor(@RequestBody Tutor tutor) {
		
		System.out.println("inside Add tutor");
		return service.addTutor(tutor);
	}

	@GetMapping("/bookings")
	public String viewBooking() {
		return "list of bookings";
	}

	@PostMapping("/update-tutor")
	public String update() {
		return "tutor updated";
	}

	@GetMapping("/requests")
	public String viewDemoRequests() {
		return "list of requests";
	}
	
	@GetMapping("/getallTutor")
	public List<Tutor> getallTutor() {
		return service.getallTutor();
		
	}

}
