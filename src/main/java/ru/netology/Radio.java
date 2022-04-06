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

    public void setIncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void setMaxVolume() {
        currentVolume = 10;
    }
    public void setReduceVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }
    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setIncreaseCurrentStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void setNextStation() {
        currentStation = 0;
    }

    public void setReduceCurrentStation(int currentStation) {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        this.currentStation = currentStation;
    }

    public void setPrevStation() {
        currentStation = 9;
    }
    public void setStation(int currentStation) {
        this.currentStation = currentStation;
    }
}