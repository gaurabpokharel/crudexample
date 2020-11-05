package com.CrudExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CrudExample.Entity.PatientEntity;
import com.CrudExample.service.PatientService;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class PatientController {
	@Autowired
	PatientService service;

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }

	@GetMapping("/data")
	public String display()
	{
		return "Hello World!!";
	}
	@PostMapping("/savedata")
	public void save (@RequestBody PatientEntity entity)
	{
		service.save(entity);
	}
	@GetMapping("/viewpatientdata")
	public List<PatientEntity> view()
	{
		return service.view();
	}
	@GetMapping("/searchbyid/{patientid}")
	public PatientEntity searchbyid(@PathVariable("patientid") int patientid)
	{
		return service.searchbyid(patientid);
	}
	@DeleteMapping("/deletebyid/{patientid}")
	public void deletebookbyid(@PathVariable("patientid") int patientid)
	{
	    service.deletebyid(patientid);
	}
	@GetMapping("/searchbyfullname/{patientfullname}")
	public PatientEntity searchbyname(@PathVariable("patientfullname") String patientfullname)
	{
		return service.searchbyname(patientfullname);
	}
}
