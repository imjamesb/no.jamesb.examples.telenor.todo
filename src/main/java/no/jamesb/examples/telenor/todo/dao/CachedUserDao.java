package no.jamesb.examples.telenor.todo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import no.jamesb.examples.telenor.todo.models.CachedUser;
import org.springframework.stereotype.Component;

/** The data access object for the cached user model. */
@Component
public class CachedUserDao {
  @PersistenceContext
  private EntityManager em;

  public void persist(CachedUser user) {
    this.em.persist(user);
  }
}
