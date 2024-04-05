package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.productSelectionPage.*;

public class changeYearDomain implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("1 Year").from(SELECT_YEAR_ELEMENT_FIRST_YEAR),
                SelectFromOptions.byVisibleText("1 Year").from(SELECT_POPULAR_ELEMENT_MOST_POPULAR),
                Click.on(TOTAL)
        );
    }
    public static changeYearDomain selectOneYear() {
        return instrumented(changeYearDomain.class);
    }
}