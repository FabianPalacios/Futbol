package Excepciones;

@SuppressWarnings("serial")
public class DivisionPorCero extends Exception{
    public DivisionPorCero(String mensaje){
        super(mensaje);
    }
}