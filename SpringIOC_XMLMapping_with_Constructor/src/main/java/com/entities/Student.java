package com.entities;

public class Student {
	private int sid;
	private String sname;
	private int marks;
	private College clg;

	public Student() {

	}

	public Student(int sid, String sname, int marks, College clg) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.clg = clg;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", clg=" + clg + "]";
	}

}
