package savitri.sculptor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import savitri.sculptor.model.Booking;
import savitri.sculptor.model.Feedback;
import savitri.sculptor.service.BookingService;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping("/booking/")
public class BookingController {

	@Autowired
	private BookingService bnserv;
	@GetMapping("/bookings")
	public List<Booking> handleget()
	{
		return bnserv.getall();
	}
	@PostMapping("/addbook")
	public Booking add(@RequestBody Booking r)
	{
		return bnserv.save(r);
	}
}
