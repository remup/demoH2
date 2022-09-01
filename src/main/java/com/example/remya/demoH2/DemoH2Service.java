package com.example.remya.demoH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoH2Service {
	
	@Autowired
	private DemoH2CrudInterface repo;
	
	public List<DemoH2Entity> getByName(String name) {
		return repo.findByName(name);
		
	}

	public List<DemoH2Entity> getAll() {
		// TODO Auto-generated method stub
		return  (List<DemoH2Entity>) repo.findAll();
	}

}
