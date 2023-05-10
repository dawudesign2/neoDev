package com.example.demo.controllers;

import com.example.demo.entities.Person;
import com.example.demo.services.PersonImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class apiController {

    final PersonImpl personImpl;

    public apiController(PersonImpl personImpl) {
        this.personImpl = personImpl;
    }

    @GetMapping("/person")
    public List<Person> index () {
        return personImpl.getAllPersons();
    }

    @GetMapping("/person/{id}")
    public Person show (@PathVariable Long id) {
        return personImpl.getPersonById(id);
    }

    @PostMapping("/person")
    public Person create (@RequestBody Person person) {
        return personImpl.savePerson(person);
    }

    @PutMapping("/person/{id}")
    public Person update (@PathVariable Long id, @RequestBody Person person) {
        person.setId(id);
        return personImpl.updatePerson(person);
    }

    @DeleteMapping("person/{id}")
    public boolean delete (@PathVariable Long id) {
        personImpl.deletePerson(id);
        return true;
    }
}
