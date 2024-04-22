package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Hotstar;

import com.example.demo.repo.HotstarRepo;

@Service
public class HotstarService {
	
	@Autowired
	HotstarRepo hotstarRepo;
	public ResponseEntity<Hotstar> saveHotstar(@RequestBody Hotstar hotstar)
	{ 
		return new ResponseEntity<>(hotstarRepo.save(hotstar),HttpStatus.CREATED);		
	}
	
	
	public List<Hotstar> getHotstar() {
		// TODO Auto-generated method stub
		 return hotstarRepo.findAll();
		
	}
	


	
}
