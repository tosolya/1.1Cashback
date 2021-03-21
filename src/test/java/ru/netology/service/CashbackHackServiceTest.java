package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainEqualBoundary() {
        int amount = 1000;

        assertEquals(service.remain(amount),0);

    }
    @Test
    public void shouldRemainMoreBoundary() {
        int amount = 1500;

        assertEquals(service.remain(amount),500);

    }
    @Test
    public void shouldRemainAmountEqual0() {
        int amount = 0;

        assertEquals(service.remain(amount),1000);

    }
    @Test
    public void shouldRemainBeforeBoundary() {
        int amount = 600;

        assertEquals(service.remain(amount),400);

    }
}