package metalblocksapp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * ESTA CLASE PERMITE OBTENER LOS DATOS DE LOS METALES
 * ALMACENADOS EN ARCHIVOS PLANOS
 */
public class Metal implements FormulaPeso, ArchivoScanner {
    //ATRIBUTOS DEL METAL DEL USUARIO
    private String nombre;
    private float peso;

    //CONSTRUCTOR
    public Metal() {
    }

    public Metal(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public ArrayList<String> leerArchivoNombreMineral() {
       ArrayList<String> listaMinerales = new ArrayList<String>();
        File archivo= new File("ListaNombreMinerales.txt");
        try{
            FileReader f=new FileReader(archivo);
            Scanner ingreso=new Scanner(f);
            ingreso.useLocale(Locale.ENGLISH);
            while(ingreso.hasNext()){
                nombre=ingreso.next();
                listaMinerales.add(nombre);
            }           
        }catch(IOException e){
            
        }
        return listaMinerales;
    }

    @Override
    public ArrayList<String> leerArchivoPrecioMineral() {
       ArrayList<String> listaPrecioMinerales = new ArrayList<String>();
        float precio;
        File archivo= new File("ListaPrecioMinerales.txt");
        try{
            FileReader f=new FileReader(archivo);
            Scanner ingreso=new Scanner(f);
            ingreso.useLocale(Locale.ENGLISH);
            while(ingreso.hasNextFloat()){
                precio=ingreso.nextFloat();
                //CONVERTIR DE FLOTANTE A STRING
                listaPrecioMinerales.add(String.valueOf(precio));
            }           
        }catch(IOException e){
            
        }
        return listaPrecioMinerales;
    }

    @Override
    public float calculoPrecio(float a, float b) {
        return a*b;
    }

    @Override
    public void escribirArchivo(String mineral, String peso, String precio,String metodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

       
}
