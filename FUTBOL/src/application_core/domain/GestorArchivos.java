import java.io.*;

public class GestorArchivos {

    /**
     * Atributos de la clase GestorArchivos
     * archivo - Extrae el archivo plano con una ruta.
     * fr      - Lee la informacion que se encuentra dentro del archivo plano.
     * br      - Almacena la informacion del archivo plano en Buffer para ser tratada.
     */
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    
    /**
     * Metodo que retorna un String de todos los datos del archivo plano.
     * @return - Retorna una cadena de los elementos del archivo plano.
     */
    public String leerArchivoPlano() {
        String cadena = "";

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("C:\\archivo.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
   
            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
                cadena += linea;
         }
         catch(Exception e){
            e.printStackTrace();
        }

        return cadena;       
    }   


    public void actualizarArchivo() throws IOException{
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/prueba.txt");

            BufferedWriter bw = new BufferedWriter(fichero);
                for (int i = 0; i < 10; i++){
                    pw.write("Linea " + i);
                }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
            
        }

        if(fichero != null){
            fichero.close();
        }    
    }

}
