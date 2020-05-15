package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domains.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Long>{

	
}
