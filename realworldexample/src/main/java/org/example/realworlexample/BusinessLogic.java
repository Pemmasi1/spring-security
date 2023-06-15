package org.example.realworlexample;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessLogic {

    private DataService dataService;

    public BusinessLogic(DataService dataService) {
        super();
        this.dataService = dataService;
    }


    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
