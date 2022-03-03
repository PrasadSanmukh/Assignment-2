package com.programs;

public class Staff extends Person {
private String school;
private double payment;
public Staff(String name, String address, String school, double payment) {
	super(name, address);
	this.school = school;
	this.payment = payment;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public double getPayment() {
	return payment;
}
public void setPayment(double payment) {
	this.payment = payment;
}

}
