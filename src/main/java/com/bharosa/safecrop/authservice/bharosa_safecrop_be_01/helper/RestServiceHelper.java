package com.bharosa.safecrop.authservice.bharosa_safecrop_be_01.helper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestServiceHelper {
    
    private final RestTemplate restTemplate;

    public RestServiceHelper(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Object createPost(Object t) {
        String url = "https://jsonplaceholder.typicode.com/posts";
    
        // create headers
        //HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        //headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        //headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    
        // create a map for post parameters
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1);
        map.put("title", "Introduction to Spring Boot");
        map.put("body", "Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications.");
    
        // build the request
        //HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
    
        // send POST request
        //ResponseEntity<Object> response = this.restTemplate.postForEntity(url, entity, Post.class);
    
        // check response status code
        /* if (response.getStatusCode() == HttpStatus.CREATED) {
            return response.getBody();
        } else {
            return null;
        } */
        return null;
    }
}
