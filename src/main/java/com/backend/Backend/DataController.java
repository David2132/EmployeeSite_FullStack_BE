package com.backend.Backend;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employees")
public class DataController {
	@Autowired
	private DataRepository repo;
		
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> employees() {
		System.out.println("Emplyees was printed!!!");
		
		return repo.findAll();
	}
	@RequestMapping(path = {"/{id}"},method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable long id) {
		System.out.println();
		System.out.println("Got an Employee");
		return repo.getOne(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Employee create(@RequestBody Employee user) {
		System.out.println();
		System.out.println("Created a new user");
		return repo.saveAndFlush(user);
	}
	
	@RequestMapping(path = {"/{id}"},method = RequestMethod.PUT)
	public Employee edit(@PathVariable long id, @RequestBody Employee emp) {
		System.out.println();
		System.out.println("User was edited");
		return repo.save(emp);
				}

	
	
	
}
