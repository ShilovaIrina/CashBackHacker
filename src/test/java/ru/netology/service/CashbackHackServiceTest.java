package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldAmountEqualThousandRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000; //сумма совершаемой покупки
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAmountAboveThousandRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001; //сумма совершаемой покупки
        int actual = service.remain(amount);
        int expected = 0; //сумма, на которую необходимо докупить, чтобы получить кешбек
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAmountBelowThousandRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999; //сумма совершаемой покупки
        int actual = service.remain(amount);
        int expected = 1; //сумма, на которую необходимо докупить, чтобы получить кешбек
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAmountEqualNineHundredRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900; //сумма совершаемой покупки
        int actual = service.remain(amount);
        int expected = 100; //сумма, на которую необходимо докупить, чтобы получить кешбек
        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldAmountEqualOneThousandOneHundredRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100; //сумма совершаемой покупки
        int actual = service.remain(amount);
        int expected = 0; //сумма, на которую необходимо докупить, чтобы получить кешбек
        assertEquals(actual, expected);
    }
}