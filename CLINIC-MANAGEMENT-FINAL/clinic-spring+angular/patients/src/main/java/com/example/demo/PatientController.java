package com.example.demo;

import java.util.HashMap;

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;

	@GetMapping("/patients")
	public List<Patient> getAllEmployees() {
		return patientRepository.findAll();
	}

	@GetMapping("/patients/{id}")
	public ResponseEntity<Patient> getEmployeeById(@PathVariable(value = "id") Long patientId)
			throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + patientId));
		return ResponseEntity.ok().body(patient);
	}

	@PostMapping("/patients")
	public Patient createEmployee( @RequestBody Patient patient) {
		return patientRepository.save(patient);
	}

	@PutMapping("/patients/{id}")
	public ResponseEntity<Patient> updateEmployee(@PathVariable(value = "id") Long patientId,
			 @RequestBody Patient employeeDetails) throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + patientId));

		patient.setEmailId(employeeDetails.getEmailId());
		patient.setLastName(employeeDetails.getLastName());
		patient.setFirstName(employeeDetails.getFirstName());
		final Patient updatedEmployee = patientRepository.save(patient);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/patients/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long patientId)
			throws ResourceNotFoundException {
		Patient employee = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Patients not found for this id :: " + patientId));

		patientRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
