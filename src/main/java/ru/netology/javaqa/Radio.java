package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public void next() {
        if (currentStation != 9) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        } else {
            currentStation = 9;
        }
    }

    public void increase() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        } else {
            currentVolume = 100;
        }
    }

    public void deicrease() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
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
}
