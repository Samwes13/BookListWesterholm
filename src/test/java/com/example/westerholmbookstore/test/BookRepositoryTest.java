package com.example.westerholmbookstore.test;

/*import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.westerholmbookstore.WesterholmBookStoreApplication;
import com.example.westerholmbookstore.domain.Book;
import com.example.westerholmbookstore.domain.CategoryRepository;
import com.example.westerholmbookstore.domain.bookstorereposity;




@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = WesterholmBookStoreApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class BookRepositoryTest {
@Autowired
private bookstorereposity repository;
@Autowired
private CategoryRepository crepository;

@Test
public void createNewBook() {
Book book = new Book("Paul Trembley", "A Head Full of Ghosts", "2015","ISBN434345621394", "16.30",
 crepository.findByName("History").get(0));
repository.save(book);
assertThat(book.getId()).isNotNull();
}
@Test
public void deleteBookByTitle() {
    
    List<Book> books = repository.findByTitle("John");
    assertThat(books).isNotEmpty();
    Book bookToDelete = books.get(0);
    repository.delete(bookToDelete);
    List<Book> booksByJohnson = repository.findByTitle("John");
    assertThat(booksByJohnson).hasSize(0);
}


@Test
public void findByTitle() {
    List<Book> book = repository.findByTitle("Paul");
    assertThat(book.get(0).getAuthor()).isEqualTo("Jokela");
}


}*/