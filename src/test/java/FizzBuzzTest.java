import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

  @Test
  public void should_return_1_given_1() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals(1, fizzBuzz.call(1));
  }
}
