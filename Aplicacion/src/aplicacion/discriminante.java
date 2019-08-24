/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import static aplicacion.Aplicacion.EsPrimo;
import static java.lang.System.out;

/**
 *
 * @author Gary Joan
 */
public class discriminante {

    public static void ver_discriminante(double a1, double b1, double c1) {

        double x1, x2;

        double a = a1;

        double b = b1;

        double c = c1;

        // 0x^2 + 0x + 0 = 0
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        }

        // 0x^2 + 0x + c = 0  con c distinto de 0
        if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("La ecuación no tiene solución.");
        }

        // ax^2 + bx + 0 = 0  con a y b distintos de 0
        if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }

        // 0x^2 + bx + c = 0  con b y c distintos de 0
        if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println("x1 = x2 = " + (-c / b));
        }

        // ax^2 + bx + c = 0  con a, b y c distintos de 0
        if ((a != 0) && (b != 0) && (c != 0)) {

            double discriminante = b * b - (4 * a * c);
            double b_cuadrado = b * b;
            if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
            } else {
                //System.out.println("\nx1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
                //System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
            }
            System.out.println("el discriminante (b*2-4(ac) es " + discriminante);
        }

    }

    public int ValorAbsoluto(int numero) {
        return (numero > 0) ? numero : numero * -1;
    }

}
