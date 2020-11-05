package com.CrudExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudExample.Entity.PatientEntity;
import com.CrudExample.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository repository;

	public void save(PatientEntity entity)
	{
		repository.save(entity);
	}
	public List<PatientEntity> view()
	{
		return repository.findAll();
	}
	public PatientEntity searchbyid(int patientid)
	{
		return repository.findById(patientid).get();
	}
	public void deletebyid(int patientid)
	{
		repository.deleteById(patientid);
	}
	public PatientEntity searchbyname(String patientfullname)
	{
		return repository.findByPatientfullname(patientfullname);
}
}