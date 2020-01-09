import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void should_return_1_given_1() {
    assertEquals(1, fizzBuzz.call(1));
  }

  @Test
  public void should_return_2_given_2() {
    assertEquals(2, fizzBuzz.call(2));
  }

  @Test
  public void should_return_Fizz_given_3() {
    assertEquals("Fizz", fizzBuzz.call(3));
  }
}
