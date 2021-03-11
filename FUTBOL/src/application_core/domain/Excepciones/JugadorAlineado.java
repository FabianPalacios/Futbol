package Excepciones;

@SuppressWarnings("serial")
public class JugadorAlineado extends Exception{
    public JugadorAlineado(String mensaje){
        super(mensaje);
    }
}
