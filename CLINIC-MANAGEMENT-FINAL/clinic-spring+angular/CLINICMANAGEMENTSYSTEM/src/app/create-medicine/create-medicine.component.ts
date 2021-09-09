import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { Router } from '@angular/router';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-create-medicine',
  templateUrl: './create-medicine.component.html',
  styleUrls: ['./create-medicine.component.css']
})
export class CreateMedicineComponent implements OnInit {

 
  medicine: Medicine = new Medicine();
  submitted = false;

  constructor(private medicineService: MedicineService,
    private router: Router) { }

  ngOnInit() {
  }

  newMedicine(): void {
    this.submitted = false;
    this.medicine = new Medicine();
  }

  save() {
    this.medicineService
    .createMedicine(this.medicine).subscribe(data => {
      console.log(data)
      this.medicine = new Medicine();
      this.gotoList();
    }, 
    error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/medicines']);
  }

}
