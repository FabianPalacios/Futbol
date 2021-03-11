public class Jugador {

    /**
     * Atributos de las clase Jugador:
     * nombre    - Referencia al nombre que posee el jugador.
     * apellido  - Referencia al apellido que posee el jugador. 
     * numero    - Referencia al numero que posee el jugador dentro del equipo. 
     */
    private String nombre;
    private String apellido;
    private String numero;

    /**
     * Parametros del constructor de la clase Jugador:
     * @param nombre   - Nombre del jugador.
     * @param apellido - Apellido del jugador.
     * @param numero   - Numero del jugaor en el equipo.
     */
    public Jugador(String nombre, String apellido, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    /**
     * Constructor sin parametros de la clase Jugador.
     */
    public Jugador() {
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
