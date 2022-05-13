package co.com.choucair.transferencia_internacional.stepdefinitions;

import co.com.choucair.transferencia_internacional.questions.VerificarPdf;
import co.com.choucair.transferencia_internacional.tasks.AbrirBancolombia;
import co.com.choucair.transferencia_internacional.tasks.BuscadorPdf;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PdfTransferenciaInternacionalStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que entro a la seccion de documentos asociados")
    public void queEntroALaSeccionDeDocumentosAsociados() {
        OnStage.theActorCalled("Edi").wasAbleTo(AbrirBancolombia.the());
    }

    @Cuando("consulto el PDF")
    public void consultoElPDF() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscadorPdf.the());
    }

    @Entonces("verifico que sea el pdf correcto")
    public void verificoQueSeaElPdfCorrecto(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> pdf : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarPdf.the(pdf.get(0))));
        }
    }
}
