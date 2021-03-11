import java.util.Date;
import java.util.List;

import Excepciones.DatosNoValidosEquipo;
import Excepciones.DatosNoValidosPartido;

public class Partido {

    /**
     * Atributos de la clase Partido:
     * id           - Identificador del partido
     * fecha        - Referencia a la fecha en la que se jugara el partido de futbol.
     * ciudad       - Referencia la ciudad en donde se jugara el partido de futbol.
     * equipoRival  - Referencia el equipo con el cual se jugara el partido de futbol.
     */
    private Integer id;
    private Date fecha;
    private String ciudad;
    private String equipoRival;
    private List<Equipo> equipos;

    /**
     * Parametrod del constructor de la clase Partido:
     * @param id           - Identificador del partido
     * @param fecha        - Fecha el la que se va a jugar el partido.
     * @param ciudad       - Ciudad en la que se jugara el partido.
     * @param equipoRival  - Equipo rival con quin se jugara el partido.
     */
    public Partido(Integer id, Date fecha, String ciudad, String equipoRival) {
        this.id = id;
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
     * Metodo para validar que los datos del partido sean correctos.
     * @throws DatosNoValidosPartido - Excepcion para validar los datos de la clase Partido.
     */
    public void validarDatosPartido() throws DatosNoValidosPartido{
        if(id <= 0 ){
            throw new DatosNoValidosPartido("El id no pueder ser menor a 0");
        }
        if(fecha == null){
            throw new DatosNoValidosPartido("El id no pueder ser menor a 0");
        }
        if((ciudad == null) || (ciudad.trim().equals(""))){
            throw new DatosNoValidosPartido("La ciudad no puede ser null o vacio");
        }
        if((equipoRival == null) || (equipoRival.trim().equals(""))){
            throw new DatosNoValidosPartido("El nombre del equipoRival no puede ser null o vacio");
        }
    }

    /**
     * Agregar un equipo al partido
     * @param equipo
     * @throws DatosNoValidosEquipo
     */
    public void adicionarEquipo(Equipo equipo) throws DatosNoValidosEquipo{
        equipo.validarDatosEquipo();
        equipos.add(equipo);
    }

    /**
     * Buscar un Equipo por su identificación 
     * @param id identificador del equipo
     * @return
     */
    public Equipo buscarEquipo(int id) {
        for (Equipo e : equipos) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    /**
     * 
     * @return Retorna el identificador del partido
     */
    public Integer getId() {
        return id;
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
