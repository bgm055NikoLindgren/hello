package com.example.Bookstore;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;


import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CategoryRepositoryTest {
	@Autowired
	private CategoryRepository repository;

	@Test
	public void findByNameShouldReturnCategory() {
		List<Category> categories = repository.findByName("Horror");
		assertThat(categories).hasSize(1);
		assertThat(categories.get(0).getId()).isEqualTo(0);

	}

	@Test
	public void createNewCategory() {
		Category category = new Category("Comedy");
		repository.save(category);
		assertThat(category.getId()).isNotNull();
	}
}