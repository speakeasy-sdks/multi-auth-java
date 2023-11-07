/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.example.MultipleAuthTester.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetCarsByIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetCarsByIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * error payload
     */
    
    public com.example.MultipleAuthTester.models.shared.ErrorModel errorModel;

    public GetCarsByIdResponse withErrorModel(com.example.MultipleAuthTester.models.shared.ErrorModel errorModel) {
        this.errorModel = errorModel;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetCarsByIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetCarsByIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * car response
     */
    
    public com.example.MultipleAuthTester.models.shared.Car[] classes;

    public GetCarsByIdResponse withClasses(com.example.MultipleAuthTester.models.shared.Car[] classes) {
        this.classes = classes;
        return this;
    }
    
    public GetCarsByIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
