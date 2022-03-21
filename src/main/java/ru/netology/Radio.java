package ru.netology;

public class Radio {

    private int currentVolume;
    //private int currentListening;

    public int getCurrentVolume() {
        return currentVolume;
    }

    //public int getCurrentListening() {
    //    return currentListening;
    //}

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
