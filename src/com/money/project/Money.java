package com.money.project;

public abstract class Money {
  protected int amount;
  protected String currency;

  public Money(int value) {
    amount = value;
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money ) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  public static Money dollar(int amount) {
    return new Dollar(amount, null);
  }

  public abstract Money times(int multiplier);

  public static Money franc(int amount) {
    return new Franc(amount);
  }

  public String currency() {
    return currency;
  }
}
