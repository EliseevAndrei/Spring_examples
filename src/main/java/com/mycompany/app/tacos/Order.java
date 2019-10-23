package com.mycompany.app.tacos;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@Data
public class Order {

    @NotBlank(message="is Required")
    private String name;
    @NotBlank(message="is Required")
    private String street;
    @NotBlank(message="is Required")
    private String city;
    @NotBlank(message="is Required")
    private String state;
    @NotBlank(message="is Required")
    private String zip;
    @NotBlank(message="is Required")
    private String ccNumber;
    @NotBlank(message="is Required")
    private String ccExpiration;
    @Digits(integer = 3, fraction=0, message="invalid cvv")
    private String ccCVV;
}