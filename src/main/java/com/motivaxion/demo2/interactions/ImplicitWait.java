package com.motivaxion.demo2.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ImplicitWait implements Interaction {
    private int time;
    public ImplicitWait(int time){ this.time = time * 1000;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        }catch (Exception e){

        }
    }
    public static Performable ofTime(int time){
        return instrumented(ImplicitWait.class, time);
    }
}
