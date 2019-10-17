/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota=6;
        double acumulador=0;
        Scanner teclado= new Scanner(System.in);
        do{
               if(nota>=0 && nota<=10){
                   System.out.println("Introduce tu nota de asignatura");
            double notas = teclado.nextDouble();
            nota--;
            acumulador+=notas;
                   
               }
        }while(nota>0);
          double media=acumulador/6;
          System.out.printf("Tu media de notas es  %.2f",media);
        
     }
    
}
