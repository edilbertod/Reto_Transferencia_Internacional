package co.com.choucair.transferencia_internacional.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class CambioVentana implements Interaction {

    public static CambioVentana the(){return new CambioVentana();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        int venti = 2;
        int vent = 0;
        Set<String> ventana = getDriver().getWindowHandles();
        for (String ventana2 : ventana){
            vent = vent+1;
            if (vent == venti){
                getDriver().switchTo().window(ventana2);
                break;
            }

        }

    }
}
