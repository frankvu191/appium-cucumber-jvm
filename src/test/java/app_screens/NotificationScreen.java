package app_screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("cucumber-glue")
public class NotificationScreen extends AbstractScreen {

    @AndroidFindBy(accessibility = "IncomingMessage")
    private AndroidElement incomingMessageNotificationElement;

    @Autowired
    public NotificationScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickOnIncomingMessageLable() {
        incomingMessageNotificationElement.click();
    }


}
