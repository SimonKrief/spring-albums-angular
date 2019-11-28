package com.example.demo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WebServiceREST {
	@Autowired
	private AlbumDAO dao;
	
	@GetMapping(path = "/albums")
	public List<Album> findAll(){
		return dao.findAll();
	}
	
	@PostMapping(path="/albums")
	public void save(@RequestBody Album album) {
		dao.save(album);
	}


}
