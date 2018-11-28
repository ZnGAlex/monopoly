package monopoly.mapa;


// Esta clase todavia no se utiliza
public class Edificio {
    private String nombre;
    private String tipo;
    private Casilla casilla;
    private Grupo grupo;
    private int valor;
    private int alquiler;

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
                this.valor = (int) (casilla.getValor() * 0.6);
                switch (casilla.getNumCasas()) {
                    case 0:
                        this.nombre = "casa-1";
                        this.alquiler = casilla.getAlquiler() * 5;
                        casilla.setNumCasas(1);
                        break;
                    case 1:
                        this.nombre = "casa-2";
                        this.alquiler = casilla.getAlquiler() * 15;
                        casilla.setNumCasas(2);
                        break;
                    case 2:
                        this.nombre = "casa-3";
                        this.alquiler = casilla.getAlquiler() * 35;
                        casilla.setNumCasas(3);
                        break;
                    case 3:
                        this.nombre = "casa-4";
                        this.alquiler = casilla.getAlquiler() * 50;
                        casilla.setNumCasas(4);
                        break;
                }
                break;
            case Valor.EDIFICIO_HOTEL:
                switch (casilla.getNumHoteles()) {
                    case 1:
                        this.nombre = "hotel-1";
                        break;
                    case 2:
                        this.nombre = "hotel-2";
                        break;
                    case 3:
                        this.nombre = "hotel-3";
                        break;
                }
                this.valor = (int) (casilla.getValor() * 0.6);
                this.alquiler = casilla.getAlquiler() * 70;
                break;
            case Valor.EDIFICIO_PISCINA:
                switch (casilla.getNumPiscinas()) {
                    case 1:
                        this.nombre = "piscina-1";
                        break;
                    case 2:
                        this.nombre = "piscina-2";
                        break;
                    case 3:
                        this.nombre = "piscina-3";
                        break;
                }
                this.valor = (int) (casilla.getValor() * 0.4);
                this.alquiler = casilla.getAlquiler() * 25;
                break;
            case Valor.EDIFICIO_PISTA:
                switch (casilla.getNumPistas()) {
                    case 1:
                        this.nombre = "pista-1";
                        break;
                    case 2:
                        this.nombre = "pista-2";
                        break;
                    case 3:
                        this.nombre = "pista-3";
                        break;
                }
                this.valor = (int) (casilla.getValor() * 1.25);
                this.alquiler = casilla.getAlquiler() * 25;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
                            "\n\t id: " + this.nombre +
                            "\n\t propietario: " + this.casilla.getPropietario().getNombre() +
                            "\n\t grupo: " + this.grupo.getColor() +
                            ",\n\t coste: " + this.valor +
                            "\n}";
        return cadena;
    }
}
