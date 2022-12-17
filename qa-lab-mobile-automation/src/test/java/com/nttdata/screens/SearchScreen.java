package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement usuario;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement clave;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView")
    private WebElement login;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement resultText;

    public void User(String user){
        usuario.click();
        usuario.sendKeys(user);
    }
    public void Password(String password){
        clave.click();
        clave.sendKeys(password);
    }
    public void Login(){
        login.click();
    }
    public String getResultText(){
        return resultText.getText();
    }
}
