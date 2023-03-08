import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../models/employee.model';

const baseUrl = 'http://localhost:8080/api/v1';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Employee[]> {
    return this.http.get<Employee[]>(baseUrl + '/employees');
  }

  getById(id: number): Observable<Employee> {
    return this.http.get(baseUrl + '/employee/' + id);
  }

  getByEmpId(empId: string): Observable<Employee> {
    return this.http.get<Employee>(baseUrl + '/employee/byEmpId/' + empId);
  }

  getByDesignation(designation: string): Observable<Employee[]> {
    return this.http.get<Employee[]>(baseUrl + '/employee/byDesignation/${designation}');
  }
  
  getAllByOrderByDaDesc(): Observable<Employee[]> {
    return this.http.get<Employee[]>(baseUrl + '/employees/orderByDa');
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl + '/employee/save', data);
  }

  update(data: any): Observable<any> {
    return this.http.post(baseUrl + '/employee/update', data);
  }

  delete(id: any): Observable<any> {
    return this.http.delete(baseUrl + '/employee/delete/' + id);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl + '/employees/deleteAll');
  }
  
}
