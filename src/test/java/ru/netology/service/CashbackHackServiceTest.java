package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainEqualBoundary4() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected,actual);

    }
    @Test
    public void shouldRemainMoreBoundary4() {
        int amount = 1500;

        assertEquals(500,service.remain(amount));

    }
    @Test
    public void shouldRemainAmountEqual04() {
        int amount = 0;

        assertEquals(1000,service.remain(amount));

    }
    @Test
    public void shouldRemainBeforeBoundary4() {
        int amount = 600;

        assertEquals(400,service.remain(amount));


    }
    @Test
    public void shouldRemainEqualBoundary() {
        int amount = 1000;

        assertEquals(1000,service.remain(amount));

    }
    @org.junit.jupiter.api.Test
    public void shouldRemainMoreBoundary() {
        int amount = 1500;

        Assertions.assertEquals(500,service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainAmountEqual0() {
        int amount = 0;

        Assertions.assertEquals(1000,service.remain(amount));

    }
    @org.junit.jupiter.api.Test
    public void shouldRemainBeforeBoundary() {
        int amount = 600;

        Assertions.assertEquals(400,service.remain(amount));
    }
}