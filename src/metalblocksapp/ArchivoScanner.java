package metalblocksapp;

import java.util.ArrayList;

/**
 * 
 * Interface que permite agregar métodos al Metal
 */
interface ArchivoScanner {
     public ArrayList<String> leerArchivoNombreMineral();
     public ArrayList<String> leerArchivoPrecioMineral();
     public void escribirArchivo(String mineral,String peso, String precio,String metodo);
}
