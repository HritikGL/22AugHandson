package com.example.demo.model;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity

public class Customer {

@Id
private int cid;
private String cname;
private double cphone;
private String cadd;
private String clid;
private String cpass;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public double getCphone() {
	return cphone;
}
public void setCphone(double cphone) {
	this.cphone = cphone;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public String getClid() {
	return clid;
}
public void setClid(String clid) {
	this.clid = clid;
}
public String getCpass() {
	return cpass;
}
public void setCpass(String cpass) {
	this.cpass = cpass;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + ", cadd=" + cadd + ", clid=" + clid
			+ ", cpass=" + cpass + "]";
}
}