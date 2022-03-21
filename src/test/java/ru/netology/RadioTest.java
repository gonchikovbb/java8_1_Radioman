package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @org.junit.jupiter.api.Test
    void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    void shouldReduceVolume() {
        Radio rad = new Radio();
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    void shouldIncreaseStation() {
        Radio rad = new Radio();
        rad.increaseStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }

    @Test
    void shouldReduceStation() {
        Radio rad = new Radio();
        rad.reduceStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
}