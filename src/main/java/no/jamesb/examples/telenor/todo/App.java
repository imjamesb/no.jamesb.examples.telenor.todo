package no.jamesb.examples.telenor.todo;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/** The root Application object for the project. */
@SpringBootApplication
public class App {
  public static void main(String[] args) throws BeansException, IllegalStateException, Exception {
    ConfigurableApplicationContext app = SpringApplication.run(App.class, args);
    app.getBeanFactory().autowireBean(App.sessionFactory());
  }

  /**
   * Create a session factory.
   */
  @Bean
  public static SessionFactory sessionFactory() throws Exception {
    final StandardServiceRegistry registry =
        new StandardServiceRegistryBuilder().configure(new File("hibernate.cfg.xml")).build();
    try {
      return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    } catch (Exception e) {
      StandardServiceRegistryBuilder.destroy(registry);
      throw e;
    }
  }
}
