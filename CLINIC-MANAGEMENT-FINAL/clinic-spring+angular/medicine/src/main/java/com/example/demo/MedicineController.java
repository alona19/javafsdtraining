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
@RequestMapping("/v1")
public class MedicineController {
	@Autowired
	private MedicineRepository medicinerepository;

	@GetMapping("/medicines")
	public List<Medicine> getAllMedicine() {
		return medicinerepository.findAll();
	}

	@GetMapping("/medicines/{id}")
	public ResponseEntity<Medicine> getEmployeeById(@PathVariable(value = "id") Long medicineId)
			throws ResourceNotFoundException {
		Medicine medicine = medicinerepository.findById(medicineId)
				.orElseThrow(() -> new ResourceNotFoundException("medicines not found for this id :: " + medicineId));
		return ResponseEntity.ok().body(medicine);
	}

	@PostMapping("/medicines")
	public Medicine createEmployee( @RequestBody Medicine medicine) {
		return medicinerepository.save(medicine);
	}

	@PutMapping("/medicines/{id}")
	public ResponseEntity<Medicine> updateEmployee(@PathVariable(value = "id") Long medicineId,
			 @RequestBody Medicine employeeDetails) throws ResourceNotFoundException {
		Medicine medicine = medicinerepository.findById(medicineId)
				.orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + medicineId));

		medicine.setName(employeeDetails.getName());
		medicine.setPrice(employeeDetails.getPrice());
		medicine.setQuantity(employeeDetails.getQuantity());
		final Medicine updatedEmployee = medicinerepository.save(medicine);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/medicines/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long medicineId)
			throws ResourceNotFoundException {
		Medicine medicine = medicinerepository.findById(medicineId)
				.orElseThrow(() -> new ResourceNotFoundException("medicines not found for this id :: " + medicineId));

		medicinerepository.delete(medicine);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
