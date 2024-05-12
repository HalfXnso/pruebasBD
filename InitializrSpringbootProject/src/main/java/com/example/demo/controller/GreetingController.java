package com.example.demo.controller;

import com.example.demo.entity.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
private static final String template ="Hello, %s";
private final AtomicLong counter = new AtomicLong();
    @GetMapping("/pruebas")
public double averquepasa(@RequestParam double dato1, @RequestParam double dato2 ) {
   double resultado = dato1+dato2;
    return resultado;
}
@GetMapping("/saludo")
public Greeting helloWorld(@RequestParam(value = "name", defaultValue = "World")String name){
    return new Greeting(counter.incrementAndGet(), String.format(template,name));

}
}
