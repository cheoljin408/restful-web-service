package com.example.restfulwebservice.helloworld;

import com.example.restfulwebservice.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // GET
    // /hello-world (endpoint)
    @GetMapping("/hello-world")
    public String helloworld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloworldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloworldBean(@PathVariable  String name) {
        return new HelloWorldBean(
                String.format("Hello World, %s", name));
    }

}
