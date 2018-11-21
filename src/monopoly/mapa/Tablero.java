package monopoly.mapa;

import monopoly.persona.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Tablero {
    private ArrayList<ArrayList<Casilla>> casillas;
    private HashMap<String, Avatar> avatares;
    private HashMap<String, Jugador> jugadores;
    private HashMap<String, Grupo> grupos;

    public Tablero() {
        Jugador banca = new Jugador("banca");
        this.casillas = new ArrayList<>();
        this.avatares = new HashMap<>();
        ArrayList<Casilla> abajo = new ArrayList<>();
        ArrayList<Casilla> izquierda = new ArrayList<>();
        ArrayList<Casilla> derecha = new ArrayList<>();
        ArrayList<Casilla> arriba = new ArrayList<>();
        grupos = new HashMap<>();
        Grupo grupo_negro = new Grupo(Valor.GRUPO_NEGRO, Valor.COSTE_GRUPO_NEGRO, Valor.ALQUILER_GRUPO_NEGRO);
        Grupo grupo_cyan = new Grupo(Valor.GRUPO_CYAN, Valor.COSTE_GRUPO_CYAN, Valor.ALQUILER_GRUPO_CYAN);
        Grupo grupo_rosa = new Grupo(Valor.GRUPO_ROSA, Valor.COSTE_GRUPO_ROSA, Valor.ALQUILER_GRUPO_ROSA);
        Grupo grupo_naranja = new Grupo(Valor.GRUPO_NARANJA, Valor.COSTE_GRUPO_NARANJA, Valor.ALQUILER_GRUPO_NARANJA);
        Grupo grupo_rojo = new Grupo(Valor.GRUPO_ROJO, Valor.COSTE_GRUPO_ROJO, Valor.ALQUILER_GRUPO_ROJO);
        Grupo grupo_amarillo = new Grupo(Valor.GRUPO_AMARILLO, Valor.COSTE_GRUPO_AMARILLO, Valor.ALQUILER_GRUPO_AMARILLO);
        Grupo grupo_verde = new Grupo(Valor.GRUPO_VERDE, Valor.COSTE_GRUPO_VERDE, Valor.ALQUILER_GRUPO_VERDE);
        Grupo grupo_azul = new Grupo(Valor.GRUPO_AZUL, Valor.COSTE_GRUPO_AZUL, Valor.ALQUILER_GRUPO_AZUL);
        grupos.put(Valor.GRUPO_NEGRO, grupo_negro);
        grupos.put(Valor.GRUPO_CYAN, grupo_cyan);
        grupos.put(Valor.GRUPO_ROSA, grupo_rosa);
        grupos.put(Valor.GRUPO_NARANJA, grupo_naranja);
        grupos.put(Valor.GRUPO_ROJO, grupo_rojo);
        grupos.put(Valor.GRUPO_AMARILLO, grupo_amarillo);
        grupos.put(Valor.GRUPO_VERDE, grupo_verde);
        grupos.put(Valor.GRUPO_AZUL, grupo_azul);
        Casilla solar1GrupoNegro = new Casilla(Valor.SOLAR1_GRUPO_NEGRO, Valor.CASILLA_TIPO_SOLAR, grupo_negro,Valor.POSICION_SOLAR1_GRUPO_NEGRO, banca);
        Casilla solar2GrupoNegro = new Casilla(Valor.SOLAR2_GRUPO_NEGRO, Valor.CASILLA_TIPO_SOLAR, grupo_negro,Valor.POSICION_SOLAR2_GRUPO_NEGRO, banca);
        Casilla solar1GrupoCyan = new Casilla(Valor.SOLAR1_GRUPO_CYAN, Valor.CASILLA_TIPO_SOLAR, grupo_cyan,Valor.POSICION_SOLAR1_GRUPO_CYAN, banca);
        Casilla solar2GrupoCyan = new Casilla(Valor.SOLAR2_GRUPO_CYAN, Valor.CASILLA_TIPO_SOLAR, grupo_cyan,Valor.POSICION_SOLAR2_GRUPO_CYAN, banca);
        Casilla solar3GrupoCyan = new Casilla(Valor.SOLAR3_GRUPO_CYAN, Valor.CASILLA_TIPO_SOLAR, grupo_cyan,Valor.POSICION_SOLAR3_GRUPO_CYAN, banca);
        Casilla solar1GrupoRosa = new Casilla(Valor.SOLAR1_GRUPO_ROSA, Valor.CASILLA_TIPO_SOLAR, grupo_rosa,Valor.POSICION_SOLAR1_GRUPO_ROSA, banca);
        Casilla solar2GrupoRosa = new Casilla(Valor.SOLAR2_GRUPO_ROSA, Valor.CASILLA_TIPO_SOLAR, grupo_rosa,Valor.POSICION_SOLAR2_GRUPO_ROSA, banca);
        Casilla solar3GrupoRosa = new Casilla(Valor.SOLAR3_GRUPO_ROSA, Valor.CASILLA_TIPO_SOLAR, grupo_rosa,Valor.POSICION_SOLAR3_GRUPO_ROSA, banca);
        Casilla solar1GrupoNaranja = new Casilla(Valor.SOLAR1_GRUPO_NARANJA, Valor.CASILLA_TIPO_SOLAR, grupo_naranja,Valor.POSICION_SOLAR1_GRUPO_NARANJA, banca);
        Casilla solar2GrupoNaranja = new Casilla(Valor.SOLAR2_GRUPO_NARANJA, Valor.CASILLA_TIPO_SOLAR, grupo_naranja,Valor.POSICION_SOLAR2_GRUPO_NARANJA, banca);
        Casilla solar3GrupoNaranja = new Casilla(Valor.SOLAR3_GRUPO_NARANJA, Valor.CASILLA_TIPO_SOLAR, grupo_naranja,Valor.POSICION_SOLAR3_GRUPO_NARANJA, banca);
        Casilla solar1GrupoRojo = new Casilla(Valor.SOLAR1_GRUPO_ROJO, Valor.CASILLA_TIPO_SOLAR, grupo_rojo,Valor.POSICION_SOLAR1_GRUPO_ROJO, banca);
        Casilla solar2GrupoRojo = new Casilla(Valor.SOLAR2_GRUPO_ROJO, Valor.CASILLA_TIPO_SOLAR, grupo_rojo,Valor.POSICION_SOLAR2_GRUPO_ROJO, banca);
        Casilla solar3GrupoRojo = new Casilla(Valor.SOLAR3_GRUPO_ROJO, Valor.CASILLA_TIPO_SOLAR, grupo_rojo,Valor.POSICION_SOLAR3_GRUPO_ROJO, banca);
        Casilla solar1GrupoAmarillo = new Casilla(Valor.SOLAR1_GRUPO_AMARILLO, Valor.CASILLA_TIPO_SOLAR, grupo_amarillo,Valor.POSICION_SOLAR1_GRUPO_AMARILLO, banca);
        Casilla solar2GrupoAmarillo = new Casilla(Valor.SOLAR2_GRUPO_AMARILLO, Valor.CASILLA_TIPO_SOLAR, grupo_amarillo,Valor.POSICION_SOLAR2_GRUPO_AMARILLO, banca);
        Casilla solar3GrupoAmarillo = new Casilla(Valor.SOLAR3_GRUPO_AMARILLO, Valor.CASILLA_TIPO_SOLAR, grupo_amarillo,Valor.POSICION_SOLAR3_GRUPO_AMARILLO, banca);
        Casilla solar1GrupoVerde = new Casilla(Valor.SOLAR1_GRUPO_VERDE, Valor.CASILLA_TIPO_SOLAR, grupo_verde,Valor.POSICION_SOLAR1_GRUPO_VERDE, banca);
        Casilla solar2GrupoVerde = new Casilla(Valor.SOLAR2_GRUPO_VERDE, Valor.CASILLA_TIPO_SOLAR, grupo_verde,Valor.POSICION_SOLAR2_GRUPO_VERDE, banca);
        Casilla solar3GrupoVerde = new Casilla(Valor.SOLAR3_GRUPO_VERDE, Valor.CASILLA_TIPO_SOLAR, grupo_verde,Valor.POSICION_SOLAR3_GRUPO_VERDE, banca);
        Casilla solar1GrupoAzul = new Casilla(Valor.SOLAR1_GRUPO_AZUL, Valor.CASILLA_TIPO_SOLAR, grupo_azul,Valor.POSICION_SOLAR1_GRUPO_AZUL, banca);
        Casilla solar2GrupoAzul = new Casilla(Valor.SOLAR2_GRUPO_AZUL, Valor.CASILLA_TIPO_SOLAR, grupo_azul,Valor.POSICION_SOLAR2_GRUPO_AZUL, banca);
        grupo_negro.getCasillas().add(solar1GrupoNegro);
        grupo_negro.getCasillas().add(solar2GrupoNegro);
        grupo_cyan.getCasillas().add(solar1GrupoCyan);
        grupo_cyan.getCasillas().add(solar2GrupoCyan);
        grupo_cyan.getCasillas().add(solar3GrupoCyan);
        grupo_rosa.getCasillas().add(solar1GrupoRosa);
        grupo_rosa.getCasillas().add(solar2GrupoRosa);
        grupo_rosa.getCasillas().add(solar3GrupoRosa);
        grupo_naranja.getCasillas().add(solar1GrupoNaranja);
        grupo_naranja.getCasillas().add(solar2GrupoNaranja);
        grupo_naranja.getCasillas().add(solar3GrupoNaranja);
        grupo_rojo.getCasillas().add(solar1GrupoRojo);
        grupo_rojo.getCasillas().add(solar2GrupoRojo);
        grupo_rojo.getCasillas().add(solar3GrupoRojo);
        grupo_amarillo.getCasillas().add(solar1GrupoAmarillo);
        grupo_amarillo.getCasillas().add(solar2GrupoAmarillo);
        grupo_amarillo.getCasillas().add(solar3GrupoAmarillo);
        grupo_verde.getCasillas().add(solar1GrupoVerde);
        grupo_verde.getCasillas().add(solar2GrupoVerde);
        grupo_verde.getCasillas().add(solar3GrupoVerde);
        grupo_azul.getCasillas().add(solar1GrupoAzul);
        grupo_azul.getCasillas().add(solar2GrupoAzul);
        Casilla salida = new Casilla(Valor.CASILLA_SALIDA, Valor.CASILLA_TIPO_SALIDA,Valor.POSICION_CASILLA_SALIDA, banca);
        Casilla suerte1 = new Casilla(Valor.CASILLA_SUERTE, Valor.CASILLA_TIPO_SUERTE,Valor.POSICION_CASILLA_SUERTE1, banca);
        Casilla caja1 = new Casilla(Valor.CASILLA_CAJA, Valor.CASILLA_TIPO_CAJA,Valor.POSICION_CASILLA_CAJA1, banca);
        Casilla impuesto1 = new Casilla(Valor.CASILLA_IMPUESTO, Valor.CASILLA_TIPO_IMPUESTO,Valor.POSICION_CASILLA_IMPUESTO1, banca);
        Casilla transporte1 = new Casilla(Valor.CASILLA_TRANSPORTE, Valor.CASILLA_TIPO_TRANSPORTE,Valor.POSICION_CASILLA_TRANSPORTE1, banca);
        Casilla carcel = new Casilla(Valor.CASILLA_CARCEL, Valor.CASILLA_TIPO_CARCEL,Valor.POSICION_CASILLA_CARCEL, banca);
        Casilla servicio1 = new Casilla(Valor.CASILLA_SERVICIO, Valor.CASILLA_TIPO_SERVICIO,Valor.POSICION_CASILLA_SERVICIO1, banca);
        Casilla transporte2 = new Casilla(Valor.CASILLA_TRANSPORTE2, Valor.CASILLA_TIPO_TRANSPORTE,Valor.POSICION_CASILLA_TRANSPORTE2, banca);
        Casilla caja2 = new Casilla(Valor.CASILLA_CAJA, Valor.CASILLA_TIPO_CAJA,Valor.POSICION_CASILLA_CAJA2, banca);
        Casilla parking = new Casilla(Valor.CASILLA_PARKING, Valor.CASILLA_TIPO_PARKING,Valor.POSICION_CASILLA_PARKING, banca);
        Casilla suerte2 = new Casilla(Valor.CASILLA_SUERTE, Valor.CASILLA_TIPO_SUERTE,Valor.POSICION_CASILLA_SUERTE2, banca);
        Casilla transporte3 = new Casilla(Valor.CASILLA_TRANSPORTE3, Valor.CASILLA_TIPO_TRANSPORTE,Valor.POSICION_CASILLA_TRANSPORTE3, banca);
        Casilla servicio2 = new Casilla(Valor.CASILLA_SERVICIO, Valor.CASILLA_TIPO_SERVICIO,Valor.POSICION_CASILLA_SERVICIO2, banca);
        Casilla ircarcel = new Casilla(Valor.CASILLA_IR_CARCEL, Valor.CASILLA_TIPO_IR_CARCEL,Valor.POSICION_CASILLA_IR_CARCEL, banca);
        Casilla caja3 = new Casilla(Valor.CASILLA_CAJA, Valor.CASILLA_TIPO_CAJA,Valor.POSICION_CASILLA_CAJA3, banca);
        Casilla transporte4 = new Casilla(Valor.CASILLA_TRANSPORTE4, Valor.CASILLA_TIPO_TRANSPORTE,Valor.POSICION_CASILLA_TRANSPORTE4, banca);
        Casilla suerte3 = new Casilla(Valor.CASILLA_SUERTE, Valor.CASILLA_TIPO_SUERTE,Valor.POSICION_CASILLA_SUERTE3, banca);
        Casilla impuesto2 = new Casilla(Valor.CASILLA_IMPUESTO2, Valor.CASILLA_TIPO_IMPUESTO,Valor.POSICION_CASILLA_IMPUESTO2, banca);
        abajo.add(salida);
        abajo.add(solar1GrupoNegro);
        abajo.add(caja1);
        abajo.add(solar2GrupoNegro);
        abajo.add(impuesto1);
        abajo.add(transporte1);
        abajo.add(solar1GrupoCyan);
        abajo.add(suerte1);
        abajo.add(solar2GrupoCyan);
        abajo.add(solar3GrupoCyan);
        this.casillas.add(abajo);
        izquierda.add(carcel);
        izquierda.add(solar1GrupoRosa);
        izquierda.add(servicio1);
        izquierda.add(solar2GrupoRosa);
        izquierda.add(solar3GrupoRosa);
        izquierda.add(transporte2);
        izquierda.add(solar1GrupoNaranja);
        izquierda.add(caja2);
        izquierda.add(solar2GrupoNaranja);
        izquierda.add(solar3GrupoNaranja);
        this.casillas.add(izquierda);
        arriba.add(parking);
        arriba.add(solar1GrupoRojo);
        arriba.add(suerte2);
        arriba.add(solar2GrupoRojo);
        arriba.add(solar3GrupoRojo);
        arriba.add(transporte3);
        arriba.add(solar1GrupoAmarillo);
        arriba.add(solar2GrupoAmarillo);
        arriba.add(servicio2);
        arriba.add(solar3GrupoAmarillo);
        this.casillas.add(arriba);
        derecha.add(ircarcel);
        derecha.add(solar1GrupoVerde);
        derecha.add(solar2GrupoVerde);
        derecha.add(caja3);
        derecha.add(solar3GrupoVerde);
        derecha.add(transporte4);
        derecha.add(suerte3);
        derecha.add(solar1GrupoAzul);
        derecha.add(impuesto2);
        derecha.add(solar2GrupoAzul);
        this.casillas.add(derecha);

    }

    public ArrayList<ArrayList<Casilla>> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<ArrayList<Casilla>> casillas) {
        if (casillas == null) {
            System.out.println("Casillas nulas.");
            System.exit(1);
        }
        this.casillas = casillas;
    }

    public HashMap<String, Avatar> getAvatares() {
        return avatares;
    }

    public void setAvatares(HashMap<String, Avatar> avatares) {
        if (avatares == null) {
            System.out.println("Avatares nulos.");
            System.exit(1);
        }
        this.avatares = avatares;
    }

    public HashMap<String, Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashMap<String, Jugador> jugadores) {
        if (jugadores == null) {
            System.out.println("Jugadores nulos.");
            System.exit(1);
        }
        this.jugadores = jugadores;
    }

    
    //metodos
    
    /**
     * Busca una casilla del tablero por su nombre
     * @param nombre Nombre de la casila a buscar
     * @return Casilla si existe. Si no existe return null
     */
    public Casilla casillaByName(String nombre){
        if(nombre == null){
            System.out.println(Valor.ANSI_ROJO + "Nombre nulo." + Valor.ANSI_RESET);
            System.exit(1);
        }
        for(ArrayList<Casilla> n: casillas){
            for(Casilla cas: n){
                if (cas.getNombre().equals(nombre))
                    return cas;
            }
        }
            return null;      
    }
    
    public ArrayList<Casilla> casillasEnVenta(){
        ArrayList<Casilla> casVent = new ArrayList<>();
        for(ArrayList<Casilla> n: casillas){
            for(Casilla cas: n){
                if(cas.seVende())
                    casVent.add(cas);
            }
        }
        return casVent;
    }

    public String imprimirBordeSuperior() {
        String cadena = Valor.ESQUINA_SUPERIOR_IZQUIERDA;
        for (int i = 0; i < Valor.TAMANHO_LINEA; i++) {
            if (i != 0 && i % Valor.TAMANHO_CASILLA == 0)
                cadena = cadena.concat(Valor.INTERSECCION_SUPERIOR);
            cadena = cadena.concat(Valor.LINEA_HORIZONTAL);
        }
        cadena = cadena.concat(Valor.ESQUINA_SUPERIOR_DERECHA);

        return cadena;
    }

    public String imprimirBordeInferior() {
        String cadena = Valor.ESQUINA_INFERIOR_IZQUIERDA;
        for (int i = 0; i < Valor.TAMANHO_LINEA; i++) {
            if (i != 0 && i % Valor.TAMANHO_CASILLA == 0)
                cadena = cadena.concat(Valor.INTERSECCION_INFERIOR);
            cadena = cadena.concat(Valor.LINEA_HORIZONTAL);
        }
        cadena = cadena.concat(Valor.ESQUINA_INFERIOR_DERECHA);

        return cadena;
    }

    public String imprimirEspacio() {
        String cadena = "";
        /*for (int i = 0; i < Valor.TAMANHO_LINEA - (Valor.TAMANHO_CASILLA  * 2) + 8 ; i++)
            cadena = cadena.concat(" ");*/
        for (int i = 0; i < (Valor.TAMANHO_CASILLA * 9) + 8; i++)
            cadena = cadena.concat(" ");

        return cadena;
    }

    public String imprimirEspacio(boolean medio) {
        String cadena = "";
        for (int i = 0; i < Valor.TAMANHO_CASILLA; i++)
            cadena = cadena.concat(Valor.LINEA_HORIZONTAL);

        return cadena;
    }

    public String imprimirHorizontal() {
        String cadena  = "";
        for (int i = 0; i < Valor.TAMANHO_CASILLA; i++)
            cadena = cadena.concat(Valor.LINEA_HORIZONTAL);

        return cadena;
    }

    @Override
    public String toString() {
        return this.imprimirBordeSuperior() + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(2).get(0) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(1) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(2) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(3) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(4) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(5)  + Valor.LINEA_VERTICAL + this.casillas.get(2).get(6) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(7) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(8) + Valor.LINEA_VERTICAL + this.casillas.get(2).get(9) + Valor.LINEA_VERTICAL + this.casillas.get(3).get(0)  + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(2).get(0).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(2).get(1).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(2).get(2).stringAvatares() + Valor.LINEA_VERTICAL +  this.casillas.get(2).get(3) .stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(2).get(4).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(2).get(5).stringAvatares()  + Valor.LINEA_VERTICAL +  this.casillas.get(2).get(6).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(2).get(7).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(2).get(8).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(2).get(9).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(0).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_TOTAL + this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR +  this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR  + this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_INFERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_TOTAL + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(9) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(1) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(9).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL +  this.casillas.get(3).get(1).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(8) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(2) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(8).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(2).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(7) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(3) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(7).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(3).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA +  "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(6) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(4) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(6).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(4).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA +  "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(5) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(5) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(5).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(5).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA +  "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(4) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(6) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(4).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(6).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA +  "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(3) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(7) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(3).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(7).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA +  "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(2) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(8) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(2).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(8).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_DERECHA + this.imprimirEspacio() +  Valor.INTERSECCION_IZQUIERDA + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA +  "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(1) + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(9) + Valor.LINEA_VERTICAL + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(1).stringAvatares() + Valor.LINEA_VERTICAL + this.imprimirEspacio() + Valor.LINEA_VERTICAL + this.casillas.get(3).get(9).stringAvatares() + Valor.LINEA_VERTICAL + "\n" +
                Valor.INTERSECCION_IZQUIERDA + this.imprimirEspacio(true) + Valor.INTERSECCION_TOTAL + this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR +  this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR  + this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_SUPERIOR + this.imprimirHorizontal() + Valor.INTERSECCION_TOTAL + this.imprimirHorizontal() + Valor.INTERSECCION_DERECHA + "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(0) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(9) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(8) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(7) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(6) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(5) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(4) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(3) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(2) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(1) + Valor.LINEA_VERTICAL + this.casillas.get(0).get(0) + Valor.LINEA_VERTICAL +  "\n" +
                Valor.LINEA_VERTICAL + this.casillas.get(1).get(0).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(9).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(8).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(7).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(6).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(5).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(4).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(3).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(2).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(1).stringAvatares() + Valor.LINEA_VERTICAL + this.casillas.get(0).get(0).stringAvatares() + Valor.LINEA_VERTICAL +  "\n" +
                this.imprimirBordeInferior() + "\n";
    }

    public HashMap<String, Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(HashMap<String, Grupo> grupos) {
        this.grupos = grupos;
    }
}
