package Excepciones;

@SuppressWarnings("serial")
public class DatosNoValidosEquipo extends Exception {
    public DatosNoValidosEquipo(String mensaje){
        super(mensaje);
    }
}
