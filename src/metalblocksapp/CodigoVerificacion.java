package metalblocksapp;
/**
 * 
 * SE CREA LA ABSTRACTA PARA IMPLEMENTAR EN EL INGRESO A 
 * LA APP EL CÓDIGO QUE PERMITA ACCEDER AL USUARIO
 */
public interface CodigoVerificacion {
    public int generarCodigo(); 
    public int comprobarCodigo(String a, String b);
}
