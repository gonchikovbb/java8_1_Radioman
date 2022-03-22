package ru.netology;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume == 10) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

    public void reduceVolume(int currentVolume) {
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseStation(int currentStation) {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void reduceStation(int currentStation) {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }
}