package com.test.springwithJPA.springwithJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/")
	public String show(Model model)
	{
		
		List<Student> list=service.dispalyStudent();
		for(Student p:list)
		{
			System.out.println(p.getName()+"  "+p.getCgpa());
		}
		model.addAttribute("data", list);
		
		
		return "index";
	}
	@RequestMapping("/new")
	public String addNewData(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "new_Product";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addData(@ModelAttribute("student") Student student)
	{
		service.save(student);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id)
	{
		ModelAndView view=new ModelAndView("edit_Product");
		Student student=service.get(id);
		view.addObject("student", student);
		return view;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudentPage(@PathVariable(name = "id") int id)
	{
		service.delete(id);
		
		return "redirect:/";
	}
}
