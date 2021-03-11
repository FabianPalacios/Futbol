import java.util.Date;

public class Partido {

    /**
     * Atributos de la clase Partido:
     * fecha        - Referencia a la fecha en la que se jugara el partido de futbol.
     * ciudad       - Referencia la ciudad en donde se jugara el partido de futbol.
     * equipoRival  - Referencia el equipo con el cual se jugara el partido de futbol.
     */
    private Date fecha;
    private String ciudad;
    private String equipoRival;

    /**
     * Parametrod del constructor de la clase Partido:
     * @param fecha        - Fecha el la que se va a jugar el partido.
     * @param ciudad       - Ciudad en la que se jugara el partido.
     * @param equipoRival  - Equipo rival con quin se jugara el partido.
     */
    public Partido(Date fecha, String ciudad, String equipoRival) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.equipoRival = equipoRival;
    }

    /**
     * Construnctor sin parametros de la clase Partido.
     */
    public Partido() {
    }

    /**
     * Metodo get que retorna la fecha del partido a jugar.
     * @return
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Metodo set para modificar la fecha el partido a jugar.
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo get que retorna la ciudad en donde se jugara el partido.
     * @return
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Metodo set para modificar la ciudad en donde se jugara el partido.
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Metodo get que retorna el equipo rival con el que se jugara el partido.
     * @return
     */
    public String getEquipoRival() {
        return equipoRival;
    }

    /**
     * Metodo set para modificar el equipo rival con el que se jugara el partido.
     * @param equipoRival
     */
    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    

      
}
