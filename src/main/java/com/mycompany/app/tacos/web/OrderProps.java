package com.mycompany.app.tacos.web;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Component
@Data
// end::notValidated[]
@Validated
//tag::notValidated[]
public class OrderProps {

    //end::notValidated[]
    @Min(value=5, message="must be between 5 and 25")
    @Max(value=25, message="must be between 5 and 25")
//tag::notValidated[]
    private int pageSize = 20;

}