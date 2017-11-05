package com.pavan.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	public Employee() {	}
	@Id
	@Column(name="EMPNO")
	private Integer empNo;
	@Column(name="ENAME")
	private String eName;
	@Column(name="JOB")
	private String job;
	@Column(name="MGR")
	private Integer managerEmpNo;
	@Column(name="HIREDATE")
	private Date hireDate;
	@Column(name="SAL")
	private Double salary; 
	@Column(name="COMM")
	private Double commission;
	
	
	@ManyToOne
	@JoinColumn(name="DEPTNO")
	private Department deptNo;
	
	
	
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	

	
	public Integer getManagerEmpNo() {
		return managerEmpNo;
	}
	public void setManagerEmpNo(Integer managerEmpNo) {
		this.managerEmpNo = managerEmpNo;
	}
	@Override
	public boolean equals(Object obj) {
		if(Employee.class.isInstance(obj)) return false;
		else return ((Employee)obj).empNo == this.empNo;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(this.empNo).hashCode();
	}

	@Override
	public String toString() {

		return this.empNo+" "+this.eName;
	}
	public Department getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Department deptNo) {
		this.deptNo = deptNo;
	}
}
