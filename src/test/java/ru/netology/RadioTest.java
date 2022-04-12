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
    public void shouldIncreaseVolume100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        rad.setIncreaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.setIncreaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeLimit() {
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
    public void shouldReduceVolume100_99() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.setReduceVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation0_1() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setIncreaseCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setIncreaseCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.setIncreaseCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation9_0() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.setNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStation1_0() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.setReduceCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.setReduceCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation0_9() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setPrevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation1_1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.setPrevStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationVMin1() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.setReduceCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationConstructor0_1() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(0);
        rad.setIncreaseCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationConstructorLimit() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(5);
        rad.setIncreaseCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationConstructorUnderLimit() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(6);
        rad.setIncreaseCurrentStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationConstructor4_1() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(4);
        rad.setNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationConstructorUnderLimit() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(6);
        rad.setNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationConstructor1_0() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(1);
        rad.setReduceCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationConstructorUnderLimit() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(6);
        rad.setReduceCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationConstructor0_4() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(0);
        rad.setPrevStation();
        int expected = 4;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationConstructor1_1() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(1);
        rad.setPrevStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationConstructorMin1() {
        Radio rad = new Radio(5);
        rad.setCurrentStation(-1);
        rad.setReduceCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


}