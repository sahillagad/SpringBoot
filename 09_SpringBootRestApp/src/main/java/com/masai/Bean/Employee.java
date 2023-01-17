package com.masai.Bean;

import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private int salary;
	private String dep;
	public Employee(int empId, String empName, int salary, String dep) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dep = dep;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dep=" + dep + "]";
	}

}
