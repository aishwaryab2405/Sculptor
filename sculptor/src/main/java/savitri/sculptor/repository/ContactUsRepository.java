package savitri.sculptor.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import savitri.sculptor.model.ContactUs;

@Repository
@Qualifier("conRepo")
public interface ContactUsRepository extends JpaRepository<ContactUs, Integer>{

}
