package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domains.Book;

public interface BookRepo extends CrudRepository<Book, Long>{

}
