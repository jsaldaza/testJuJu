package com.motivaxion.demo2.stepdefinitions;

import com.motivaxion.demo2.interactions.AbrirNavegador;
import com.motivaxion.demo2.questions.ValidarNoticia;
import com.motivaxion.demo2.tasks.RealizaAutenticacion;
import com.motivaxion.demo2.tasks.PublicaNoticia;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepdefinition {
    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que el (.*) se autentica en la pagina demo dos motivaxion")
    public void queElUsuarioSeAutenticaEnLaPaginaDemoDosMotivaxion(String actor, List<String> credenciales) {
        theActorCalled(actor).attemptsTo(
                AbrirNavegador.deDemodos(),
                RealizaAutenticacion.enDemodos(credenciales.get(0), credenciales.get(1))

        );

    }

    @Cuando("realice la publicacion de una noticia")
    public void realiceLaPublicacionDeUnaNoticia(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
                PublicaNoticia.enElPortal(
                        datos.get(0),
                        datos.get(1))
        );

    }

    @Entonces("se visualiza la publicacion de la noticia")
    public void seVisualizaLaPublicacionDeLaNoticia(List<String> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarNoticia.noticiaPublicada(datos.get(0))));

    }


}
