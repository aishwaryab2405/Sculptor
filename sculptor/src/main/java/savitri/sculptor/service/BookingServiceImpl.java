package savitri.sculptor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import savitri.sculptor.model.Booking;
import savitri.sculptor.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	@Qualifier("bnRepo")
	private BookingRepository bnRepo;
	@Override
	public Booking save(Booking bn) {
		// TODO Auto-generated method stub
		return bnRepo.save(bn);
	}

	@Override
	public List<Booking> getall() {
		// TODO Auto-generated method stub
		return bnRepo.findAll();
	}

}
