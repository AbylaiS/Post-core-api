package kz.dar.university.post.core.api.controller;

import kz.dar.university.post.core.api.model.PostModel;
import kz.dar.university.post.core.api.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {


    @Autowired
    private IPostService postService;

    @GetMapping("/check")
    public String check(){

        return  "post-core-api is working";

    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts(){

        return (List<PostModel>) postService.getAllPosts();
    }

    @PostMapping("/post")
    public PostModel createPost(@RequestBody  @Valid PostModel post) {

       return postService.createPost(post);

    }



    @GetMapping
    public PostModel getPostById(@RequestParam String postId){
       return postService.getPostById(postId);
    }

    @GetMapping("/status")
    public void getStatus(@PathVariable String status){
        postService.getStatus(status);
    }

    @PutMapping("/{postId}")
    public void updatePost(@PathVariable String postId, @RequestBody PostModel post){

        post.setPostId(postId);
        postService.updatePost(post);

    }

    @DeleteMapping("/{postId}")
    public void deletePostById(@PathVariable String postId){
        postService.deletePostById(postId);
    }
}
