package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        this.maxStation = 9;
        this.maxVolume = 100;
    }

    public Radio(int stationCount) {
         this.maxStation = stationCount - 1;
    }



    public void next() {
        if (currentStation != maxStation) {
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
            currentStation = maxStation;
        }
    }

    public void increase() {
        if (currentVolume != maxVolume) {
            currentVolume++;
            return;
        } else {
            currentVolume = maxVolume;
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
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;

        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
