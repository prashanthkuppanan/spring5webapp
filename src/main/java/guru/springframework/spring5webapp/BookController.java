package guru.springframework.spring5webapp;

import org.springframework.web.bind.annotation.GetMapping;

public class BookController {

	@GetMapping("/books")
	public int getBook() {
		return 4;
	}
}
