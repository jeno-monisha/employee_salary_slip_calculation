package com.salary.employee.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_detail")
public class Employee {
	
	private int id;
	private String empId;
	private String designation;
	private Date dateOfJoining;
	private Date retirementDate;
	private Double basicPay;
	private Double da;
	private Double specialAllowance;
	private Double professionalTax;
	private Double pf;
	
	public Employee () {
		
	}
	
	 public Employee(String empId, String designation, Date dateOfJoining, Double basicPay) {
         this.empId = empId;
         this.designation = designation;
         this.dateOfJoining = dateOfJoining;
         this.basicPay = basicPay;
    }
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "emp_id", nullable = false)
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Column(name = "designation", nullable = false)
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Column(name = "date_of_joining", nullable = false)
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Column(name = "retirement_date", nullable = true)
	public Date getRetirementDate() {
		return retirementDate;
	}
	
	public void setRetirementDate(Date retirementDate) {
		this.retirementDate = retirementDate;
	}
	
	@Column(name = "basic_pay", nullable = false)
	public Double getBasicPay() {
		return basicPay;
	}
	
	public void setBasicPay(Double basicPay) {
		this.basicPay = basicPay;
	}
	
	 @Column(name = "da", nullable = true)
	public Double getDa() {
		return da;
	}
	
	public void setDa(Double da) {
		this.da = da;
	}
	
	 @Column(name = "special_allowance", nullable = true)
	public Double getSpecialAllowance() {
		return specialAllowance;
	}
	
	public void setSpecialAllowance(Double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}
	
	 @Column(name = "professional_tax", nullable = true)
	public Double getProfessionalTax() {
		return professionalTax;
	}
	
	public void setProfessionalTax(Double professionalTax) {
		this.professionalTax = professionalTax;
	}
	
	 @Column(name = "pf", nullable = true)
	public Double getPf() {
		return pf;
	}
	
	public void setPf(Double pf) {
		this.pf = pf;
	}

}
