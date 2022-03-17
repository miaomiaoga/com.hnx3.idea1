package com.hnx3.idea1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Idea1Application {

    public static void main(String[] args) {
        SpringApplication.run(Idea1Application.class, args);
    }

    @RestController
    public static class Goahead{
        @RequestMapping("co2")
        public String strCo2()
        {
            return "co2!";
        }
    }
}
