package savitri.sculptor.service;

import java.util.List;

import savitri.sculptor.model.AdminLogin;

public interface AdminLoginService {
List<AdminLogin> login(String email,String password);
}
