package ru.netology;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 ){
            return;
        }
        if (currentVolume > 10){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 ){
            return;
        }
        if (currentStation > 9){
            return;
        }
        this.currentStation = currentStation;
    }

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
        else {
            currentStation = 0;
        }
    }

    public void setReduceCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        else {
            currentStation = 9;
        }
    }

}