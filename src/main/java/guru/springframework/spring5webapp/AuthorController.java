package guru.springframework.spring5webapp;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.domains.Author;
import guru.springframework.spring5webapp.repository.AuthorRepo;

@Controller
public class AuthorController {

	public AuthorRepo authorRepo;

	public AuthorController(AuthorRepo authorRepo) {
		super();
		this.authorRepo = authorRepo;
	}
	
	@RequestMapping("/authors")
	public List<Author> findAll() {
		return (List<Author>) authorRepo.findAll();
	}
}
