import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {
    @Test

    public void TestNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetupNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actuals = radio.getCurrentStation();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();

        int expected = 8;
        int actuals = radio.getCurrentStation();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestPrevZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actuals = radio.getCurrentStation();
        Assertions.assertEquals(expected, actuals);
    }


    @Test
    public void TestIncreaceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increase();

        int expected = 3;
        int actuals = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestDeincreaceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(88);
        radio.deicrease();

        int expected = 87;
        int actuals = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestMoreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increase();

        int expected = 100;
        int actuals = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestMinZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.deicrease();

        int expected = 0;
        int actuals = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestExceedingStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(17);
        int expected = 0;
        int actuals = radio.getCurrentStation();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestExceedingVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(170);
        int expected = 0;
        int actuals = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestLessStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-7);
        int expected = 0;
        int actuals = radio.getCurrentStation();
        Assertions.assertEquals(expected, actuals);
    }

    @Test
    public void TestLessVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-100);
        int expected = 0;
        int actuals = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actuals);
    }
}
