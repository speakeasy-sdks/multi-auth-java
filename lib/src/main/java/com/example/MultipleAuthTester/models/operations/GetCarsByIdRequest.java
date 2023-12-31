/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.example.MultipleAuthTester.models.operations;

import com.example.MultipleAuthTester.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetCarsByIdRequest {
    /**
     * ID of a person
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Long id;

    public GetCarsByIdRequest withId(Long id) {
        this.id = id;
        return this;
    }
    
    public GetCarsByIdRequest(@JsonProperty("id") Long id) {
        this.id = id;
  }
}
