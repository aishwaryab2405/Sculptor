package savitri.sculptor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import savitri.sculptor.model.ContactUs;
import savitri.sculptor.repository.ContactUsRepository;

@Service
public class ContactUsServiceImpl implements ContactUsService{

	@Autowired
	@Qualifier("conRepo")
	private ContactUsRepository conRepo;
	
	@Override
	public ContactUs insertrecord(ContactUs r) {
		// TODO Auto-generated method stub
		return conRepo.save(r);
	}

	@Override
	public List<ContactUs> getAll() {
		// TODO Auto-generated method stub
		return conRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		conRepo.deleteById(ri);	
	}

	@Override
	public ContactUs updaterecord(int i, ContactUs r) {
		// TODO Auto-generated method stub
		Optional<ContactUs> opt=conRepo.findById(i);
		if(opt.isPresent())
		{
			ContactUs rold=opt.get();
			rold.setName(r.getName());
			rold.setEmailid(r.getEmailid());
			rold.setPhone(r.getPhone());
			return conRepo.save(rold);
		}
		return null;
	}

}
