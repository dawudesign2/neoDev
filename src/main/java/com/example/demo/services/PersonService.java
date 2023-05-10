package com.example.demo.services;

import com.example.demo.entities.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();
    Person getPersonById(Long id);
    Person savePerson(Person person);
    Person updatePerson(Person person);
    void deletePerson(Long id);


}
