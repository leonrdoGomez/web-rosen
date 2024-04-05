package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.productSelectionPage.*;

public class addDomain implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIRST_YEAR),
                Click.on(MOST_POPULAR)
        );
    }

    public static addDomain withCharacteristics() {
        return instrumented(addDomain.class);
    }
}