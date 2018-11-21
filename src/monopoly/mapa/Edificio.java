package monopoly.mapa;


// Esta clase todavia no se utiliza
public class Edificio {
    private String tipo;
    private Casilla casilla;
    private Grupo grupo;
    private int valor;
    private int alquiler;

    public Edificio() {
        this.tipo = "";
        this.casilla = null;
        this.valor = 0;
        this.alquiler = 0;
    }

    public Edificio(String tipo, Casilla casilla) {
        if (tipo == null) {
            System.out.println("Tipo nulo.");
            System.exit(1);
        }
        if (casilla == null) {
            System.out.println("Casilla nula.");
            System.exit(1);
        }
        this.tipo = tipo;
        this.casilla = casilla;
        this.grupo = casilla.getGrupo();
        switch (tipo) {
            case Valor.EDIFICIO_CASA:
                break;
            case Valor.EDIFICIO_HOTEL:
                break;
            case Valor.EDIFICIO_PISCINA:
            case Valor.EDIFICIO_PISTA:

                break;
        }

    }

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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        if (grupo == null) {
            System.out.println("Grupo nulo.");
            System.exit(1);
        }
        this.grupo = grupo;
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
