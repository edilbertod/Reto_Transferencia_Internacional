package co.com.choucair.transferencia_internacional.stepdefinitions;

import co.com.choucair.transferencia_internacional.questions.PantallaBuscadorSucursales;
import co.com.choucair.transferencia_internacional.tasks.AbrirBancolombia;
import co.com.choucair.transferencia_internacional.tasks.BuscadorDeSucursales;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.cy_gb.Ond;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import javax.management.ObjectName;
import java.util.List;

public class TransferenciaInternacionalStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que entro a la seccion de transferencia internacional")
    public void queEntroALaSeccionDeTransferenciaInternacional() {
        OnStage.theActorCalled("Edi").wasAbleTo(AbrirBancolombia.the());
    }

    @Cuando("consulto la pantalla")
    public void consultoLaPantalla() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscadorDeSucursales.the());
    }

    @Entonces("verifico que sea la correcto")
    public void verificoQueSeaLaCorrecto(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> suc : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PantallaBuscadorSucursales.the(suc.get(0))));
        }
    }


}
