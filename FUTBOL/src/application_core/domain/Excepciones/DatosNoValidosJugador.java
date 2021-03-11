package Excepciones;


@SuppressWarnings("serial")
public class DatosNoValidosJugador extends Exception {
    public DatosNoValidosJugador(String mensaje){
       super(mensaje);
    }
}
