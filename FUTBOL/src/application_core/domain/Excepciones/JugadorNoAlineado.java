package Excepciones;

@SuppressWarnings("serial")
public class JugadorNoAlineado extends Exception{
    public JugadorNoAlineado(String mensaje){
        super(mensaje);
    }
}
