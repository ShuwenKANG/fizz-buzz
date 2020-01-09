import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void should_return_1_given_1() {
    assertEquals("1", fizzBuzz.call(1));
  }

  @Test
  public void should_return_2_given_2() {
    assertEquals("2", fizzBuzz.call(2));
  }

  @Test
  public void should_return_Fizz_given_3() {
    assertEquals("Fizz", fizzBuzz.call(3));
  }

  @Test
  public void should_return_Fizz_given_6() {
    assertEquals("Fizz", fizzBuzz.call(6));
  }

  @Test
  public void should_return_Buzzz_given_5_and_10() {
    assertEquals("Buzz", fizzBuzz.call(5));
    assertEquals("Buzz", fizzBuzz.call(10));
  }

  @Test
  public void should_return_Buzzz_given_7_and_14() {
    assertEquals("Whizz", fizzBuzz.call(7));
    assertEquals("Whizz", fizzBuzz.call(14));
  }

  @Test
  public void should_return_FizzBuzz_given_15_30_45() {
    assertEquals("FizzBuzz", fizzBuzz.call(15));
    assertEquals("FizzBuzz", fizzBuzz.call(30));
    assertEquals("FizzBuzz", fizzBuzz.call(45));
  }

  @Test
  public void should_return_FizzBuzzWhizz_given_105() {

    assertEquals("FizzBuzzWhizz", fizzBuzz.call(105));
  }

  @Test
  public void should_return_BuzzWhizz_given_35_and_FizzWhizz_given_21() {

    assertEquals("BuzzWhizz", fizzBuzz.call(35));
    assertEquals("FizzWhizz", fizzBuzz.call(21));
  }
}
