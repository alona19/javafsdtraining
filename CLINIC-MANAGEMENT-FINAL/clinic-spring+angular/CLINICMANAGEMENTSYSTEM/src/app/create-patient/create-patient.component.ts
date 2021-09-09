import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from "./../patient.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {

  patient: Patient = new Patient();
  submitted = false;

  constructor(private employeeService: PatientService,
    private router: Router) { }

  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.patient = new Patient();
  }

  save() {
    this.employeeService
    .createPatient(this.patient).subscribe(data => {
      console.log(data)
      this.patient = new Patient();
      this.gotoList();
    }, 
    error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/patients']);
  }

}
