package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setIncreaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();

        rad.setReduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseStation() {
        Radio rad = new Radio();

        rad.setIncreaseCurrentStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldReduceStation() {
        Radio rad = new Radio();

        rad.setReduceCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }

}