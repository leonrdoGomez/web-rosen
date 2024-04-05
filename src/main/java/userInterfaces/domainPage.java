package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.domain.com/")
public class domainPage extends PageObject {

    public static final Target INITIAL_INPUT = Target.the("Este es el input donde se escribe el nombre del dominio").locatedBy("//input[@data-placeholdermobile='Find a domain name']");
    public static final Target BTN_SEARCH = Target.the("").locatedBy("//*[@id='hero']/div/div/div/div/div/div[2]/form/button");
}