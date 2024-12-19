package savitri.sculptor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContactUs {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int contactusid;

private String name,emailid,phone;

public ContactUs() {
	super();
	// TODO Auto-generated constructor stub
}

public ContactUs(String name, String emailid, String phone) {
	super();
	this.name = name;
	this.emailid = emailid;
	this.phone = phone;
}

public int getContactusid() {
	return contactusid;
}

public void setContactusid(int contactusid) {
	this.contactusid = contactusid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

@Override
public String toString() {
	return "ContactUs [contactusid=" + contactusid + ", name=" + name + ", emailid=" + emailid + ", phone=" + phone
			+ "]";
}

}
