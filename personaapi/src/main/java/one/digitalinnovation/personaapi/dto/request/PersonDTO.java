package one.digitalinnovation.personaapi.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;


import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {


    private  Long Id;

    @Size(min =2, max = 100)
    private String firstName;

    @NotEmpty
    @CPF
    private String cpf;

    @Size(min =2, max = 100)
    private String lastname;

    private LocalDate birthDate;

    @Valid
    @NotEmpty
    private List<PhonesDTO> phones;

}
