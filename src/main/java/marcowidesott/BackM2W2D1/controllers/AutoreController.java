package marcowidesott.BackM2W2D1.controllers;

import marcowidesott.BackM2W2D1.entities.Autore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {


    @GetMapping
    public List<Autore> getBlogs() {

    }

    @GetMapping
    public Autore getSingleBlog() {

    }

    @PostMapping
    public Autore createBlog() {

    }

    @PutMapping
    public Autore modifyingBlog() {

    }

    @DeleteMapping
    public Autore deleteBlog() {

    }


}
