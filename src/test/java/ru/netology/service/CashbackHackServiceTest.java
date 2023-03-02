package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test

    public void shouldTestRemain (){
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;

        assertEquals(service.remain(amount), expected);
    }

    @Test

    public void shouldTestRemainIfPurchaseEquals1000 (){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        assertEquals(service.remain(amount), expected);
    }

}