package com.campipal.campipal.service;

import com.campipal.campipal.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    private final String URI = "https://jsonplaceholder.typicode.com";
    private static final Logger logger = LoggerFactory.getLogger(PostService.class);
    public List<Post> getPosts(){
        RestTemplate restTemplate = new RestTemplate();
        List<Post> posts = new ArrayList<>();

        try{
            //Post[] postArray =  restTemplate.getForEntity(URI + "/posts", Post[].class).getBody();
            ResponseEntity<Post[]> response = restTemplate.getForEntity(URI + "/posts", Post[].class);
            if (response.getStatusCode().is2xxSuccessful()) {
                Post[] postArray = response.getBody();
                if (postArray != null) {
                    posts = Arrays.asList(postArray);
                }
            } else {
                logger.warn("API call to fetch posts returned a non-successful status code: {}", response.getStatusCode());
            }
        }catch(Exception exception){
            System.err.println("Error while fetching posts: " + exception.getMessage());
            logger.error("Error while fetching posts from the API: {}", exception.getMessage(), exception);
        }

        return posts;
    }
}
