package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hotstar;
import com.example.demo.service.HotstarService;

@RestController
public class HotstarController {

	@Autowired
	private HotstarService hotstarService;
	
	@PostMapping("/hotstar")
	public ResponseEntity<Hotstar> saveHotstar(@RequestBody Hotstar hotstar)
	{ 
		return hotstarService.saveHotstar(hotstar)	;	
	}
	 
	@GetMapping("/hotstar")
	public List<Hotstar> getHotstar() 
	{
		return hotstarService.getHotstar();
			
	}
}
