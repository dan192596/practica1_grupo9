/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author danie
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static boolean EsPrimo(int numero){
        if(numero ==1||numero==0){
            System.out.println("Es primo");
            return true;            
        }else if(numero <0){
            System.out.println("No es primo");
            return false;
        }
        for(int i =2;i<numero;i++){
            if(numero%i==0){System.out.println("No es primo"); return false;}
        }
        System.out.println("Si es Primo");
        return true;
    }
}
