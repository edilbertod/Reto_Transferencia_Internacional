package co.com.choucair.transferencia_internacional.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AbrirBuscadorSucursales extends PageObject {

    public static final Target PROD_SERV = Target.the("").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"));

    public static final Target TRANS_INTER = Target.the("").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/div[2]/ul/li[4]/a"));

    public static final Target ADQUI_SUCUR = Target.the("").located(By.xpath("//*[@id=\"layoutContainers\"]/div/div[1]/section/div[2]/div[2]/div[2]/div/div/div/div/a"));

    public static final Target BUSC_SUCUR = Target.the("").located(By.xpath("/html/body/div[1]/div[1]/div/h1"));

    public static final Target IFRAME = Target.the("Buscar iframe").located(By.xpath("//*[@id=\"Demos\"]"));


    //PARTE DEL 2DO ESCENARIO
    public static final Target DOC_ASOC = Target.the("").located(By.xpath("//*[@id=\"filialTabs\"]/li[3]/a"));

    public static final Target PDF_TRANS_INTER = Target.the("").located(By.xpath("//*[@id=\"tab3\"]/table/tbody/tr[1]/td[2]/span/a"));

}
