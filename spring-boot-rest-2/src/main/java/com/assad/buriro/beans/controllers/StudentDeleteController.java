package com.assad.buriro.beans.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assad.buriro.beans.StudentRegistration;

public class StudentDeleteController {

	@RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("reqNum")String reqNum) {
		System.out.println("In deleteStudentRecord"); 
		return StudentRegistration.getInstance().deleteStudent(reqNum);
	}
}
