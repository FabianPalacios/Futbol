public class Alineacion {

    /**
     * Atributos de la clase Alineacion del equipo de futbol:
     * tecnico    - Referencia al tecnico que dirige el equipo-
     * formacion  - Referencia a la formacion de aliniacion del equipo.
     */
    private String tecnico;
    private String formacion;

    /**
     * Parametros del constructor de la clase Alineacion:
     * @param tecnico    - Tecnico del equipo
     * @param formacion  - Formacion del equipo.
     */
    public Alineacion(String tecnico, String formacion) {
        this.tecnico = tecnico;
        this.formacion = formacion;
    }
    
    /**
     * Constructor sin parametros de la clase Alineacion.
     */
    public Alineacion() {
    }

    /**
     * Metodo get que retonrna el tecnico del equipo de futbol.
     * @return
     */
    public String getTecnico() {
        return tecnico;
    }

    /**
     * Metodo set para modificar el tecnico del equipo de futbol.
     * @param tecnico
     */
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    /**
     * Metodo get que retorna la formacion del equipo de futbol.
     * @return
     */
    public String getFormacion() {
        return formacion;
    }

    /**
     * Metodo set para modifirar la formacion del equipo de futbol.
     * @param formacion
     */
    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    
    
    
}
