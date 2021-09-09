import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-patient',
  templateUrl: './update-patient.component.html',
  styleUrls: ['./update-patient.component.css']
})
export class UpdatePatientComponent implements OnInit {

  id: number;
 
  patient: Patient;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: PatientService) { }

  ngOnInit() {
    this.patient = new Patient();

    this.id = this.route.snapshot.params['id'];
    
    this.employeeService.getPatientById(this.id)
      .subscribe(data => {
        console.log(data)
        this.patient = data;
      }, error => console.log(error));
  }

  updateEmployee() {
    this.employeeService.updatePatient(this.id, this.patient)
      .subscribe(data => {
        console.log(data);
        this.patient = new Patient();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateEmployee();    
  }

  gotoList() {
    this.router.navigate(['/employees']);
  }

}
