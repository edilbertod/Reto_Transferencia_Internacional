package co.com.choucair.transferencia_internacional.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.core.Serenity.getDriver;

public class VerificarPdf implements Question<Boolean> {

    private String titulo;

    public VerificarPdf(String titulo) {
        this.titulo = titulo;
    }

    public static VerificarPdf the(String titulo){
        return new VerificarPdf(titulo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String titulopdf = getDriver().getCurrentUrl();
        if(titulopdf.contains(titulo)){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }
}
