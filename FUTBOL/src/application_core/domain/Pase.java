import Excepciones.DatosNoValidosPase;

public class Pase {

    /**
     * Atributos de la clase Pase:
     * numJugadorUno  - Referencia al numero del jugador que realiza el pase.
     * numJugadorDos  - Referencia al numero del jugador a quien le pasa el balon. 
     * pasesExitosos  - Referencia al numero de pases exitoso que el jugador uno le 
     *                  entrgo al jugador dos.
     * pasesFallidos  - Referencia al numero de pases fallidos que el jugador uno le 
     *                  entrego al jugador dos.
     */
    private String numJugadorUno;
    private String numJugadorDos;
    private Integer pasesExitosos;
    private Integer pasesFallidos;

    private Alineacion alineacion;

    /**
     * Parametros del constructor de la clase Pase
     * @param numJugadorUno  - Numero del jugador uno.
     * @param numJugadorDos  - Numero del jugador dos.
     * @param pasesExitosos  - Numero de pases exitosos donde el jugador uno le paso 
     *                         el balon al jugador dos.
     * @param pasesFallidos  - Numero de pases fallidos donde el jugador uno le paso 
     *                         el balon al jugador dos.
     */
    public Pase(String numJugadorUno, String numJugadorDos, Integer pasesExitosos, Integer pasesFallidos,Alineacion alineacion ) {
        this.numJugadorUno = numJugadorUno;
        this.numJugadorDos = numJugadorDos;
        this.pasesExitosos = pasesExitosos;
        this.pasesFallidos = pasesFallidos;
        this.alineacion = alineacion;
    }

    /**
     * Constructor sin parametros de la clase Pase.
     */
    public Pase() {
    }

    /**
     * Metodo para validar que los datos de la clase Pase sean correctos.
     * @throws DatosNoValidosPase - excepcion para validar los datos del la clase Pase.
     */
    public void validarDatosPase() throws DatosNoValidosPase{
        if((numJugadorUno == null) || (numJugadorUno.trim().equals(""))){
            throw new DatosNoValidosPase("El numJugadorUno no puede ser null o vacio");
        }
        if((numJugadorDos == null) || (numJugadorDos.trim().equals(""))){
            throw new DatosNoValidosPase("El numJugadorDos no puede ser null o vacio");
        }
        if(pasesExitosos < 0){
            throw new DatosNoValidosPase("La cantidad de pasesExitosos no pueder ser menor a 0");
        }
        if(pasesFallidos < 0){
            throw new DatosNoValidosPase("La cantidad de pasesFallidos no pueder ser menor a 0");
        }
    }

    /**
     * Metodo get que retorna en numero del jugador uno.
     * @return
     */
    public String getNumJugadorUno() {
        return numJugadorUno;
    }

    /**
     * Metodo set para modificar en numero del jugador uno.
     * @param numJugadorUno
     */
    public void setNumJugadorUno(String numJugadorUno) {
        this.numJugadorUno = numJugadorUno;
    }

    /**
     * Metodo get que retorna el numero del jugador dos.
     * @return
     */
    public String getNumJugadorDos() {
        return numJugadorDos;
    }

    /**
     * Metodo set para modificar el numero del jugador dos.
     * @param numJugadorDos
     */
    public void setNumJugadorDos(String numJugadorDos) {
        this.numJugadorDos = numJugadorDos;
    }

    /**
     * Metodo get que retorna el numero de pases exitosos donde el jugador uno le entrego
     * el balon al jugador dos.
     * @return
     */
    public Integer getPasesExitosos() {
        return pasesExitosos;
    }

    /**
     * Metodo set para modificar el numero de pases exitosos donde el jugador uno le entrego
     * el balon al jugagor dos
     * @param pasesExitosos
     */
    public void setPasesExitosos(Integer pasesExitosos) {
        this.pasesExitosos = pasesExitosos;
    }

    /**
     * Metodo get que retorna el numero de pases fallidos donde el jugador uno no le entrego
     * el balon al jugagor dos
     * @return
     */
    public Integer getPasesFallidos() {
        return pasesFallidos;
    }

    /**
     * Metodo set para modificar el numero de pases fallidos donde el jugador uno no le entrego
     * el balon al jugagor dos
     * @param pasesFallidos
     */
    public void setPasesFallidos(Integer pasesFallidos) {
        this.pasesFallidos = pasesFallidos;
    }

    /**
     * 
     * @return Retorna una alineacion 
     */
    public Alineacion getAlineacion() {
        return alineacion;
    }

    /**
     * Modifica la alineacion 
     * @param alineacion
     */
    public void setAlineacion(Alineacion alineacion) {
        this.alineacion = alineacion;
    } 

    
    
}
