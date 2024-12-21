package savitri.sculptor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int bookingno;
private int sculptorid;
private String name,address,mobileno,preftime,emailid;
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}

public Booking(int sculptorid, String name, String address, String mobileno, String preftime, String emailid) {
	super();
	this.sculptorid = sculptorid;
	this.name = name;
	this.address = address;
	this.mobileno = mobileno;
	this.preftime = preftime;
	this.emailid = emailid;
}

public int getBookingno() {
	return bookingno;
}
public void setBookingno(int bookingno) {
	this.bookingno = bookingno;
}
public int getSculptorid() {
	return sculptorid;
}
public void setSculptorid(int sculptorid) {
	this.sculptorid = sculptorid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getPreftime() {
	return preftime;
}
public void setPreftime(String preftime) {
	this.preftime = preftime;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}


}
