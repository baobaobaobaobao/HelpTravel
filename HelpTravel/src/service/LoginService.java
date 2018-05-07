package service;

import java.util.List;



import po.Users;;



public interface LoginService {
	
	public Users loginTest(Users user) throws Exception;
	public int  registerUser(Users user) ;
}
