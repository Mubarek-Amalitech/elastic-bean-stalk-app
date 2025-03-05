package com.example.Helloworldapp;


import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/")
    public  String  greeting() {
         return

        """
          Chaos theory states in a non-deterministic system  whose
          behaviour is described  as non linear, a small change on  one end  can cause
          significant changes at the other end.
          In short,a butterfly  flapping its wing in Ghana  can cause a tornado in spain
          """ ;

    }



}
