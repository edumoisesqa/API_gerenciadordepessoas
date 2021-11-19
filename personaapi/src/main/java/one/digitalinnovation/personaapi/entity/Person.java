package one.digitalinnovation.personaapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String  fisrtName;

    @Column(nullable = false)
    private String lastName;

    private LocalDate birthDate;

    @Column(nullable = false, unique = true)
    private String  cpf;


    @OneToMany(fetch = FetchType.LAZY, cascade = {})
    private List<Phone> phobes;


}
