package no.jamesb.examples.telenor.todo.controllers;

import no.jamesb.examples.telenor.todo.models.CachedUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controls the Greeter API.
 */
@RestController
public class HelloController {
  @Autowired
  private SessionFactory sessionFactory;

  /** Greet someone and do something else. */
  @GetMapping("/{name}")
  public String greet(@PathVariable("name") String name) {
    Session session = this.sessionFactory.openSession();
    session.beginTransaction();
    session.persist(CachedUser.create(1, "James", "Bradlee", "James Bradlee", null));
    session.getTransaction().commit();
    session.close();
    return "Hello, " + name + "!";
  }
}
