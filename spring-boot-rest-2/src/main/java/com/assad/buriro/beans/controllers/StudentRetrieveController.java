package com.assad.buriro.beans.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.assad.buriro.beans.Student;
import com.assad.buriro.beans.StudentRegistration;

@Controller
public class StudentRetrieveController {

	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	  @ResponseBody
	  public List<Student> getAllStudents() {
		System.out.println("Test");
	  return StudentRegistration.getInstance().getStudentRecords();
	  
	  }
}
