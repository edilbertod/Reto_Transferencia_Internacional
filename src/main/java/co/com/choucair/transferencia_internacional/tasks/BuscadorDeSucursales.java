package co.com.choucair.transferencia_internacional.tasks;

import co.com.choucair.transferencia_internacional.interactions.CambioVentana;
import co.com.choucair.transferencia_internacional.interactions.SwichTo;
import co.com.choucair.transferencia_internacional.userinterfaces.AbrirBuscadorSucursales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscadorDeSucursales implements Task {

    public static BuscadorDeSucursales the(){
        return Tasks.instrumented(BuscadorDeSucursales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AbrirBuscadorSucursales.PROD_SERV),
                Click.on(AbrirBuscadorSucursales.TRANS_INTER),
                Click.on(AbrirBuscadorSucursales.ADQUI_SUCUR)
        );
        actor.attemptsTo(CambioVentana.the());
        actor.attemptsTo(SwichTo.iframe(AbrirBuscadorSucursales.IFRAME));
    }
}
