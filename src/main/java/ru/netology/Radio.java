ackage ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax() {
        radio.setCurrentStation(12);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        radio.setCurrentStation(-12);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(9);
        radio.shouldIncreaseStation();
        Assertions.assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation0() {
        radio.setCurrentStation(10);
        radio.shouldIncreaseStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        radio.setCurrentStation(1);
        radio.shouldReduceStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void numberStationEntered() {
        int enteredNumberStation = 4;
        radio.setCurrentStation(enteredNumberStation);
        Assertions.assertEquals( 4, radio.getCurrentStation());
    }


    @Test
    public void shouldDecreaseStationWhenCurrent0() {
        radio.shouldReduceStation();
        Assertions.assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        radio.shouldReduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(1);
        radio.shouldReduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(99);
        radio.shouldIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.shouldReduceVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum() {
        radio.setCurrentVolume(-101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
