package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabsStepsDefs {

    @Steps
    SwagLabsSteps swagLabsSteps;

    @Given("que me encuentro en la página de login de Saucedemo")
    public void que_me_enuentro_en_el_login_de_swaglabs() {

        swagLabsSteps.clickClose();
    }
    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        swagLabsSteps.login(user, password);
    }
    @Then("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String text) {
        //prueba: validamos el título del producto
        Assert.assertEquals(swagLabsSteps.getResultText(), text);
    }
}
