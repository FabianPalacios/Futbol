package Excepciones;

@SuppressWarnings("serial")
public class JugadorNoAsignado extends Exception {
    public JugadorNoAsignado(String mensaje){
        super(mensaje);
    }
}
