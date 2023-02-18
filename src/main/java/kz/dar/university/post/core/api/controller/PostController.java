package kz.dar.university.post.core.api.controller;

import kz.dar.university.post.core.api.model.PostModel;
import kz.dar.university.post.core.api.service.IPostService;
import kz.dar.university.post.core.api.service.PostService;
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

    @GetMapping("/all")
    public HashMap<String , PostModel> getAllPosts(){

        return postService.getAllPosts();
    }

    @PostMapping("/all")
    public PostModel createPost(@RequestBody  @Valid PostModel post) {

       return postService.createPost(post);

    }

    @PostMapping
    public void createClient(@RequestBody @Valid PostModel post){

        postService.createClient(post);
    }

    @GetMapping("/getClientById")
    public void getClientById(@RequestParam String clientId){
        postService.getClientById(clientId);
    }

    @GetMapping("/{postId}")
    public void getPostById(@RequestParam String postId){
        postService.getPostById(postId);
    }

    @GetMapping
    public void getStatus(@RequestParam String status){
        postService.getStatus(status);
    }

    @PutMapping("/postId")
    public void updatePost(@PathVariable String postId, @RequestBody PostModel post){

        post.setPostId(postId);
        postService.updatePost(post);

    }


    @PutMapping("/clientId")
    public void clientPost(@PathVariable String clientId, @RequestBody PostModel client){

        client.setClientId(String.valueOf(client));
        postService.updateClient(client);

    }

    @DeleteMapping("/{postId}")
    public void deletePostById(@PathVariable String postById){
        postService.deletePostById(postById);
    }

    @DeleteMapping("/clientId")
    public void deleteClientById(@PathVariable String clientById){
        postService.deleteClientById(clientById);
    }
}
