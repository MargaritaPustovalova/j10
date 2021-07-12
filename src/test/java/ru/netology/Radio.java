package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





class RadioTest {
    Radio radio = new Radio();

    @Test
    public void SetStation() {
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void NotSetStationAfterMax() {
        radio.setCurrentStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void NotSetStationBeforeMin() {
        radio.setCurrentStation(-5);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void IncreaseStation() {
        radio.setCurrentStation(7);
        radio.shouldIncreaseStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void ReduceStation() {
        radio.setCurrentStation(2);
        radio.shouldReduceStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void IncreaseStationMin() {
        radio.setCurrentStation(9);
        radio.shouldIncreaseStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void ReduceStationMin() {
        radio.setCurrentStation(0);
        radio.shouldReduceStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void IncreaseVolume() {
        radio.setCurrentVolume(8);
        radio.shouldIncreaseVolume();
        Assertions.assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void ReduceVolume() {
        radio.setCurrentVolume(1);
        radio.shouldReduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void NotReduceVolumeMin() {
        radio.setCurrentVolume(0);
        radio.shouldReduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void NotIncreaseVolumeMax() {
        radio.setCurrentVolume(10);
        radio.shouldIncreaseVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void NotSetVolumeBeforeMin() {
        radio.setCurrentVolume(-2);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void NotSetVolumeAfterMax() {
        radio.setCurrentVolume(15);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}