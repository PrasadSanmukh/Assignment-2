package com.programs;

public class Student extends Person{
private String programString;
private int fee;
private int year;
public Student(String name, String address, String programString, int fee, int year) {
	super(name, address);
	this.programString = programString;
	this.fee = fee;
	this.year = year;
}
public String getProgramString() {
	return programString;
}
public void setProgramString(String programString) {
	this.programString = programString;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Student [programString=" + programString + ", fee=" + fee + ", year=" + year + "]";
}

}
