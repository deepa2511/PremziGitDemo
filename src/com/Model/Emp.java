package com.Model;

public class Emp {
private int eid;
	private int salary;
private String ename;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
public void input(int id,String nm)
{
	this.eid=id;
	this.ename=nm;
}
	
}
