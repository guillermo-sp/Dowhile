
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
public class Ejercicio2Do {
    public static void main(String[] args) {
        int multiplicando = 1;
        Scanner teclado=new Scanner(System.in);
        System.out.println("DAME UN NUMERO");
        int num1= teclado.nextInt();
        System.out.println("DAME EL NUMERO 2");
        int num2= teclado.nextInt();
       
        do{
            int multiplicacion=num2*multiplicando;
            if(num1%multiplicacion ==0){
                System.out.printf("El numero %d es mcm %n",multiplicando);
                break;
            }
                    
            multiplicando++;
    }while(multiplicando<101);
        
    
        
        
    }
}
