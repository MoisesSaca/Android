package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabsSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;

    @Step("Click en usuario")
    public void clickClose(){
        loginScreen.clickClose();
    }

    @Step("inicio sesión con las credenciales usuario y contraseña")
    public void login(String user, String password){
        searchScreen.User(user);
        searchScreen.Password(password);
        searchScreen.Login();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }
}
