/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Gary Joan
 */
public class cubo_y_raiz_cubica {
       public static int cubo(int numero){
        return numero*numero*numero;
    
    }

    public int RaizCubica (int numero){
        return (int)Math.pow((double)numero, 1.0/3.0);
    }
    public static int multiplicacion (int numero1, int numero2){
        return numero1* numero2;
    }
    
    public static int division(int numero1, int numero2){
        return numero1/numero2;
    
    }
}