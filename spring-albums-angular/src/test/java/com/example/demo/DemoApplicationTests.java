package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	AlbumDAO dao;

	@Test
	void contextLoads() {
		assertNotNull(dao);
	}

	@Test
	void findall() {
		assert(dao.findAll().size()==4);
	}
	
	@Test
	void save() {
		int n =dao.findAll().size();
		Album album = new Album();
		album.setAuteur("Mr Mister");
		album.setNom("The Uniform of Youth");		
		dao.save(album);
		assertEquals(n+1, dao.findAll().size());
	}
	
//	@Test
//	void findById

}
