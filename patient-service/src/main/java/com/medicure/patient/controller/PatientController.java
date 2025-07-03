package com.medicure.patient.controller;

import com.medicure.patient.model.Patient;
import com.medicure.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    // Get all patients
    @GetMapping
    public List<Patient> getAll() {
        return service.getAllPatients();
    }

    // Get patient by ID
    @GetMapping("/{id}")
    public Patient getById(@PathVariable Long id) {
        return service.getPatientById(id);
    }

    // Create new patient
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Patient create(@RequestBody Patient patient) {
        return service.createPatient(patient);
    }

    // Delete patient by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deletePatient(id);
    }
}

