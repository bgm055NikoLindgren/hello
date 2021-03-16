package com.example.Bookstore;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.Bookstore.domain.User;
import com.example.Bookstore.domain.UserRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UserRepositoryTest {
	@Autowired
	private UserRepository repository;

	@Test
	public void findByUsernameShouldReturnUsername() {
		List<User> users = repository.findByUsername("");
		assertThat(users).hasSize(1);

	}
}