package Excepciones;

@SuppressWarnings("serial")
public class DatosNoValidosPartido extends Exception{
    public DatosNoValidosPartido(String mensaje){
        super(mensaje);
    }
}
