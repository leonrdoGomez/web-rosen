package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class productSelectionPage extends PageObject {

    public static final Target FIRST_YEAR = Target.the("Este el es dominio con un año en venta").locatedBy("//*[@id='suggestions-wrapper']/div[2]/ul/li[2]/div[4]/span");
    public static final Target MOST_POPULAR = Target.the("Este es un dominoio popular").locatedBy("//*[@id='suggestions-wrapper']/div[2]/ul/li[3]/div[4]/span");
    public static final Target SELECT_YEAR_ELEMENT_FIRST_YEAR = Target.the("").locatedBy("//*[@id='cart-list']/ul/div[1]/li/div[2]/div/div/select/option[1]");
    public static final Target SELECT_POPULAR_ELEMENT_MOST_POPULAR = Target.the("").locatedBy("//*[@id='cart-list']/ul/div[5]/li/div[2]/div/div/select/option[1]");
    public static final Target TOTAL = Target.the("Este es el valor total de la compra de dominios").located(By.id("cart-total"));
    public static final Target DELETE_ELEMENT_FIRST_YEAR = Target.the("").locatedBy("//*[@id='suggestions-wrapper']/div[2]/ul/li[2]/div[3]/span");
    public static final Target DELETE_ELEMENT_MOST_POPULAR = Target.the("").locatedBy("//*[@id='suggestions-wrapper']/div[2]/ul/li[3]/div[3]/span");
}