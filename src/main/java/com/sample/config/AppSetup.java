package com.sample.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.sample.data.repository.RoleRepository;
import com.sample.data.repository.UserRepository;

/**
 * This class is designed to setup initial configurations.
 * 
 * @author shyam.pareek
 *
 */
@Component
public class AppSetup {

	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;

	@Autowired
	@Qualifier("transactionManager")
	protected PlatformTransactionManager transactionManager;

	@PostConstruct
	public void init() {

		TransactionTemplate tmpl = new TransactionTemplate(transactionManager);
		tmpl.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				// PUT YOUR CALL TO SERVICE HERE

				// Role role1 = new Role();
				// role1.setId(1l);
				// role1.setRole("ROLE_ADMIN");
				// roleRepository.save(role1);

				// Role role1 = roleRepository.findOne(1l);
				// User user1 = new User("Shyam", "shyam@g.com","123456", true);
				// Set<Role> roles = new HashSet<>();
				// roles.add(role1);
				// user1.setRoles(roles);
				// userRepository.save(user1);

			}
		});

	}
}
