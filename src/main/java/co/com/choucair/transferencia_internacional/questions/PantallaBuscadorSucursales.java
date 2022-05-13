package co.com.choucair.transferencia_internacional.questions;

import co.com.choucair.transferencia_internacional.userinterfaces.AbrirBuscadorSucursales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;




public class PantallaBuscadorSucursales implements Question<Boolean> {

    private String pantalla;

    public PantallaBuscadorSucursales(String pantalla) {
        this.pantalla = pantalla;
    }

    public static PantallaBuscadorSucursales the(String pantalla){
        return new PantallaBuscadorSucursales(pantalla);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean result;

        String pantallaSuc = TextContent.of(AbrirBuscadorSucursales.BUSC_SUCUR).answeredBy(actor);

        if (pantallaSuc.equals(pantalla)){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }
}
