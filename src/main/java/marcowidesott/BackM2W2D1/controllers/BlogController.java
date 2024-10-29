package marcowidesott.BackM2W2D1.controllers;

import marcowidesott.BackM2W2D1.entities.Blog;
import marcowidesott.BackM2W2D1.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getBlogs() {
        return this.blogService.findAllBlogs();

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
