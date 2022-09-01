package com.example.remya.demoH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoH2Controller {
	
	@Autowired
	private DemoH2Service service;
	
	
	@GetMapping("/getByName/{name}")
	public List<DemoH2Entity> getByName(@PathVariable("name") String name) {
		return service.getByName(name);
		
	}
	
	@GetMapping("/getByName")
	public List<DemoH2Entity> getByName() {
		return service.getAll();
		
	}
	
	@GetMapping("/hi")
	public String hi(){
		return "Hi";
		
	}

}
