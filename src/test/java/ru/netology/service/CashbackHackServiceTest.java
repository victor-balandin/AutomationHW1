package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldTestRemain (){
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;

        assertEquals(expected , service.remain(amount));
    }

    @Test

    public void shouldTestRemainIfPurchaseEquals1000 (){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        assertEquals(expected , service.remain(amount));
    }


}