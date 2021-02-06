package com.motivaxion.demo2.tasks;

import com.motivaxion.demo2.interactions.ImplicitWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.motivaxion.demo2.userinterfaces.PortalDemoDos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PublicaNoticia implements Task {
    private String descripcion;
    private String link;

    public PublicaNoticia(String descripcion, String link){
        this.descripcion = descripcion;
        this.link = link;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(DESCRIPCION),
                ImplicitWait.ofTime(2),
                Click.on(VIDEO),
                Click.on(LINK),
                Enter.theValue(link).into(LINK),
                Click.on(PUBLICAR));


    }

    public static Performable enElPortal(String descripcion, String link){
        return instrumented(PublicaNoticia.class, descripcion, link);
    }
}
