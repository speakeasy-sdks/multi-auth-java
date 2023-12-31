/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.example.MultipleAuthTester.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Car {
    @JsonProperty("name")
    public String name;

    public Car withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("numberPlate")
    public String numberPlate;

    public Car withNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
        return this;
    }
    
    @JsonProperty("ownerEmail")
    public String ownerEmail;

    public Car withOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
        return this;
    }
    
    @JsonProperty("previousOwners")
    public String[] previousOwners;

    public Car withPreviousOwners(String[] previousOwners) {
        this.previousOwners = previousOwners;
        return this;
    }
    
    public Car(@JsonProperty("name") String name, @JsonProperty("numberPlate") String numberPlate, @JsonProperty("ownerEmail") String ownerEmail, @JsonProperty("previousOwners") String[] previousOwners) {
        this.name = name;
        this.numberPlate = numberPlate;
        this.ownerEmail = ownerEmail;
        this.previousOwners = previousOwners;
  }
}
