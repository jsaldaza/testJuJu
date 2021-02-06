package com.motivaxion.demo2.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.motivaxion.demo2.userinterfaces.PortalDemoDos.TEXTO_VALIDADO;

public class ValidarNoticia implements Question {

    private String validarTexto;

    public ValidarNoticia(String validarTexto){
        this.validarTexto = validarTexto;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(TEXTO_VALIDADO).viewedBy(actor).asString().equals(validarTexto.toString()))
        return true;
        else
            return false;
    }
    public static ValidarNoticia noticiaPublicada (String validarTexto){
        return new ValidarNoticia(validarTexto);
    }


}
