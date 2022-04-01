package ru.netology;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {return currentVolume;}
    public int getCurrentStation() {return currentStation;}

    public void setIncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void setReduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public void setIncreaseCurrentStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        };
    }
    public void setReduceCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }
}