package com.motivaxion.demo2.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://demo2-qa.jujutests.com/pages/login"));
    }
    public static Performable deDemodos(){return instrumented(AbrirNavegador.class);}
}
