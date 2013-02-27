package com.money.project;

public class Dollar extends Money {

  public Dollar(int value, String currency) {
    super(value);
    this.currency = "USD";
  }

  public Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }

}
