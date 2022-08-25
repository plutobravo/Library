package com.library.library.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.library.library.entities.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {
	@Query("{'bookName': ?0}")
	Book findByBookName(String bookName);

}
