package com.motivaxion.demo2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.motivaxion.demo2.userinterfaces.PortalDemoDos.*;

public class RealizaAutenticacion implements Task {

    private String usuario;
    private String clave;

    public RealizaAutenticacion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(NOMBRE_USUARIO),
                Enter.theValue(clave).into(PWD));

        actor.attemptsTo(
                Click.on(ENTRAR),
                Click.on(HOME));
                   }


    public static Performable  enDemodos(String usuario, String clave){
        return instrumented(RealizaAutenticacion.class, usuario, clave);
    }
}
