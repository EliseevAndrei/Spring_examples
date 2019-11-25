package com.mycompany.app.tacos;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Data
public class DiscountCodeProps {

    private Map<String, Integer> codes = new HashMap<>();

}
