import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

  public String fizzBuzz(int i) {
    List<String> strategyList = Arrays.asList("isFizzBuzzWhizz", "isFizzBuzz", "isBuzzWhizz", "isFizzWhizz", "isFizz",
                                              "isBuzz", "isWhizz");

    if(hasX(i, 7)) {
      strategyList = Arrays.asList("has3", "isFizzWhizz", "isFizz", "isWhizz");

      return this.applyStrategies(i, strategyList);
    }

    if(hasX(i, 5)) {
      strategyList = Arrays.asList("isBuzzWhizz", "isBuzz", "isWhizz");

      return this.applyStrategies(i, strategyList);
    }

    if(hasX(i, 3)) {

      return "Fizz";
    }

    return this.applyStrategies(i, strategyList);
  }

  private String applyStrategies(int i, List<String> strategyList) {
    for(String strategy: strategyList) {
      switch (strategy) {
        case "has3":
          if(hasX(i, 3)) {
            return "Fizz";
          }
          break;
        case "isFizzBuzzWhizz":
          if(isFizzBuzzWhizz(i)) {
            return "FizzBuzzWhizz";
          }
          break;
        case "isFizzBuzz":
          if(isFizzBuzz(i)) {
            return "FizzBuzz";
          }
          break;
        case "isFizzWhizz":
          if(isFizzWhizz(i)) {
            return "FizzWhizz";
          }
          break;
        case "isBuzzWhizz":
          if(isBuzzWhizz(i)) {
            return "BuzzWhizz";
          }
          break;
        case "isFizz":
          if(isFizz(i)) {
            return "Fizz";
          }
          break;
        case "isBuzz":
          if(isBuzz(i)) {
            return "Buzz";
          }
          break;
        case "isWhizz":
          if(isWhizz(i)) {
            return "Whizz";
          }
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + strategy);
      }
    }
    return String.valueOf(i);
  }

  private boolean hasX(int i, int x) {
    return String.valueOf(i).contains(String.valueOf(x));
  }

  private boolean isFizzWhizz(int i) {
    return isFizz(i) && isWhizz(i);
  }

  private boolean isBuzzWhizz(int i) {
    return isBuzz(i) && isWhizz(i);
  }

  private boolean isFizzBuzz(int i) {
    return isFizz(i) && isBuzz(i);
  }

  private boolean isFizzBuzzWhizz(int i) {
    return isFizz(i) && isBuzz(i) && isWhizz(i);
  }

  private boolean isWhizz(int i) {
    return isMultiplesOfX(i, 7);
  }

  private boolean isBuzz(int i) {
    return isMultiplesOfX(i, 5);
  }

  private boolean isFizz(int i) {
    return isMultiplesOfX(i, 3);
  }

  private boolean isMultiplesOfX(int i, int x) {
    return i%x == 0;
  }
}
