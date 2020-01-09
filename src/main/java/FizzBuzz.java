public class FizzBuzz {

  public String call(int i) {
    if(i%3 == 0) {
      return "Fizz";
    }
    if(i%5 == 0) {
      return "Buzz";
    }
    if(i%7 == 0) {
      return "Whizz";
    }
    return String.valueOf(i);
  }
}
