package one.digitalinnovation.personaapi.PersonService;

import one.digitalinnovation.personaapi.dto.MessagerResponseDTO;

import one.digitalinnovation.personaapi.dto.request.PersonDTO;
import one.digitalinnovation.personaapi.entity.Person;
import one.digitalinnovation.personaapi.mapper.PersonMapper;
import one.digitalinnovation.personaapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personaRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService( PersonRepository personRepository){
        this.personaRepository = personRepository;
    }

    public MessagerResponseDTO createPerson( PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson =personaRepository.save(personToSave);
        return  MessagerResponseDTO
                .builder()
                .message(" Created person wiht ID " + savedPerson.getId())
                .build();
    }

}
