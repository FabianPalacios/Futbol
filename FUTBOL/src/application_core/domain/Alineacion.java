import java.util.List;

import Excepciones.DatosNoValidosAlineacion;
import Excepciones.DatosNoValidosJugador;

public class Alineacion {

    /**
     * Atributos de la clase Alineacion del equipo de futbol:
     * id         - Identificador de la alineación 
     * tecnico    - Referencia al tecnico que dirige el equipo-
     * formacion  - Referencia a la formacion de aliniacion del equipo.
     */
    private Integer id;
    private String tecnico;
    private String formacion;    
    private List<Jugador> jugadores;

    /**
     * Parametros del constructor de la clase Alineacion:
     * @param id         - identificador de la alineación 
     * @param tecnico    - Tecnico del equipo
     * @param formacion  - Formacion del equipo.
     */
    public Alineacion(Integer id, String tecnico, String formacion) {
        this.id = id;
        this.tecnico = tecnico;
        this.formacion = formacion;
    }
    
    /**
     * Constructor sin parametros de la clase Alineacion.
     */
    public Alineacion() {
    }

    /**
     * Metodo para validar que los datos del jugador sean correctos.
     * @throws DatosNoValidosAlineacion - excepcion para validar los datos del jugador.
     */
    public void ValidarDatosAlineacion() throws DatosNoValidosAlineacion {
        if(id <= 0){
            throw new DatosNoValidosAlineacion("El id debe ser mayor a 0");
        }
        if((tecnico == null) || (tecnico.trim().equals(""))){
            throw new DatosNoValidosAlineacion("El nombre del tecnico no puede ser null o vacio");
        }
        if((formacion == null) || (formacion.trim().equals(""))){
            throw new DatosNoValidosAlineacion("La formación no puede ser null o vacia");
        }
    }

    /**
     * Adicionar Jugador (Validar error)
     * @param jugador
     * @throws DatosNoValidosJugador
     */
    public void adicionarJugador(Jugador jugador) throws DatosNoValidosJugador{
        if (jugadores.size() <= 11){
            jugador.validarDatosJugador();
            jugadores.add(jugador);
        }
        
    }

    /**
     * Buscar un jugador por su id
     * @param id identificador del jugador
     * @return
     */
    public Jugador buscarJugador(int id) {
        for (Jugador j : jugadores) {
            if (j.getId() == id) {
                return j;
            }
        }
        return null;
    }

    /**
     * Eliminar un jugador
     * @param id
     */
    public void  EliminarJugador(int id){
        Jugador jugador = buscarJugador(id);
        jugadores.remove(jugador);
    }


    /**
     * 
     * @return Retorna el Identificador de la alineación 
     */
    public Integer getId() {
        return id;
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
