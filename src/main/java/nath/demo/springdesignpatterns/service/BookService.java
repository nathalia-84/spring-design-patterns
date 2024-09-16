package nath.demo.springdesignpatterns.service;

import nath.demo.springdesignpatterns.model.BookResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bookService", url = "https://openlibrary.org")
public interface BookService {
    @GetMapping("/subjects/{subject}.json?published_in=1924-2024")
    BookResponse getBooksBySubject(@PathVariable("subject") String subject);
}
