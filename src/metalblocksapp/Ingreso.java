package metalblocksapp;
import java.util.Random;
public class Ingreso implements CodigoVerificacion {
    
    //MÉTODO CONSTRUCTOR
    public  Ingreso(){      
    }
    
    //MÉTODOS QUE TIENE LA CLASE
    //#1
    @Override
    public int generarCodigo() {
        //CREAR UNA INSTANCIA DE RANDOM
        Random rand = new Random();
        //GENERAR EL CPODIGO ALEATORIO ENTRE 0 Y 100
        int randomNum = rand.nextInt(900)+100;
        //RETORNA EL CÓDIGO
        return randomNum;
    }
    
    //#2
    @Override
    public int comprobarCodigo(String generar, String comprobado) {
        System.out.println(generar+" "+ comprobado);
        return generar.compareTo(comprobado);
    }
    
}
