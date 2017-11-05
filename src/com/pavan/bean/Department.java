package com.pavan.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="dept")
public class Department {

	  @Id
	  @Column(name="DEPTNO")
	  private Integer deptNo;
	  @Column(name="DNAME")
	  private String dName;
	  @Column(name="LOC")
	  private String loc;
	  
	  @OneToMany(mappedBy="deptNo")
	  private Set<Employee> employees;
	  
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	  
	  

}
