package guru.springframework.spring5webapp;

import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domains.Author;
import guru.springframework.spring5webapp.domains.Book;
import guru.springframework.spring5webapp.domains.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepo;
import guru.springframework.spring5webapp.repository.BookRepo;
import guru.springframework.spring5webapp.repository.PublisherRepo;

import org.springframework.boot.CommandLineRunner;

@Component
public class Bootstrap implements CommandLineRunner {

	public PublisherRepo publisherRepo;
	public AuthorRepo authorRepo;
	public BookRepo bookRepo;
	

	public Bootstrap(PublisherRepo publisherRepo, AuthorRepo authorRepo, BookRepo bookRepo ) {
		super();
		this.publisherRepo = publisherRepo;
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Author author = new Author("Prashanth","Kuppanan");
		
		Book book1= new Book("Modern Operating System", "12313s234234");
		Book book2 = new Book("Advanced Mathematics", "383738hsdfj234");
		
		author.getBooks().add(book1);
		
		book1.getAuthors().add(author);
		book2.getAuthors().add(author);
		
		Publisher pub = new Publisher("Pearson publication", "Don Avenue", "California", "Gorgeia", "09878");
		book1.setPublisher(pub);
		book2.setPublisher(pub);
		authorRepo.save(author);
		publisherRepo.save(pub);
		bookRepo.save(book1);
		bookRepo.save(book2);
	
		
		System.out.println("Publisher Count :: " + publisherRepo.count() + "\n Book :: " + bookRepo.count());
	}

}
