package savitri.sculptor.service;

import java.util.List;

import savitri.sculptor.model.ContactUs;
import savitri.sculptor.model.Registration;

public interface ContactUsService {
	ContactUs insertrecord(ContactUs r);
	List<ContactUs> getAll();
	void del (int ri);
	ContactUs updaterecord(int i,ContactUs r);

}
