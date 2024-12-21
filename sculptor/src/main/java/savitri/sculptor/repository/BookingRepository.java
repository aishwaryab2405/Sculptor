package savitri.sculptor.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import savitri.sculptor.model.Booking;

@Repository
@Qualifier("bnRepo")
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
