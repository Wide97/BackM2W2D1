package marcowidesott.BackM2W2D1.services;

import marcowidesott.BackM2W2D1.entities.Autore;
import marcowidesott.BackM2W2D1.payloads.AutorePayload;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {
    private List<Autore> autoreList = new ArrayList<>();

    public List<Autore> findallAuthors() {
        return this.autoreList;
    }

    public Autore saveAuthor(AutorePayload body) {
        Random rndm = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate dataDiNascita = LocalDate.parse("12 08 1980", formatter);
        Autore autore = new Autore(body.getName(), body.getSurname(), body.getEmail(), dataDiNascita);
        autore.setId(rndm.nextLong(1, 1000));
        this.autoreList.add(autore);
        return autore;

    }
}
