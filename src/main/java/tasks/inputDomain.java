package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static  net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.domainPage.*;

public class inputDomain implements Task {

    private String nameDomain;

    public inputDomain(String nameDomain){
        this.nameDomain = nameDomain;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameDomain).into(INITIAL_INPUT),
                Click.on(BTN_SEARCH)
        );
    }

    public static inputDomain withName(String nameDomain){
        return instrumented(inputDomain.class,nameDomain);
    }

}