package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @org.junit.jupiter.api.Test
    void increaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected,actual);
    }
}