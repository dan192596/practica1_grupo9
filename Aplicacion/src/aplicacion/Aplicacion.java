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
        System.out.println(EsPrimo(2));
        System.out.println(EsPrimo(3));
        System.out.println(EsPrimo(4));
        System.out.println(EsPrimo(5));
        System.out.println(EsPrimo(6));
        System.out.println(EsPrimo(7));
        System.out.println(EsPrimo(8));
        System.out.println(EsPrimo(9));
        System.out.println(EsPrimo(10));
        System.out.println(EsPrimo(11));
    }
    
    public static boolean EsPrimo(int numero){
        if(numero ==1||numero==0){
            return true;
        }else if(numero <0){
            return false;
        }
        boolean EsPrimo = true;
        for(int i =2;i<numero;i++){
            if(numero%i==0)return false;            
        }
        return true;
    }
}
