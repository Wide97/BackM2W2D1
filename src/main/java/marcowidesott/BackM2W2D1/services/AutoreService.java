package marcowidesott.BackM2W2D1.services;

import marcowidesott.BackM2W2D1.entities.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoreService {
    private List<Autore> autoreList = new ArrayList<>();

    public List<Autore> findallAuthors() {
        return this.autoreList;
    }
}
