package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domains.Author;

public interface AuthorRepo extends CrudRepository<Author, Long>{

}
