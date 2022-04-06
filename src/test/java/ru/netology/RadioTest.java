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
    public void shouldMaxVolume() {
        Radio rad = new Radio();

        rad.setMaxVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();

        rad.setReduceVolume(1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldReduce2Volume() {
        Radio rad = new Radio();

        rad.setReduceVolume(2);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldMinVolume() {
        Radio rad = new Radio();

        rad.setMinVolume();

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

        rad.setReduceCurrentStation(1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldReduce2Station() {
        Radio rad = new Radio();

        rad.setReduceCurrentStation(2);

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();

        rad.setNextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();

        rad.setPrevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldStation() {
        Radio rad = new Radio();

        rad.setStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
}