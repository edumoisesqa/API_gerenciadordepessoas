package one.digitalinnovation.personaapi.controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personaapi.PersonService.PersonService;
import one.digitalinnovation.personaapi.dto.MessagerResponseDTO;
import one.digitalinnovation.personaapi.dto.request.PersonDTO;
import one.digitalinnovation.personaapi.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")

public class PersonController {

private PersonService personService;

@Autowired
public PersonController(PersonService personService){
    this.personService = personService;
}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessagerResponseDTO createPerson (@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }}




