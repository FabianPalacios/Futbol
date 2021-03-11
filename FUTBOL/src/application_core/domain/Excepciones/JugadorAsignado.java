package Excepciones;

@SuppressWarnings("serial")
public class JugadorAsignado extends Exception{
    public JugadorAsignado(String mensaje){
        super(mensaje);
    }
}
