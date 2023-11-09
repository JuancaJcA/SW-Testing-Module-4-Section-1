package activities;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class Alarm {
    public Button selectClock = new Button(By.id("com.google.android.deskclock:id/fab"));

    public Label verifyAlarm(String hour, String minute) {
        return new Label(By.xpath("//android.widget.TextView[contains(@text, '" + hour + ":" + minute + "')]"));
    }
}
