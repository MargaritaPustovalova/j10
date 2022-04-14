package ru.netology;


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStation = 10;
    private int minStation = 0;

    public Radio(int currentStation, int currentVolume, int minStation, int maxStation, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio() {

    }

    public void shouldIncreaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        ++currentVolume;
    }

    public void shouldDecreaseVolume() {

        if (currentVolume == minVolume) {
            return;
        }
        --currentVolume;
    }

    public void shouldIncreaseStation() {

        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        ++currentStation;
    }

    public void shouldDecreaseStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        --currentStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation || currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume || currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }
}
