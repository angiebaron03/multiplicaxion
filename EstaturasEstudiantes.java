/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estaturasestudiantes;
import java.util.Scanner;
/**
 *
 * @author ANGIE  BARON
 */
public class EstaturasEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] estaturas = new float[25];
        System.out.println("Ingrese la altura de 25 estudiantes en cm");
        
        for (int i = 0; i < 25; i++) {
            System.out.print("Altura del estudiante " + (i + 1) + ": ");
            estaturas[i] = scanner.nextFloat();
        }

        float estaturaMasAlta = Float.MIN_VALUE;
        float estaturaMasBaja = Float.MAX_VALUE;

        for (float estatura : estaturas) {
            if (estatura > estaturaMasAlta) {
                estaturaMasAlta = estatura;
            }
            if (estatura < estaturaMasBaja) {
                estaturaMasBaja = estatura;
            }
        }

        System.out.println("La estatura más alta de la clase es: " + estaturaMasAlta);
        System.out.println("La estatura más baja de la clase es: " + estaturaMasBaja);
    }
}