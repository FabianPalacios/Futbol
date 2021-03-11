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
    private int pasesExitosos;
    private int pasesFallidos;

    /**
     * Parametros del constructor de la clase Pase
     * @param numJugadorUno  - Numero del jugador uno.
     * @param numJugadorDos  - Numero del jugador dos.
     * @param pasesExitosos  - Numero de pases exitosos donde el jugador uno le paso 
     *                         el balon al jugador dos.
     * @param pasesFallidos  - Numero de pases fallidos donde el jugador uno le paso 
     *                         el balon al jugador dos.
     */
    public Pase(String numJugadorUno, String numJugadorDos, int pasesExitosos, int pasesFallidos) {
        this.numJugadorUno = numJugadorUno;
        this.numJugadorDos = numJugadorDos;
        this.pasesExitosos = pasesExitosos;
        this.pasesFallidos = pasesFallidos;
    }

    /**
     * Constructor sin parametros de la clase Pase.
     */
    public Pase() {
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
    public int getPasesExitosos() {
        return pasesExitosos;
    }

    /**
     * Metodo set para modificar el numero de pases exitosos donde el jugador uno le entrego
     * el balon al jugagor dos
     * @param pasesExitosos
     */
    public void setPasesExitosos(int pasesExitosos) {
        this.pasesExitosos = pasesExitosos;
    }

    /**
     * Metodo get que retorna el numero de pases fallidos donde el jugador uno no le entrego
     * el balon al jugagor dos
     * @return
     */
    public int getPasesFallidos() {
        return pasesFallidos;
    }

    /**
     * Metodo set para modificar el numero de pases fallidos donde el jugador uno no le entrego
     * el balon al jugagor dos
     * @param pasesFallidos
     */
    public void setPasesFallidos(int pasesFallidos) {
        this.pasesFallidos = pasesFallidos;
    }   
    
}
