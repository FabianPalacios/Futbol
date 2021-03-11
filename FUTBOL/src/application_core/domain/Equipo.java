public class Equipo {

    /**
     * Atributos de las clase Equipo:
     * nombre  - Referencia al nombre que posee el equipo de fulbol
     */
    private String nombre;

    /**
     * Parametros del constructor de la clase Equipo:
     * @param nombre  - Nombre del equipo de futbol.
     */
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor sin parametros de la clase Equipo.
     */
    public Equipo() {
    }

    /**
     * Metodo get que retorna el nombre del equipo de futbol.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set para modificar el nombre del equipo de futbol.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}
