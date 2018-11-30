package monopoly.mapa;

import java.util.ArrayList;
import monopoly.persona.*;

import java.util.HashMap;
import java.util.Iterator;

public class Casilla {
    private String nombre;
    private String tipo;
    int posicion;
    private Grupo grupo;
    private Jugador propietario;
    private int valor;
    private int alquiler;
    private HashMap<String, Avatar> avatares;
    private ArrayList<Edificio> edificios;
    private HashMap<Jugador, Integer> vecesCaidas;
    private int numCasas;
    private int numMaximoCasas;
    private int numHoteles;
    private int numMaximoHoteles;
    private int numPiscinas;
    private int numMaximoPiscinas;
    private int numPistas;
    private int numMaximoPistas;
    private int numTotalEdificios;
    private boolean edificable;

    public Casilla (String nombre, String tipo, Grupo grupo,int posicion, Jugador banca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.grupo = grupo;
        this.posicion = posicion;
        this.propietario = banca;
        this.numMaximoCasas = 4;
        switch (grupo.getColor()) {
            case Valor.GRUPO_NEGRO:
                this.valor = Valor.COSTE_GRUPO_NEGRO;
                this.alquiler = Valor.ALQUILER_GRUPO_NEGRO;
                this.numMaximoHoteles = 2;
                this.numMaximoPiscinas = 2;
                this.numMaximoPistas = 2;
                this.numTotalEdificios = 8;
                break;
            case Valor.GRUPO_CYAN:
                this.valor = Valor.COSTE_GRUPO_CYAN;
                this.alquiler = Valor.ALQUILER_GRUPO_CYAN;
                this.numMaximoHoteles = 3;
                this.numMaximoPiscinas = 3;
                this.numMaximoPistas = 3;
                this.numTotalEdificios = 12;
                break;
            case Valor.GRUPO_ROSA:
                this.valor = Valor.COSTE_GRUPO_ROSA;
                this.alquiler = Valor.ALQUILER_GRUPO_ROSA;
                this.numMaximoHoteles = 3;
                this.numMaximoPiscinas = 3;
                this.numMaximoPistas = 3;
                this.numTotalEdificios = 12;
                break;
            case Valor.GRUPO_NARANJA:
                this.valor = Valor.COSTE_GRUPO_NARANJA;
                this.alquiler = Valor.ALQUILER_GRUPO_NARANJA;
                this.numMaximoHoteles = 3;
                this.numMaximoPiscinas = 3;
                this.numMaximoPistas = 3;
                this.numTotalEdificios = 12;
                break;
            case Valor.GRUPO_ROJO:
                this.valor = Valor.COSTE_GRUPO_ROJO;
                this.alquiler = Valor.ALQUILER_GRUPO_ROJO;
                this.numMaximoHoteles = 3;
                this.numMaximoPiscinas = 3;
                this.numMaximoPistas = 3;
                this.numTotalEdificios = 12;
                break;
            case Valor.GRUPO_AMARILLO:
                this.valor = Valor.COSTE_GRUPO_AMARILLO;
                this.alquiler = Valor.ALQUILER_GRUPO_AMARILLO;
                this.numMaximoHoteles = 3;
                this.numMaximoPiscinas = 3;
                this.numMaximoPistas = 3;
                this.numTotalEdificios = 12;
                break;
            case Valor.GRUPO_VERDE:
                this.valor = Valor.COSTE_GRUPO_VERDE;
                this.alquiler = Valor.ALQUILER_GRUPO_VERDE;
                this.numMaximoHoteles = 3;
                this.numMaximoPiscinas = 3;
                this.numMaximoPistas = 3;
                this.numTotalEdificios = 12;
                break;
            case Valor.GRUPO_AZUL:
                this.valor = Valor.COSTE_GRUPO_AZUL;
                this.alquiler =Valor.ALQUILER_GRUPO_AZUL;
                this.numMaximoHoteles = 2;
                this.numMaximoPiscinas = 2;
                this.numMaximoPistas = 2;
                this.numTotalEdificios = 8;
                break;
        }
        this.avatares = new HashMap<>();
        this.edificios = new ArrayList<>();
        this.vecesCaidas = new HashMap<>();
        this.numCasas = 0;
        this.numHoteles = 0;
        this.numPiscinas = 0;
        this.numPistas = 0;
        this.edificable = false;
    }

    public Casilla (String nombre, String tipo, int posicion, Jugador banca){
        if (nombre == null) {
            System.out.println(Valor.ANSI_ROJO + "Nombre nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        if (tipo == null) {
            System.out.println(Valor.ANSI_ROJO + "Tipo nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.nombre = nombre;
        this.tipo = tipo;
        this.posicion = posicion;
        this.grupo = null;
        this.propietario = banca;
        this.avatares = new HashMap<>();
        this.vecesCaidas = new HashMap<>();
        this.edificios = new ArrayList<>();
        this.numCasas = 0;
        this.numHoteles = 0;
        this.numPiscinas = 0;
        this.numPistas = 0;
        this.numMaximoCasas = 0;
        this.edificable = false;

        switch(tipo){
            case "transporte":
                this.valor = Valor.COSTE_CASILLA_TRANSPORTE;
                this.alquiler = Valor.ALQUILER_TRANSPORTE;
                break;
            case "servicio":
                this.valor = Valor.COSTE_CASILLA_SERVIVIO;
                this.alquiler=Valor.ALQUILER_SERVICIO;
                break;
            case "impuesto":
                if(this.nombre.equals("Impuesto1")) this.alquiler = Valor.ALQUILER_IMPUESTO1;
                else this.alquiler = Valor.ALQUILER_IMPUESTO2;
            default:
                this.valor = 0;
        }

    }
    
    //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setPosicion(int posicion) {
        if (posicion <0 || posicion>40 || posicion<0 || posicion>40) {
            System.out.println(Valor.ANSI_ROJO + "Posicion no valida." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.posicion = posicion;
    }


    public void setNombre(String nombre) {
        if (nombre == null) {
            System.out.println(Valor.ANSI_ROJO + "Nombre nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null) {
            System.out.println(Valor.ANSI_ROJO + "Tipo nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.tipo = tipo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        if (grupo == null) {
            System.out.println(Valor.ANSI_ROJO + "Grupo nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.grupo = grupo;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        if (propietario == null) {
            System.out.println(Valor.ANSI_ROJO + "Propietario nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.propietario = propietario;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            System.out.println(Valor.ANSI_ROJO + "Valor no valido." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.valor = valor;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        if (alquiler < 0) {
            System.out.println(Valor.ANSI_ROJO + "Alquiler no valido." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.alquiler = alquiler;
    }

    public HashMap<String, Avatar> getAvatares() {
        return avatares;
    }

    public void setAvatares(HashMap<String, Avatar> avatares) {
        if (avatares == null) {
            System.out.println(Valor.ANSI_ROJO + "Avatares nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.avatares = avatares;
    }

    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {
        if (edificios == null) {
            System.out.println(Valor.ANSI_ROJO + "Edificios nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        this.edificios = edificios;
    }

    public HashMap<Jugador, Integer> getVecesCaidas() {
        return vecesCaidas;
    }

    public void setVecesCaidas(HashMap<Jugador, Integer> vecesCaidas) {
        this.vecesCaidas = vecesCaidas;
    }

    public int getPosicion() {
        return this.posicion;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }

    public int getNumHoteles() {
        return numHoteles;
    }

    public void setNumHoteles(int numHoteles) {
        this.numHoteles = numHoteles;
    }

    public int getNumPiscinas() {
        return numPiscinas;
    }

    public void setNumPiscinas(int numPiscinas) {
        this.numPiscinas = numPiscinas;
    }

    public int getNumPistas() {
        return numPistas;
    }

    public void setNumPistas(int numPistas) {
        this.numPistas = numPistas;
    }

    public int getNumMaximoCasas() {
        return numMaximoCasas;
    }

    public void setNumMaximoCasas(int numMaximoCasas) {
        this.numMaximoCasas = numMaximoCasas;
    }

    public int getNumMaximoHoteles() {
        return numMaximoHoteles;
    }

    public void setNumMaximoHoteles(int numMaximoHoteles) {
        this.numMaximoHoteles = numMaximoHoteles;
    }

    public int getNumMaximoPiscinas() {
        return numMaximoPiscinas;
    }

    public void setNumMaximoPiscinas(int numMaximoPiscinas) {
        this.numMaximoPiscinas = numMaximoPiscinas;
    }

    public int getNumMaximoPistas() {
        return numMaximoPistas;
    }

    public void setNumMaximoPistas(int numMaximoPistas) {
        this.numMaximoPistas = numMaximoPistas;
    }

    public int getNumTotalEdificios() {
        return numTotalEdificios;
    }

    public void setNumTotalEdificios(int numTotalEdificios) {
        this.numTotalEdificios = numTotalEdificios;
    }

    public boolean getEdificable() {
        return edificable;
    }

    public void setEdificable(boolean edificable) {
        this.edificable = edificable;
    }
   
    //Metodos

    public void edificar(String tipo, Jugador jugador) {
        boolean construir = false;
        if (numCasas + numHoteles + numPiscinas + numPistas == numTotalEdificios) {
            System.out.println("No se pueden construir mas edificios en la casilla " + nombre);
        } else {
            switch (tipo) {
                case Valor.EDIFICIO_CASA:
                    if (numCasas == 4) {
                        System.out.println("El solar " + nombre + " ya tiene 4 casas. No se pueden construir mas.");
                    } else if (numCasas == 3 && numMaximoCasas == 3) {
                        System.out.println("El solar " + nombre + " no se pueden construir mas casas.");
                    } else {
                        construir = true;
                    }
                    break;
                case Valor.EDIFICIO_HOTEL:
                    if (numHoteles == 3) {
                        System.out.println("El solar " + nombre + " ya tiene 3 hoteles. No se pueden construir mas.");
                    } else if (numHoteles == 2 && numMaximoHoteles == 2) {
                        System.out.println("En el solar " + nombre + " no se pueden construir mas hoteles.");
                    } else if (numCasas != 4) {
                        System.out.println("El solar " + nombre + " no tiene 4 casas. No se puede construir un hotel");
                    } else {
                        if ((numHoteles == 3 && numMaximoHoteles == 3) || (numHoteles == 2 && numMaximoHoteles == 2))
                            numMaximoCasas = 3;
                        construir = true;
                        numCasas = 0;
                        for (Edificio e : edificios) {
                            if (e.getTipo().equals(Valor.EDIFICIO_CASA))
                                edificios.remove(e);
                        }
                    }
                    break;
                case Valor.EDIFICIO_PISCINA:
                    if (numPiscinas == 3) {
                        System.out.println("El solar " + nombre + " ya tiene 3 piscinas. No se pueden construir mas.");
                    } else if (numPiscinas == 2 && numMaximoPiscinas == 2) {
                        System.out.println("En el solar " + nombre + " no se pueden construir mas piscinas.");
                    } else if (numHoteles < 1 && numCasas < 2){
                        System.out.println("El solar " + nombre + " no dispone de 1 hotel y 2 casas para construir una piscina.");
                    } else {
                        construir = true;
                    }
                    break;
                case Valor.EDIFICIO_PISTA:
                    if (numPistas == 3) {
                        System.out.println("El solar " + nombre + " ya tiene 3 pistas. No se pueden construir");
                    } else if (numPistas == 2 && numMaximoPistas == 2) {
                        System.out.println("En el solar " + nombre + " no se pueden construir mas pistas.");
                    } else if (numHoteles < 2) {
                        System.out.println("El solar " + nombre + " no tiene 2 hoteles. No se puede construir unha pista.");
                    } else {
                        construir = true;
                    }
                    break;
            }
            if (construir) {
                Edificio edificio = new Edificio(tipo, this);
                incrementarNumTipoEdificio(tipo);
                edificios.add(edificio);
                jugador.setFortuna(jugador.getFortuna() - edificio.getValor());
                jugador.setDineroInvertido(jugador.getDineroInvertido() + edificio.getValor());
                jugador.getEdificios().add(edificio);
                grupo.getEdificios().add(edificio);
            }
        }
    }

    public void incrementarNumTipoEdificio(String tipo) {
        switch (tipo) {
            case Valor.EDIFICIO_CASA:
                numCasas++;
                break;
            case Valor.EDIFICIO_HOTEL:
                numHoteles++;
                break;
            case Valor.EDIFICIO_PISCINA:
                numPiscinas++;
                break;
            case Valor.EDIFICIO_PISTA:
                numPistas++;
                break;
        }
    }

    /**
     *Obtiene el string de los nombres de los edificios de la casilla
     */
    public String obtenerEdificios() {
        String cadena = "";

        if (this.edificios.size() == 0)
            cadena = "no tiene edificios";
        else {
            for (Edificio edificio : edificios) {
                cadena = cadena.concat(edificio.getNombre() + " ");
            }
        }
        return cadena;
    }
    
    /**
     * Info breve sobre las casillas
     */
    public String shortInfo() {
        String cadena = new String();
        switch(tipo){
            case "solar":
                cadena = "{\n " +
                    "\t tipo: " + this.tipo +
                    ",\n\t grupo: " + this.grupo +
                    ",\n\t valor: " + this.valor +
                    "\n}";
                break;
            case "transporte": case "servicio":
                cadena = "{\n " +
                    "\t tipo: " + this.tipo +
                    ",\n\t valor: " + this.valor +
                    "\n}";
                break;
        }
        
        return cadena;
    }

    /**
     * Info completa de las casillas
     */
    public String info() {
        String cadena = new String();
        switch(this.tipo){
            case "solar":
                cadena = "{\n " +
                        "\t tipo: " + this.tipo +
                        ",\n\t grupo: " + this.grupo +
                        ",\n\t propietario: " + this.propietario.getNombre() +
                        ",\n\t valor: " + this.valor +
                        ",\n\t alquiler actual: " + this.alquiler +
                        ",\n\t alquiler inicial: " + this.valor * 0.9 +
                        ",\n\t edificios: [" + this.obtenerEdificios() +
                        "]\n\t valor hotel: " + this.valor * 0.6 + " (mas cuatro casas)" +
                        ",\n\t valor casa: " + this.valor * 0.6 +
                        ",\n\t valor piscina: " + this.valor * 0.4 +
                        ",\n\t valor pista de deporte: " + this.valor * 1.25 +
                        ",\n\t alquiler una casa: " + this.valor * 0.9 * 5 +
                        ",\n\t alquiler dos casas: " + this.valor * 0.9 * 15 +
                        ",\n\t alquiler tres casas: " + this.valor * 0.9 * 35 +
                        ",\n\t alquiler cuatro casas: " + this.valor * 0.9 * 50 +
                        ",\n\t alquiler hotel: " + this.valor * 0.9 * 70 +
                        ",\n\t alquiler piscina: " + this.valor * 25 +
                        ",\n\t alquiler pista de deporte: " + this.valor * 25 +
                        "\n}";
                break;
            case "transporte":
                cadena = "{\n " +
                        "\t tipo: " + this.tipo +
                        ",\n\t propietario: " + this.propietario.getNombre() +
                        ",\n\t valor: " + this.valor +
                        ",\n\t alquiler: " + this.alquiler +
                        "\n}";
                break;
            case "servicio":
                cadena = "{\n " +
                        "\t tipo: " + this.tipo +
                        ",\n\t propietario: " + this.propietario.getNombre() +
                        ",\n\t valor: " + this.valor +
                        ",\n\t alquiler: " + this.alquiler +
                        "\n}";            
                break;
            case "impuesto":
                cadena = "{\n " +
                        "\t tipo: " + this.tipo +
                        ",\n\t alquiler: " + this.alquiler +
                        "\n}";
                break;
            case "carcel":
                ArrayList<String> jug = new ArrayList<>();
                for(Avatar avat: this.avatares.values()){
                    jug.add(avat.getJugador().getNombre());
                }
                cadena = "{\n " +
                        "\t salir: " + Valor.COSTE_SALIR_CARCEL +
                        ",\n\t jugadores: " + jug +
                        "\n}";
                break;
            case "parking":
                ArrayList<String> jugad = new ArrayList<>();
                for(Avatar avat: this.avatares.values()){
                    jugad.add(avat.getJugador().getNombre());
                }
                cadena = "{\n " +
                        "\t bote: " + Valor.DINERO_PARKING +
                        ",\n\t jugadores: " + jugad +
                        "\n}";
                break;
            default:
                cadena = "{\n " +
                        "\t tipo: " + this.tipo +
                        "\n}";
        }
        
        return cadena;
    }

    /**
     * Comprueba si la casilla esta a la venta
     * @return  True si esta a la venta
     */
    public boolean seVende(){
        return propietario.getNombre().equals("banca") && valor>0;
    }
    
    /**
     * Añade un avatar a la casilla
     */
    public void anhadirAvatar(Avatar avatar){
        if(!this.avatares.containsKey(avatar.getId())){
            this.avatares.put(avatar.getId(), avatar);
        }
        else System.out.println("El avatar ya estaba en la casilla");
    }
    
    /**
     * Elimina un avatar de la casilla 
     */
    public void eliminarAvatar(Avatar avatar){
        if(this.avatares.containsKey(avatar.getId())){
            this.avatares.remove(avatar.getId());
        }
        else System.out.println("El avatar no esta en la casilla");
    }
    
    /**
     * Devuelve los IDs de los avatares de la casilla
     */
    public String stringAvatares() {
        String cadena_avatares = "";
        String cadena = "";
        if (this.avatares.size() != 0) {
            Iterator avatares_it = this.avatares.values().iterator();
            while (avatares_it.hasNext()) { /*Recorro los avatares y añado los IDs al string*/
                Avatar a = (Avatar) avatares_it.next();
                cadena_avatares = cadena_avatares.concat("&" + a.getId());
            }
        }
        cadena = cadena.concat(cadena_avatares);
        int t = Valor.TAMANHO_CASILLA - cadena_avatares.length();
        for (int i = 0; i < t; i++)
            cadena = cadena.concat(" ");

        return cadena;
    }

    /**
     * Devuelve el nombre de la casilla con su color correspondiente
     */
    public String printNombreColor() {
        String nombre = "";
        int t;
        if (this.nombre.length() < Valor.TAMANHO_CASILLA) {
            t = Valor.TAMANHO_CASILLA - this.nombre.length();
            if (t%2 == 0) {
                for (int i = 0; i < t / 2; i++)
                    nombre = nombre.concat(" ");
                if (this.grupo != null)
                    nombre = nombre.concat(this.grupo.obtenerColorPrint() + this.nombre + Valor.ANSI_RESET);
                else
                    nombre = nombre.concat(this.nombre);
                for (int i = 0; i < t / 2; i++)
                    nombre = nombre.concat(" ");
            } else {
                for (int i = 0; i < (t / 2) + 1; i++)
                    nombre = nombre.concat(" ");
                if (this.grupo != null)
                    nombre = nombre.concat(this.grupo.obtenerColorPrint() + this.nombre + Valor.ANSI_RESET);
                else
                    nombre = nombre.concat(this.nombre);
                for (int i = 0; i < t / 2; i++)
                    nombre = nombre.concat(" ");
            }
        } else
            nombre = this.grupo.obtenerColorPrint() + this.nombre + Valor.ANSI_RESET;
        return nombre;
    }

    @Override
    public String toString() {
       String cadena = this.printNombreColor();

       return cadena;
    }
}
