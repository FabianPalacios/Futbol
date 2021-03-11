package Excepciones;

@SuppressWarnings("serial")
public class DatosNoValidosPase extends Exception{
    public DatosNoValidosPase(String mensaje){
        super(mensaje);
    }
}
