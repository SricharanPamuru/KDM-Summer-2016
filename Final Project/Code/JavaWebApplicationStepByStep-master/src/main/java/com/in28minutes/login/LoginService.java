package com.in28minutes.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("team6") && password.equals("kabali"))
			return true;

		return false;
	}

}
