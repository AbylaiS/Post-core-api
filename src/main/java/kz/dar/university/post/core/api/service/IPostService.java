package kz.dar.university.post.core.api.service;

import kz.dar.university.post.core.api.model.PostModel;

import java.util.HashMap;

public interface IPostService {
    PostModel createPost(PostModel post);

    HashMap<String, PostModel> getAllPosts();

    PostModel getPostById(String post);

    PostModel getStatus(String post);

    void updatePost(PostModel post);

    void deletePostById(String post);
}
