
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio1Do {
    static Scanner teclado = new Scanner(System.in);
    static double acumulador = 0;
    public static void main(String[] args) {
        double num1=0;
        do{
             System.out.println("Dame numeros por favor");
             num1= teclado.nextDouble();        
             acumulador+=num1;
         }while( num1 != 0);
               
                System.out.printf
        ("La suma de los numeros es %.2f",acumulador);
    }
      
    }

