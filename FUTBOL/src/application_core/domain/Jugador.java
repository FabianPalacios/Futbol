import java.util.List;

import Excepciones.DatosNoValidosJugador;
import Excepciones.DatosNoValidosPase;

public class Jugador {

    /**
     * Atributos de las clase Jugador:
     * id        - identificador del jugador
     * nombre    - Referencia al nombre que posee el jugador.
     * apellido  - Referencia al apellido que posee el jugador. 
     * numero    - Referencia al numero que posee el jugador dentro del equipo. 
     */
    private Integer id;
    private String nombre;
    private String apellido;
    private String numero;

    private List<Pase> pases;

    /**
     * Parametros del constructor de la clase Jugador:
     * @param id       - Identificador del jugador
     * @param nombre   - Nombre del jugador.
     * @param apellido - Apellido del jugador.
     * @param numero   - Numero del jugaor en el equipo.
     */
    public Jugador(Integer id, String nombre, String apellido, String numero) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    /**
     * Constructor sin parametros de la clase Jugador.
     */
    public Jugador() {
    }

    public void validarDatosJugador() throws DatosNoValidosJugador{
        if(id <= 0 ){
            throw new DatosNoValidosJugador("El id no pueder ser menor a 0");
        }
        if((nombre == null) || (nombre.trim().equals(""))){
            throw new DatosNoValidosJugador("El nombre no puede ser null o vacio");
        }
        if((apellido == null) || (apellido.trim().equals(""))){
            throw new DatosNoValidosJugador("El apellido no puede ser null o vacio");
        }
        if((numero == null) || (numero.trim().equals(""))){
            throw new DatosNoValidosJugador("El numero no puede ser null o vacio");
        }
    }

    /**
    * Agregar un pase
    * @param pase
     * @throws DatosNoValidosPase
    */
    public void adicionarPase(Pase pase) throws DatosNoValidosPase{
        pase.validarDatosPase();
        pases.add(pase);
    }

    
    /**
     * 
     * @return Retorna el id del jugador
     */
    public Integer getId() {
        return id;
    }

    /**
     * Metodo get que retorna el nombre del jugador.
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    


    /**
     * Metodo set para modificar el nombre del jugador.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo ger para retornar el apellido del jugador.
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo set para modificar el apellido del jugador.
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo get para retornar el numero que el jugador tiene en el equipo.
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Metodo set para modificar el numero que el jugador tiene en el equipo.
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

  
}
