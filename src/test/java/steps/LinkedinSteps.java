package steps;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static pages.LinkedinPage.*;

public class LinkedinSteps {
    public static void openURL() {
        open("https://ru.linkedin.com");
    }

    public static void auth(String username, String password) {
        btnEntire.should(visible).click();
        inputUsername.should(visible).val(username);
        inputPassword.should(visible).val(password);
        btnLogin.should(visible).click();

        while (!linkNetwork.isDisplayed()) {
            sleep(100);
        }
    }

    public static void subscribe() {
        linkNetwork.should(visible).click();
        for (int i = 0; i < 100; i++) {
            btnEstablishContact.get(i).should(visible, Duration.ofSeconds(15)).click();

            if (btnOK.isDisplayed()) {
                btnOK.should(visible).click();
            }
        }
    }
}
