package marcowidesott.BackM2W2D1.controllers;

import marcowidesott.BackM2W2D1.entities.Blog;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @GetMapping
    public List<Blog> getBlogs() {

    }

    @GetMapping
    public Blog getSingleBlog() {

    }

    @PostMapping
    public Blog createBlog() {

    }

    @PutMapping
    public Blog modifyingBlog() {

    }

    @DeleteMapping
    public Blog deleteBlog() {

    }

}
