package com.example.Bookstore;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookRepositoryTest {
 @Autowired
 private BookRepository repository;
 
 @Test
public void findByTitleShouldReturnBook() {
	 List<Book> books = repository.findByTitle("Moi");
	 assertThat(books).hasSize(1);
	 assertThat(books.get(0).getAuthor()).isEqualTo("Eemeli");
 }

 @Test
 public void createNewBook() {
	 Book book = new Book("Niko", "Love", 2020, "123465-7", new Category("Love"));
	 repository.save(book);
	 assertThat(book.getId()).isNotNull();
 }
 
}
