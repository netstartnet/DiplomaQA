package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


public class MainPage {
    private SelenideElement heading = $x("//h2[text()='Путешествие дня']");
    private SelenideElement buyButton = $x("//span[text()='Купить']");
    private SelenideElement creditButton = $x("//span[text()='Купить в кредит']");

    public MainPage() {
        heading.shouldBe(visible);
    }

    public BuyByDebit goToBuyByDebit() {
        buyButton.click();
        return new BuyByDebit();
    }

    public BuyByCredit goToBuyByCredit() {
        creditButton.click();
        return new BuyByCredit();
    }
}


