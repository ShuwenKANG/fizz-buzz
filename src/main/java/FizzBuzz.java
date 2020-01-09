public class FizzBuzz {

  public String call(int i) {

    if(isFizzBuzzWhizz(i)) {
      return "FizzBuzzWhizz";
    }

    if(isFizzBuzz(i)) {
      return "FizzBuzz";
    }

    if(isBuzzWhizz(i)) {
      return "BuzzWhizz";
    }

    if(isFizzWhizz(i)) {
      return "FizzWhizz";
    }

    if(isFizz(i)) {
      return "Fizz";
    }

    if(isBuzz(i)) {
      return "Buzz";
    }
    if(isWhizz(i)) {
      return "Whizz";
    }
    return String.valueOf(i);
  }

  private boolean isFizzWhizz(int i) {
    return isMultiplesOf3(i) && isMultiplesOf7(i);
  }

  private boolean isBuzzWhizz(int i) {
    return isMultiplesOf5(i) && isMultiplesOf7(i);
  }

  private boolean isWhizz(int i) {
    return isMultiplesOf7(i);
  }

  private boolean isBuzz(int i) {
    return isMultiplesOf5(i);
  }

  private boolean isFizz(int i) {
    return isMultiplesOf3(i);
  }

  private boolean isFizzBuzz(int i) {
    return isMultiplesOf3(i) && isMultiplesOf5(i);
  }

  private boolean isFizzBuzzWhizz(int i) {
    return isMultiplesOf3(i) && isMultiplesOf5(i) && isMultiplesOf7(i);
  }

  private boolean isMultiplesOf7(int i) {
    return i%7 == 0;
  }

  private boolean isMultiplesOf5(int i) {
    return i%5 == 0;
  }

  private boolean isMultiplesOf3(int i) {
    return i%3 == 0;
  }
}
