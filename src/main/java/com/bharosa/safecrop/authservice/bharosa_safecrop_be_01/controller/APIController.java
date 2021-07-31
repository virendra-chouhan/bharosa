/**
 * This is APIController for AuthService for safecrop_backend_v0.1
 * all rights are reserved by Baelworks Innovations Pvt. Ltd. from @2021
 */

package com.bharosa.safecrop.authservice.bharosa_safecrop_be_01.controller;

import java.util.Arrays;
import java.util.List;

import com.bharosa.safecrop.authservice.bharosa_safecrop_be_01.helper.BaseResponseHelper;
import com.bharosa.safecrop.authservice.bharosa_safecrop_be_01.model.Message;
import com.bharosa.safecrop.authservice.bharosa_safecrop_be_01.model.User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

/**
 * Handles requests to "/api/v1" endpoints.
 * @see security.SecurityConfig to see how these endpoints are protected.
 */
@RestController
@RequestMapping(path = "api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
// For simplicity of this sample, allow all origins. Real applications should configure CORS for their use case.
@CrossOrigin(origins = "*")
@Data
public class APIController {
    
    private static Logger logger = LogManager.getLogger(APIController.class);
    
    @GetMapping(value = "/public")
    public BaseResponseHelper<List<User>> publicEndpoint() { 
        List<User> checkRes =  Arrays.asList(new User("Ankit Jain", "ankitjain@ssism.org", null));
        logger.trace("publicEndpoint started!");
        if(checkRes.size()>0)
        {
            return new BaseResponseHelper<List<User>>("", HttpStatus.OK.value(), "yeeeeeeeee its working..!!!",  checkRes);
        }else
        {
            return new BaseResponseHelper<List<User>>("", HttpStatus.BAD_REQUEST.value(), "Oh no!!!", checkRes);
        }
    }

    @GetMapping(value = "/private-test")
    public Message privateEndpoint() {
        return new Message("All good. You can see this because you are Authenticated.", 1);
    }

    @GetMapping(value = "/private-scoped")
    public Message privateScopedEndpoint() {
        return new Message("All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope", 1);
    }

}