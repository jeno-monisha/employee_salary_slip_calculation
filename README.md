# employee_salary_slip_calculation
Spring Boot + SQL Server + JPA / Hibernate + REST CRUD + Angular 12

For SQL Server integration to spring boot, we have to add the following starter dependency in pom.xml.

 <dependency>
      <groupId>com.microsoft.sqlserver</groupId>
      <artifactId>mssql-jdbc</artifactId> 
  </dependency>


Implemented REST CRUD APIs for calculating the salary of employee. Employee model class includes empId, designation, date of joining, retirement date, basic pay, da, special allowance, professional tax and pf.

REST APIs details:
1. http://localhost:8080/api/v1/employees (GET)
2. http://localhost:8080/api/v1/employee/id/{id} (GET)
3. http://localhost:8080/api/v1/employee/byEmpId/{empId} GET
4. http://localhost:8080/api/v1/employee/byDesignation/{designation} GET
5. http://localhost:8080/api/v1/employees/orderByDa GET
6. http://localhost:8080/api/v1/employee/save POST
7. http://localhost:8080/api/v1/employee/update POST
8. http://localhost:8080/api/v1/employee/delete/{id} DELETE
9. http://localhost:8080/api/v1/employees/deleteAll DELETE


<img src="/assets/getAllEmployees_api.png" alt="Get All Employees API" title="Get All Employees API">
<img src="/assets/getEmployeeByEmpId_api.png" alt="Get Employee By EmpId API" title="Get Employee By EmpId API">
<img src="/assets/angular_main_screen_employee_list_by_designation.png" alt="Angular Main Screen Employee List By Designation" title="Angular Main Screen Employee List By Designation">
<img src="/assets/angular_add_employee_screen.png" alt="Angular Add Employee Screen" title="Angular Add Employee Screen">
<img src="/assets/angular_employee_list_screen.png" alt="Angular Employee List Screen" title="Angular Employee List Screen">
<img src="/assets/angular_edit_employee_screen.png" alt="Angular Edit Employee Screen" title="Angular Edit Employee Screen">


