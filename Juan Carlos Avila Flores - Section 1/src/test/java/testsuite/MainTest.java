package testsuite;

import activities.Form;
import activities.Alarm;
import activities.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class MainTest {
    MainScreen mainScreen = new MainScreen();
    Alarm alarm = new Alarm();
    Form form = new Form();

    @Test
    public void verifyCreateAlarm() {
        String hour = "5";
        String minute = "30";
        String timeType = "am".toUpperCase();

        mainScreen.selectClock.click();
        alarm.selectClock.click();
        form.setTime(hour);
        form.setTime(minute);
        form.selectAmOrPm(timeType);
        form.okButton.click();

        Assertions.assertTrue(alarm.verifyAlarm(hour, minute).isDisplayed(), "There is an ERROR in the alarm :(");
    }
    @AfterEach
    public void close(){
        Session.getSession().closeSession();
    }
}
