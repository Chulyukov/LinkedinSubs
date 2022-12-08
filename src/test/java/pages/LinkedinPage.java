package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class LinkedinPage {
    public static SelenideElement btnEntire = $x("//a[@class='nav__button-secondary btn-md btn-secondary-emphasis']");
    public static SelenideElement inputUsername = $x("//input[@id='username']");
    public static SelenideElement inputPassword = $x("//input[@id='password']");
    public static SelenideElement btnLogin = $x("//button[@class='btn__primary--large from__button--floating']");
    public static SelenideElement linkNetwork = $x("//a[@href='https://www.linkedin.com/mynetwork/?']");
    public static SelenideElement btnOK = $x("//button[@aria-label='ОК']");

    public static ElementsCollection btnEstablishContact = $$x("//button[contains(@aria-label,'Пригласить участника')]");
}
