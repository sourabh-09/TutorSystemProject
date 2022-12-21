package com.cjc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Tutor-service")
public class Tutor_controller {
	
	@PostMapping("/addTutor")
public String addtutor() {
	return "tutor added";
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
	
	
}
