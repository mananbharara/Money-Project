package com.money.project;

import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

  @Test
  public void testDollarMultiplication() throws Exception {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  public void testEquality() throws Exception {
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(5).equals(Money.dollar(10)));
    assertTrue(Money.franc(5).equals(Money.franc(5)));
    assertFalse(Money.franc(5).equals(Money.franc(10)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }

  @Test
  public void testFrancMultiplication() throws Exception {
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }

  @Test
  public void testCurrency() throws Exception {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }
}