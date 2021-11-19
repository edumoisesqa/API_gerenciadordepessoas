package one.digitalinnovation.personaapi.controller;

import one.digitalinnovation.personaapi.dto.MessagerResponseDTO;
import one.digitalinnovation.personaapi.entity.Person;
import one.digitalinnovation.personaapi.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonaController {

    private PersonaRepository personaRepository;

    @Autowired
    public PersonaController(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    @PostMapping
    public MessagerResponseDTO createPerson(@RequestBody Person person) {
        Person savePerson = personaRepository.save(person);
        return MessagerResponseDTO.builder()
                            .message("Created person with ID" + savePerson.getId())
                            .build();
}}