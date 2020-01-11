import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public String call(int i) {
    List<String> strategyList = new ArrayList<>();

    if(has5(i)) {
      strategyList.add("isBuzzWhizz");
      strategyList.add("isBuzz");
      strategyList.add("isWhizz");
      strategyList.add("isValue");

      return this.call(i, strategyList);
    }

    strategyList.add("isStrictFizz");
    strategyList.add("isFizzBuzzWhizz");
    strategyList.add("isFizzBuzz");
    strategyList.add("isBuzzWhizz");
    strategyList.add("isFizzWhizz");
    strategyList.add("isFizz");
    strategyList.add("isBuzz");
    strategyList.add("isWhizz");
    strategyList.add("isValue");

    return this.call(i, strategyList);
  }

  public String call(int i, List<String> strategyList) {
    for(String strategy: strategyList) {
      switch (strategy) {
        case "isStrictFizz":
          if(isStrictFizz(i)) {
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
        case "isValue":
          if(isValue(i)) {
            return String.valueOf(i);
          }
          break;
      }
    }
    return null;
  }

  private boolean isValue(int i) {
    return true;
  }

  private boolean has5(int i) {
    return String.valueOf(i).contains("5");
  }

  private boolean isStrictFizz(int i) {
    return has3(i);
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

  private boolean has3(int i) {
    return String.valueOf(i).contains("3");
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
