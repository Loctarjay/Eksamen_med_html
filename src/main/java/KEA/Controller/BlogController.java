package KEA.Controller;

import KEA.Model.Comment;
import KEA.Model.Post;
import KEA.Repository.CommentRepository;
import KEA.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/posts")
    public @ResponseBody
    Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public @ResponseBody
    Optional<Post> getPost(@PathVariable("id") String id) {
        return postRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/posts")
    public @ResponseBody
    String add(@ModelAttribute Post p) {
        postRepository.save(p);
        return "{Resource Added }";
    }

    @PutMapping("/posts")
    public @ResponseBody
    String update(@ModelAttribute Post p) {
        postRepository.save(p);
        return "Resource updated or added";
    }

    @DeleteMapping("/posts/{id}")
    public @ResponseBody
    String delete(@PathVariable("id") String id) {
        postRepository.deleteById(Long.valueOf(id));

        return "Resource deleted";
    }

    @GetMapping("/comments")
    public @ResponseBody
    Iterable<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @GetMapping("/comments/{id}")
    public @ResponseBody
    Optional<Comment> getComment(@PathVariable("id") String id) {
        return commentRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/comments")
    public @ResponseBody
    String addComment(@ModelAttribute Comment c) {
        commentRepository.save(c);
        return "Comment Added";
    }

    @PutMapping("/comments")
    public @ResponseBody
    String updateComment(@ModelAttribute Comment c) {
        commentRepository.save(c);
        return "Comment updated or added";
    }

    @DeleteMapping("/comments/{id}")
    public @ResponseBody
    String deleteComment(@PathVariable("id") String id) {
        commentRepository.deleteById(Long.valueOf(id));

        return "Comment deleted";
    }
}
