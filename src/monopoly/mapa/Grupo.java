package monopoly.mapa;

import java.util.ArrayList;

public class Grupo {
    private String color;
    private ArrayList<Edificio> edificios;
    private ArrayList<Casilla> casillas;
    private int alquiler;
    private int precio;

    public Grupo(String color, int precio, int alquiler) {
        this.color = color;
        this.edificios = new ArrayList<>();
        this.casillas = new ArrayList<>();
        this.precio = precio;
        this.alquiler = alquiler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {
        this.edificios = edificios;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String obtenerColorPrint() {
        switch(this.color) {
            case Valor.GRUPO_NEGRO:
                return Valor.ANSI_NEGRO;
            case Valor.GRUPO_CYAN:
                return Valor.ANSI_CYAN;
            case Valor.GRUPO_ROSA:
                return Valor.ANSI_ROSA;
            case Valor.GRUPO_NARANJA:
                return Valor.ANSI_NARANJA;
            case Valor.GRUPO_ROJO:
                return Valor.ANSI_ROJO;
            case Valor.GRUPO_AMARILLO:
                return Valor.ANSI_AMARILLO;
            case Valor.GRUPO_VERDE:
                return Valor.ANSI_VERDE;
            case Valor.GRUPO_AZUL:
                return Valor.ANSI_AZUL;
            default:
                return "";
        }
    }

    @Override
    public String toString() {
        return this.color;
    }
}
