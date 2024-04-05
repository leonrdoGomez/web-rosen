package stepDefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.addDomain;
import tasks.changeYearDomain;
import tasks.deleteDomains;
import tasks.inputDomain;
import userInterfaces.domainPage;

public class domainStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor actor = Actor.named("rosen");
    private userInterfaces.domainPage domainPage = new domainPage();

    @Given("^Que ingreso a la web domain\\.com$")
    public void inputUrl() {
        actor.can(BrowseTheWeb.with(browser));
        actor.wasAbleTo(Open.browserOn(domainPage));
    }

    @Given("^Ingreso el (.*)$")
    public void inputDomain(String nameDomain) {
        actor.wasAbleTo(
                inputDomain.withName(nameDomain)
        );
    }

    @When("^Agrego al carrito de compras el dominio mas popular y el dominio con el primer año a la venta$")
    public void addShoppingCart() {
        actor.wasAbleTo(
                addDomain.withCharacteristics()
        );
    }

    @When("^cambio el año y obtengo el valor total de compra$")
    public void changeYear() {
        actor.wasAbleTo(
                changeYearDomain.selectOneYear()
        );
    }

    @Then("^Elimino los dominios del carrito de compra y el carrito de compra debe estar vacio$")
    public void deleteDomains() {
        actor.wasAbleTo(
                deleteDomains.validateShoppingCart()
        );
    }
}