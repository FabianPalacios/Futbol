import java.io.IOException;
import java.util.List;

import Excepciones.ArchivoVacio;
import Excepciones.DatosNoValidosEquipo;
import Excepciones.DatosNoValidosJugador;
import Excepciones.JugadorAsignado;
import Excepciones.JugadorNoAsignado;

public class Equipo {

    
    /**
     * Atributos de las clase Equipo:
     * Id -  Identificador del equipo
     * nombre  - Referencia al nombre que posee el equipo de fulbol
     */
    private Integer id;
    private String nombre;
    private List<Jugador> jugadores;
    private GestorArchivos archivos;


    /**
     * Parametros del constructor de la clase Equipo:
     * @param nombre  - Nombre del equipo de futbol.
     */
    public Equipo(Integer id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Constructor sin parametros de la clase Equipo.
     */
    public Equipo() {
    }

    /**
     * Metodo para validar que los datos de la clase Equipo sean correctos.
     * @throws DatosNoValidosEquipo - excepcion para validar los datos de la clase Equipo.
     */
    public void validarDatosEquipo() throws DatosNoValidosEquipo {
        if(id <= 0){
            throw new DatosNoValidosEquipo("El id debe ser mayor a 0");
        }
        if((nombre == null) || (nombre.trim().equals(""))){
            throw new DatosNoValidosEquipo("El nombre no pueder ser null o vacio");
        }
    }
    /**
     * Adicionar un jugador al equipo
     * @param nombre Nombre Jugador
     * @param apellido Apellido Jugador
     * @param numero Numero de juego 
     * @throws DatosNoValidosJugador
     * @throws JugadorAsignado
     */
    public void adicionarJugador(Integer id,String nombre, String apellido, String numero) throws DatosNoValidosJugador, JugadorAsignado{
        Jugador jugador = new Jugador(id,nombre, apellido, numero);
        jugador.validarDatosJugador();
        
        if (buscarJugador(jugador.getId(), jugador.getNumero()) == null){
            jugadores.add(jugador);
        }
        else{
            throw new JugadorAsignado("El id o numero del jugador ya existe");
        }
        
        
    }

    /**
     * Buscar un jugador por id o que no se repita el numero del un jugador
     * @param id identificador del jugador
     * @return retorna el jugador con el id o null si no lo encuentra
     */
    public Jugador buscarJugador(int id, String numero) {
        for (Jugador j : jugadores) {
            if ((j.getId() == id) || (j.getNumero() == numero)) {
                return j;
            }
        }
        return null;
    }


    /**
     * Eliminar un jugador por su id y numero
     * @param id identificador 
     * @throws JugadorNoAsignado
     */
    public void  eliminarJugador(int id, String numero) throws JugadorNoAsignado{
        Jugador jugador = buscarJugador(id, numero);
        if (jugador == null){
            throw new JugadorNoAsignado("El jugador a eliminar no existe");
        }
        else{
            jugadores.remove(jugador);
        }
    }

    /**
     * Metodo para enviar la informacion a las diferentes clases.
     * @throws ArchivoVacio - Error si el archivo regresa vacio.
     */
    public void llenadoDeDatos() throws ArchivoVacio{

        String datos = archivos.leerArchivoPlano();

        if(datos.trim().equals("")){
            throw new ArchivoVacio("El archivo plano no tiene datos");
        }else{
            /**
             * Como no se sabemos como viene distribuida la informacion dentro del  
             * archivo plano, no se puede organizarla distribuir la informacion en las
             * diferentes clases y crear los objetos de cada clase.
             */
            
        } 
    
    }

    /**
     * Metodo para modificar el archivo plano
     * @param datos         - Datos de entrada que se van a copiar en el archivo plano. 
     * @throws IOException  - Excepcion para contolar errores de archivos planos
     */
    public void guardarArchivo(String datos) throws IOException{        
        archivos.actualizarArchivo(datos);   
    }


    
    /**
     * 
     * @return Retorna el identificador del Equipo
     */
    public Integer getId() {
        return id;
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
