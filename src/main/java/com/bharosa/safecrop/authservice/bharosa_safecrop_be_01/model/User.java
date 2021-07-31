package com.bharosa.safecrop.authservice.bharosa_safecrop_be_01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Simple User object for our API to return a user.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userName;
    private String email;
    private Message msg;
    
}
