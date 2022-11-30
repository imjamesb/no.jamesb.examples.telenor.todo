package no.jamesb.examples.telenor.todo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controls the Greeter API.
 */
@RestController
public class HelloController {
  @GetMapping("/{name}")
  public String greet(@PathVariable("name") String name) {
    return "Hello, " + name + "!";
  }
}
