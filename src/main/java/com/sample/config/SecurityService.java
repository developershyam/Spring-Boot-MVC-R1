package com.sample.config;
/**
 * This interface is designed for application related securities.
 * 
 * @author shyam.pareek
 *
 */
public interface SecurityService {

	String findLoggedInEmail();
	void autologin(String email, String password);
}
