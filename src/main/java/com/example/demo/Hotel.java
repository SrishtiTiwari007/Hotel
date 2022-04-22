package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
private int roomno;
private String cust_name;
private Date checkin, checkout;
private int phn;
public int getRoomno() {
	return roomno;
}
public void setRoomno(int roomno) {
	this.roomno = roomno;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public Date getCheckin() {
	return checkin;
}
public void setCheckin(Date checkin) {
	this.checkin = checkin;
}
public Date getCheckout() {
	return checkout;
}
public void setCheckout(Date checkout) {
	this.checkout = checkout;
}
public int getPhn() {
	return phn;
}
public void setPhn(int phn) {
	this.phn = phn;
}
@Override
public String toString() {
	return "Hotel [roomno=" + roomno + ", cust_name=" + cust_name + ", checkin=" + checkin + ", checkout=" + checkout
			+ ", phn=" + phn + "]";
}
}
