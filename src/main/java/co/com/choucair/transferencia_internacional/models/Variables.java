package co.com.choucair.transferencia_internacional.models;

public class Variables {
    private String pantalla;
    private String titulo;

    public Variables(String pantalla, String titulo) {
        this.pantalla = pantalla;
        this.titulo = titulo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
