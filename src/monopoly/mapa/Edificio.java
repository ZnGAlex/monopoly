package monopoly.mapa;


// Esta clase todavia no se utiliza
public class Edificio {
    private String tipo;
    private Casilla casilla;
    private int valor;
    private int alquiler;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public String toString() {
        String cadena = "{\n " +
                            "\n\t tipo: " + this.tipo +
                            ",\n\t precio: " + this.valor +
                            ",\n\t alquiler: " + this.alquiler +
                            "\n}";
        return cadena;
    }
}
