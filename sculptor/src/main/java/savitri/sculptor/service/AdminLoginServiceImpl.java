package savitri.sculptor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import savitri.sculptor.model.AdminLogin;
import savitri.sculptor.repository.AdminLoginRepository;
@Service
public class AdminLoginServiceImpl implements AdminLoginService{
    @Autowired
    @Qualifier("admRepo")
    private AdminLoginRepository admRepo;
	@Override
	public List<AdminLogin> login(String email, String password) {
		// TODO Auto-generated method stub
		return admRepo.findAllByEmailAndPassword(email, password);
	}

}
