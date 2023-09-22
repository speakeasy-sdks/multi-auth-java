/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.example.MultipleAuthTester.models.operations;

import com.example.MultipleAuthTester.utils.SpeakeasyMetadata;


public class GetCarsByIdSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=query,name=api_key")
    public String apiKey;

    public GetCarsByIdSecurity withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic")
    public com.example.MultipleAuthTester.models.shared.SchemeHTTPBasic httpBasic;

    public GetCarsByIdSecurity withHttpBasic(com.example.MultipleAuthTester.models.shared.SchemeHTTPBasic httpBasic) {
        this.httpBasic = httpBasic;
        return this;
    }
    
    public GetCarsByIdSecurity(){}
}