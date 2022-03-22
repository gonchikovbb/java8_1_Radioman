package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @org.junit.jupiter.api.Test
    void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume(0);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldIncrease1_2Volume() {

        Radio rad = new Radio();
        rad.increaseVolume(1);

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldIncrease10_10Volume() {

        Radio rad = new Radio();
        rad.increaseVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    void shouldReduceVolume() {
        Radio rad = new Radio();
        rad.reduceVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    void shouldReduce1_0Volume() {
        Radio rad = new Radio();
        rad.reduceVolume(1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    void shouldReduce10_9Volume() {
        Radio rad = new Radio();
        rad.reduceVolume(10);

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }

    @Test
    void shouldIncreaseStation() {
        Radio rad = new Radio();
        rad.increaseStation(0);

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }

    @Test
    void shouldIncrease9_0Station() {
        Radio rad = new Radio();
        rad.increaseStation(9);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }

    @Test
    void shouldReduceStation() {
        Radio rad = new Radio();
        rad.reduceStation(0);

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }

    @Test
    void shouldReduce9_8Station() {
        Radio rad = new Radio();
        rad.reduceStation(9);

        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected,actual);
    }
}