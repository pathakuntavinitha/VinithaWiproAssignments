package springPractice;

import org.springframework.stereotype.Controller;


public class Employeebean {
 private int empid;
 private String empname;
  private float empsal;
  public int getEmpid() {
	return empid;
  }
  public void setEmpid(int empid) {
	this.empid = empid;
  }
  public String getEmpname() {
	return empname;
  }
  public void setEmpname(String empname) {
	this.empname = empname;
  }
  public float getEmpsal() {
	return empsal;
  }
  public void setEmpsal(float empsal) {
	this.empsal = empsal;
  }
  
 
}
