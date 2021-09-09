import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PatientdetailsComponent} from './patientdetails/patientdetails.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [

  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {path: 'patients', component: PatientListComponent},
  {path: 'add', component: CreatePatientComponent},
  { path: 'update/:id', component: UpdatePatientComponent },
  {path: 'medicines', component: MedicineListComponent},
  {path: 'addM', component: CreateMedicineComponent},
  {path: 'updateM/:id', component: UpdateMedicineComponent },
  {path: 'home', component: HomeComponent },
  {path: 'login', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
