package savitri.sculptor.service;

import java.util.List;

import savitri.sculptor.model.Booking;

public interface BookingService {
Booking save(Booking bn);
List<Booking> getall();
}
