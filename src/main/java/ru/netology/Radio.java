package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int numOfMaxStation = 10;

    public Radio() {
    }

    public Radio(int numOfMaxStation) {
        this.numOfMaxStation = numOfMaxStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > numOfMaxStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setReduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setIncreaseCurrentStation() {
        if (currentStation < numOfMaxStation - 1) {
            currentStation = currentStation + 1;
        }
    }

    public void setReduceCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }

    public void setNextStation() {
        if (currentStation == numOfMaxStation - 1) {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = numOfMaxStation - 1;
        }
    }
}
