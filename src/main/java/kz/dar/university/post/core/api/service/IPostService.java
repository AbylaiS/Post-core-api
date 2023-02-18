package kz.dar.university.post.core.api.service;

import kz.dar.university.post.core.api.model.PostModel;

import java.util.HashMap;

public interface IPostService {
    PostModel createPost(PostModel post);

    void createClient(PostModel post);

    HashMap<String, PostModel> getAllPosts();

    PostModel getClientById(String post);

    PostModel getPostById(String post);

    PostModel getStatus(String post);

    void updatePost(PostModel post);

    void updateClient(PostModel client);

    void deleteClientById(String post);

    void deletePostById(String post);
}
