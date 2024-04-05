package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.productSelectionPage.*;

public class deleteDomains implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DELETE_ELEMENT_FIRST_YEAR),
                Click.on(DELETE_ELEMENT_MOST_POPULAR)

        );
    }

    public static deleteDomains validateShoppingCart() {
        return instrumented(deleteDomains.class);
    }
}