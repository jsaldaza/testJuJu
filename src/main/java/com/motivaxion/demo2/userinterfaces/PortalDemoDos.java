package com.motivaxion.demo2.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PortalDemoDos {
    public static final Target NOMBRE_USUARIO = Target.the("nombre de usuario").located(By.id("userName"));
    public static final Target PWD = Target.the("contraseña").located(By.id("password"));
    public static final Target ENTRAR = Target.the("entrar").locatedBy("//*[@class = 'btn second-btn form-login__btn']");
    public static final Target HOME = Target.the("home").locatedBy("//*[@class = 'nav-link active']");
    public static final Target DESCRIPCION = Target.the("descripcion").located(By.id("txtPublishDescription"));
    public static final Target VIDEO = Target.the("video").locatedBy("//*[@class = 'icon-icon_Video publish-actions']");
    public static final Target LINK = Target.the("link").locatedBy("//input[@name='video']");
    public static final Target PUBLICAR = Target.the("publicar").locatedBy("//*[@class='btn btn-default main-button btn-dinamic-main']");
    public static final Target TEXTO_VALIDADO = Target.the("se visualiza noticia en portal").locatedBy("(//*[@class='col-11 ctr-text-news' and contains (.,'Nuevas aplicaciones de Inteligencia Artificial en el 2020')])[1]");


}
