import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'src/app/models/employee.model';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  currentEmployee: Employee = {
    empId: '',
    designation: '',
    dateOfJoining: new Date(),
    retirementDate: new Date(),
    basicPay: 0,
    da: 0,
    specialAllowance: 0,
    professionalTax: 0,
    pf: 0
  };
  message = '';

  constructor(
    private employeeService: EmployeeService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.message = '';
    this.getEmployee(this.route.snapshot.params.id);
  }
  
  getEmployee(id: number): void {
    this.employeeService.getById(id)
      .subscribe(
        data => {
          this.currentEmployee = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  
  updateEmployee(): void {
    this.message = '';
    this.employeeService.update(this.currentEmployee)
      .subscribe(
        response => {
          console.log(response);
          this.message = response.message ? response.message : 'This employee was updated successfully!';
          this.router.navigate(['/employees']);
        },
        error => {
          console.log(error);
        });
  }
  
  deleteEmployee(): void {
    this.employeeService.delete(this.currentEmployee.id)
      .subscribe(
        response => {
          console.log(response);
          this.router.navigate(['/employees']);
        },
        error => {
          console.log(error);
        });
  }

}
