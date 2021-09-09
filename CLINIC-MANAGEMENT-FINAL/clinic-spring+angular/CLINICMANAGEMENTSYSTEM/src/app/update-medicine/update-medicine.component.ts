import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { ActivatedRoute, Router } from '@angular/router';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-update-medicine',
  templateUrl: './update-medicine.component.html',
  styleUrls: ['./update-medicine.component.css']
})
export class UpdateMedicineComponent implements OnInit {

  id: number;
 
  medicine: Medicine;

  constructor(private route: ActivatedRoute,private router: Router,
    private medicineService: MedicineService) { }

  ngOnInit() {
    this.medicine = new Medicine();

    this.id = this.route.snapshot.params['id'];
    
    this.medicineService.getMedicineById(this.id)
      .subscribe(data => {
        console.log(data)
        this.medicine = data;
      }, error => console.log(error));
  }

  updateMedicine() {
    this.medicineService.updateMedicine(this.id, this.medicine)
      .subscribe(data => {
        console.log(data);
        this.medicine = new Medicine();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateMedicine();    
  }

  gotoList() {
    this.router.navigate(['/medicines']);
  }


}
