package com.example.demo.cmnr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.manytoone.CategoryRepository;
import com.example.demo.manytoone.Catogory;

@Component
public class Bean1 {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public void show() {
		List<Catogory> list = categoryRepository.findAll();
		for (Catogory catogory : list) {
			System.out.println(catogory);
		}
	}
}

