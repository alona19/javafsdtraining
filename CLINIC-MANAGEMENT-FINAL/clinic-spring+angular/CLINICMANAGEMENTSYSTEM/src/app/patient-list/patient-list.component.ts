
import { Observable } from "rxjs";
import { PatientService } from "./../patient.service";
import { Patient } from "./../patient";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit {

  patients!: Observable<Patient[]>;

  constructor(private employeeService: PatientService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.patients = this.employeeService.getPatientList();
  }

  deletePatient(id: number) {
    this.employeeService.deletePatient(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  employeeDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updatePatient(id: number){
    this.router.navigate(['update', id]);
  }
}
