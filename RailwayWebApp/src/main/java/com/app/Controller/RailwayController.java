package com.app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Railway;
import com.app.Service.IRailwayService;



@RestController
@RequestMapping("/rails")
public class RailwayController {
	@Autowired
	private IRailwayService _railwayservices;
	
	public RailwayController()
	{
		System.out.println("in ctor "+getClass());
	}
	
	
	@PostMapping("/insert")
	public Railway register(@RequestBody Railway railway) {
		
		return _railwayservices.adddeatils(railway);
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public boolean Delete(@PathVariable Long id) {		
		return _railwayservices.delete(id);
	}
	
	@GetMapping("/get")
	public List<Railway> getall()
	{
		return _railwayservices.showDetails();
	}
	
	@PutMapping("/update")
	public Railway update(@RequestBody Railway railway)
	{
		Railway up=_railwayservices.update(railway);
		return up;
		
	}
	@GetMapping("/sort")
	public List<Railway> sorting(){
		return _railwayservices.sorting();
	}
}
