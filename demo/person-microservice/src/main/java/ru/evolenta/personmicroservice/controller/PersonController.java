package ru.evolenta.personmicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.evolenta.personmicroservice.model.Person;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private List<Person> people = Arrays.asList(
            new Person(1, "Иванов Иван Иванович", 33),
            new Person(2, "Петров Пётр Петрович", 54),
            new Person(3, "Сидорова Мария Ивановна", 22)
    );

    @GetMapping("/{id}")
    public ResponseEntity<Person> person(@PathVariable int id) {
        return new ResponseEntity<>(people.get(id), HttpStatus.OK);
    }

}
