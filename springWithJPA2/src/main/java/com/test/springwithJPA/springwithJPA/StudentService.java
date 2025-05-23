package com.test.springwithJPA.springwithJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {

	@Autowired
	MyRepo repo;
	
	public List<Student> dispalyStudent()
	{
		return repo.findAll();
	}
	
	public void save(Student product)
	{
		repo.save(product);
	}
	
	public Student get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id)
	{
		repo.deleteById(id);
	}
	
	
}
