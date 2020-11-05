package com.CrudExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrudExample.Entity.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

	PatientEntity findByPatientfullname(String patientfullname);
}
