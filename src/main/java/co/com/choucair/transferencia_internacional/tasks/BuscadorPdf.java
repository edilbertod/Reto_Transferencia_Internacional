package co.com.choucair.transferencia_internacional.tasks;

import co.com.choucair.transferencia_internacional.interactions.CambioVentana;
import co.com.choucair.transferencia_internacional.userinterfaces.AbrirBuscadorSucursales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscadorPdf implements Task {

    public static BuscadorPdf the(){
        return Tasks.instrumented(BuscadorPdf.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AbrirBuscadorSucursales.PROD_SERV),
                Click.on(AbrirBuscadorSucursales.TRANS_INTER),
                Click.on(AbrirBuscadorSucursales.DOC_ASOC),
                Click.on(AbrirBuscadorSucursales.PDF_TRANS_INTER)
        );
        actor.attemptsTo(CambioVentana.the());
    }
}
