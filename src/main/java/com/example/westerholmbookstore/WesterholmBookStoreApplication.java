package com.example.westerholmbookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.westerholmbookstore.domain.bookstorereposity;
import com.example.westerholmbookstore.domain.AppUser;
import com.example.westerholmbookstore.domain.AppUserRepository;
import com.example.westerholmbookstore.domain.Book;
import com.example.westerholmbookstore.domain.Category;
import com.example.westerholmbookstore.domain.CategoryRepository;

@SpringBootApplication
public class WesterholmBookStoreApplication {
    private static final Logger log = LoggerFactory.getLogger(WesterholmBookStoreApplication.class);
    
    public static void main(String[] args) {
        SpringApplication.run(WesterholmBookStoreApplication.class, args);
    } 

    @Bean
    public CommandLineRunner demo(bookstorereposity repository, CategoryRepository crepository, AppUserRepository urepository) {
        return (args) ->{
            crepository.save(new Category("History"));
            crepository.save(new Category("Humor"));
            crepository.save(new Category("Drama"));
            crepository.save(new Category("Action"));
            crepository.save(new Category("Sci-fi"));
            
            // Create users: admin/admin user/user
            AppUser user1 = new AppUser("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER", "user@haagahelia.fi");
            AppUser user2 = new AppUser("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ROLE_ADMIN", "admin@haagahelia.fi");
            urepository.save(user1);
            urepository.save(user2);
            
            log.info("fetch all Books");
            for (Book book : repository.findAll()) {
                log.info(book.toString());
            }
        };
    }
} 
