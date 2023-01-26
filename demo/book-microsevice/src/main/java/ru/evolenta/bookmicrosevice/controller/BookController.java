package ru.evolenta.bookmicrosevice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.evolenta.bookmicrosevice.model.Book;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private List<Book> books = Arrays.asList(
            new Book(1, "Гарри Поттер и методы рационального мышления", "Фэнтези", "Элиезер Юдковский"),
            new Book(2, "Война и мир", "Роман-эпопея", "Лев Николаевич Толстой"),
            new Book(3, "Солярис", "Научная фантастика", "Станислав Лем")
    );

    @GetMapping("/{id}")
    public ResponseEntity<Book> person(@PathVariable int id) {
        return new ResponseEntity<>(books.get(id), HttpStatus.OK);
    }
}
