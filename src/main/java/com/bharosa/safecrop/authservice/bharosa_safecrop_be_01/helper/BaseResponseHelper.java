package com.bharosa.safecrop.authservice.bharosa_safecrop_be_01.helper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Simple BaseResponse object for our API to return a BaseResponse.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class BaseResponseHelper<T> {
    private String timestamp = String.valueOf(System.currentTimeMillis());
	private int status;
    private String error;
    private String message;
    private T data;

    public BaseResponseHelper(String timestamp, int status, String message, T data) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.data = data;
    }  

    
}
