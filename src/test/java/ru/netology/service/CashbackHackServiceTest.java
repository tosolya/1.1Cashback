package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainEqualBoundary() {
        int amount = 1000;

        assertEquals(0,service.remain(amount));

    }
    @Test
    public void shouldRemainMoreBoundary() {
        int amount = 1500;

        assertEquals(500,service.remain(amount));

    }
    @Test
    public void shouldRemainAmountEqual0() {
        int amount = 0;

        assertEquals(1000,service.remain(amount));

    }
    @Test
    public void shouldRemainBeforeBoundary() {
        int amount = 600;

        assertEquals(400,service.remain(amount));


    }
}