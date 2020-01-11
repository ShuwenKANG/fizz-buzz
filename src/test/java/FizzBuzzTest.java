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
  public void should_return_FizzBuzz_given_60_120() {
    assertEquals("FizzBuzz", fizzBuzz.call(60));
    assertEquals("FizzBuzz", fizzBuzz.call(120));
  }

  @Test
  public void should_return_FizzBuzzWhizz_given_210() {

    assertEquals("FizzBuzzWhizz", fizzBuzz.call(210));
  }

  @Test
  public void should_return_BuzzWhizz_given_140_and_FizzWhizz_given_21() {

    assertEquals("BuzzWhizz", fizzBuzz.call(140));
    assertEquals("FizzWhizz", fizzBuzz.call(21));
  }

  @Test
  public void should_return_Fizz_given_13_23_31() {

    assertEquals("Fizz", fizzBuzz.call(13));
    assertEquals("Fizz", fizzBuzz.call(23));
    assertEquals("Fizz", fizzBuzz.call(31));
  }

  @Test
  public void should_return_Fizz_given_30() {

    assertEquals("Fizz", fizzBuzz.call(30));

  }

  @Test
  public void should_return_BuzzWhizz_given_35() {

    assertEquals("BuzzWhizz", fizzBuzz.call(35));
  }

  @Test
  public void should_return_Fizz_given_75() {

    assertEquals("Fizz", fizzBuzz.call(75));
  }
}
