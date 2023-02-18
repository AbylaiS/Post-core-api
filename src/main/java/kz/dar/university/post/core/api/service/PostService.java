package kz.dar.university.post.core.api.service;

import kz.dar.university.post.core.api.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;

@Service
public class PostService implements IPostService {
    HashMap<String, PostModel> postMap = new HashMap<>();

    {
        PostModel post= new PostModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(),
                "On the way", UUID.randomUUID().toString(), "Post received");

        postMap.put(post.getPostId(),post);
    }
    @Override
    public PostModel createPost(PostModel post) {
       return postMap.put(post.getPostId(),post);
    }

    @Override
    public void createClient(PostModel post) {
        postMap.put(post.getClientId(), post);
    }

    @Override
    public HashMap<String, PostModel> getAllPosts() {
        return postMap;
    }

    @Override
    public PostModel getClientById(String postId) {
        return postMap.get(postId);
    }


    @Override
    public PostModel getPostById(String postClient) {
        return postMap.get(postClient);
    }

    @Override
    public PostModel getStatus(String postStatus) {
        return postMap.get(postStatus);
    }

    @Override
    public void updatePost(PostModel post) {

    }

    @Override
    public void updateClient(PostModel client) {

    }

    @Override
    public void deleteClientById(String clientId) {

        postMap.remove(clientId);

    }

    @Override
    public void deletePostById(String postId) {

        postMap.remove(postId);

    }
}
