package marcowidesott.BackM2W2D1.payloads;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class AutorePayload {
    private String name;
    private String surname;
    private String email;
    private LocalDate dataDiNascita;

    public AutorePayload(LocalDate dataDiNascita, String email, String surname, String name) {
        this.dataDiNascita = dataDiNascita;
        this.email = email;
        this.surname = surname;
        this.name = name;
    }
}
