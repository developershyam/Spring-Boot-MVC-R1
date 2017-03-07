package com.sample.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sample.data.model.Role;
import com.sample.data.model.User;
import com.sample.data.repository.RoleRepository;
import com.sample.data.repository.UserRepository;

/**
 * This class is used to implement business logic for application related user.
 * 
 * @author shyam.pareek
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<User> getUsers() {

		List<User> users = new ArrayList<>();

		userRepository.findAll().forEach(users::add);

		return users;
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void save(User user) {
		Set<Role> roles = new HashSet<>();
		roleRepository.findAll().forEach(roles::add);
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roles);
		userRepository.save(user);
	}

}
