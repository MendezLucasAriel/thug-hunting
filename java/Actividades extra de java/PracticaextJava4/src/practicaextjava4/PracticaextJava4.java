/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaextjava4;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticaextJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner impr = new Scanner(System.in);
       int numero;
               
       do{
       System.out.println("Ingrese un numero entre 1 y 10");
       numero = impr.nextInt();
       }while (numero >10 || numero < 1); 
       switch(numero){
           case 1:
               System.out.println(" I ");
               break;
           case 2:
               System.out.println(" II ");
               break;
           case 3:
               System.out.println(" III ");
               break;
           case 4:
               System.out.println(" IV ");
               break;
               
            case 5:
               System.out.println(" V ");
               break;
            case 6:
               System.out.println(" VI ");
               break;
               
             case 7:
               System.out.println(" VII ");
               break;
             case 8:
               System.out.println(" VIII ");
               break;
            case 9:
               System.out.println(" IX ");
               break;
               
               
            case 10:
               System.out.println(" X ");
               break;
       
       
       
       }
    }
    
}
