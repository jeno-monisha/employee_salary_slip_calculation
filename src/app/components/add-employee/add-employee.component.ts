import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/models/employee.model';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  employee: Employee = {
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
  
  submitted = false;

  constructor(
    private employeeService: EmployeeService,
    private route: ActivatedRoute,
    private router: Router
    ) { }

  ngOnInit(): void {

  }

  saveEmployee(): void {
    const data = {
      empId: this.employee.empId,
      designation: this.employee.designation,
      dateOfJoining: this.employee.dateOfJoining,
      retirementDate: this.employee.retirementDate,
      basicPay: this.employee.basicPay,
      da: this.employee.da,
      specialAllowance: this.employee.specialAllowance,
      professionalTax: this.employee.professionalTax,
      pf: this.employee.pf
    };

    this.employeeService.create(data)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;
          this.router.navigate(['/employees']);
        },
        error => {
          console.log(error);
        });
  }

  newEmployee(): void {
    this.submitted = false;
    this.employee = {
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
  }

}
