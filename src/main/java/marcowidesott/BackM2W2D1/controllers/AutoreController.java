package marcowidesott.BackM2W2D1.controllers;

import marcowidesott.BackM2W2D1.entities.Autore;
import marcowidesott.BackM2W2D1.payloads.AutorePayload;
import marcowidesott.BackM2W2D1.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;


    @GetMapping
    public List<Autore> getAuthor() {
        return this.autoreService.findallAuthors();

    }

    // @GetMapping
    //public Autore getSingleAuthor() {

    // }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore createAuthor(@RequestBody AutorePayload body) {
        return this.autoreService.saveAuthor(body);
    }

    // @PutMapping
    //public Autore modifyingAuthor() {

    //}

    //@DeleteMapping
    // public Autore deleteAuthor() {

    // }


}
