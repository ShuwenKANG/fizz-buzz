import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void should_return_1_given_1() {
    assertEquals("1", fizzBuzz.fizzBuzz(1));
  }

  @Test
  public void should_return_2_given_2() {
    assertEquals("2", fizzBuzz.fizzBuzz(2));
  }

  @Test
  public void should_return_Fizz_given_3() {
    assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
  }

  @Test
  public void should_return_Fizz_given_6() {
    assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
  }

  @Test
  public void should_return_Buzzz_given_5_and_10() {
    assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
  }

  @Test
  public void should_return_Buzzz_given_7_and_14() {
    assertEquals("Whizz", fizzBuzz.fizzBuzz(7));
    assertEquals("Whizz", fizzBuzz.fizzBuzz(14));
  }

  @Test
  public void should_return_FizzBuzz_given_60_120() {
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(60));
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(120));
  }

  @Test
  public void should_return_FizzBuzzWhizz_given_210() {

    assertEquals("FizzBuzzWhizz", fizzBuzz.fizzBuzz(210));
  }

  @Test
  public void should_return_BuzzWhizz_given_140_and_FizzWhizz_given_21() {

    assertEquals("BuzzWhizz", fizzBuzz.fizzBuzz(140));
    assertEquals("FizzWhizz", fizzBuzz.fizzBuzz(21));
  }

  @Test
  public void should_return_Fizz_given_13_23_31() {

    assertEquals("Fizz", fizzBuzz.fizzBuzz(13));
    assertEquals("Fizz", fizzBuzz.fizzBuzz(23));
    assertEquals("Fizz", fizzBuzz.fizzBuzz(31));
  }

  @Test
  public void should_return_Fizz_given_30() {

    assertEquals("Fizz", fizzBuzz.fizzBuzz(30));

  }

  @Test
  public void should_return_BuzzWhizz_given_35() {

    assertEquals("BuzzWhizz", fizzBuzz.fizzBuzz(35));
  }

  @Test
  public void should_return_Fizz_given_75() {

    assertEquals("Fizz", fizzBuzz.fizzBuzz(75));
  }
}
