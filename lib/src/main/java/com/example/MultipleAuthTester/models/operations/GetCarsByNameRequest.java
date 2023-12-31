/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.example.MultipleAuthTester.models.operations;

import com.example.MultipleAuthTester.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetCarsByNameRequest {
    /**
     * Name of a Car
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;

    public GetCarsByNameRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    public GetCarsByNameRequest(@JsonProperty("name") String name) {
        this.name = name;
  }
}
