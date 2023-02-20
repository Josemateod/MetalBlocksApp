package metalblocksapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Registro implements ArchivoScanner {

    public Registro() {
    }

    
    
    @Override
    public void escribirArchivo(String mineral, String peso, String precio,String metodo) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo=new File("Registro.txt");
        try{
            escribir=new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println("MINERAL"+"     PESO"+"     PRECIO"+"     METODO PAGO");
            linea.println(mineral+"      "+peso+"       "+precio+"      "+metodo);
            linea.close();
            escribir.close();
        }catch(IOException e){
            
        }
    }

    @Override
    public ArrayList<String> leerArchivoNombreMineral() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String> leerArchivoPrecioMineral() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
