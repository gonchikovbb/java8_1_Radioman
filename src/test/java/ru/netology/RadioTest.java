package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseVolume01() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setIncreaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume34() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);
        rad.setIncreaseVolume();
        int expected = 4;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setIncreaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume11() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.setIncreaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMin1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.setIncreaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume00() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume109() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setReduceVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume11() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation01() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setIncreaseCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation12() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.setIncreaseCurrentStation();
        int expected = 2;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation9_0() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setIncreaseCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation10() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.setIncreaseCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStation2_1() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        rad.setReduceCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(12);
        rad.setReduceCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationVMin1() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.setReduceCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
}