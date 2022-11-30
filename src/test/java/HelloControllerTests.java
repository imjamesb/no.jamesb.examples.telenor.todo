import static org.junit.jupiter.api.Assertions.assertEquals;

import no.jamesb.examples.telenor.todo.App;
import no.jamesb.examples.telenor.todo.controllers.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

/** Test the hello controller. */
@SpringBootTest(webEnvironment = WebEnvironment.MOCK, classes = App.class)
public class HelloControllerTests {
  @Test
  public void greetTest() {
    HelloController controller = new HelloController();
    assertEquals(controller.greet("James"), "Hello, James!");
  }
}
